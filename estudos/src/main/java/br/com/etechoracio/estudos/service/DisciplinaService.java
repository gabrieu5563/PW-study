package br.com.etechoracio.estudos.service;
//Gabriel Joaquim e Joao Victor
import br.com.etechoracio.estudos.entity.Disciplina;
import br.com.etechoracio.estudos.repository.DisciplinaRepository;
import br.com.etechoracio.estudos.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;
    @Autowired
    private MonitorRepository monitorRepository;
    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Optional<Disciplina> buscarPorId(Long id){
        return repository.findById(id);
    }
    public Disciplina cadastrarDisciplina(Disciplina disciplina){
        var existe = repository.findByNome(disciplina.getNome());
        if (!existe.isEmpty()){
            throw new RuntimeException("Disciplina ja cadastrada"); //exception retorna codigo 500
        }
        return repository.save(disciplina);
    }

    public void excluir(Long id){
        var busca = new Disciplina();
        busca.setId(id);
        var existe = monitorRepository.findByDisciplina(busca);
        if(!existe.isEmpty()){
            throw new RuntimeException("Monitor com a Disciplina ocupada");
        } else {
            repository.deleteById(id);
        }
    }

    public Disciplina update(Disciplina disciplina){
       return repository.save(disciplina);
    }
}
