package br.com.etechoracio.estudos.service;

import br.com.etechoracio.estudos.entity.Disciplina;
import br.com.etechoracio.estudos.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;
    public List<Disciplina> listar(){
        return repository.findAll();
    }

    public Disciplina cadastrarDisciplina(Disciplina disciplina){
        var existe = repository.findByNome(disciplina.getNome());
        if (!existe.isEmpty()){
            throw new RuntimeException("Disciplina ja cadastrada"); //exception retorna codigo 500
        }
        return repository.save(disciplina);
    }
}
