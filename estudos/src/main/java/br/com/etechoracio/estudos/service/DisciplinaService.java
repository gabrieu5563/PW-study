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
}
