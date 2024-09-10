package br.com.etechoracio.estudos.controller;

import br.com.etechoracio.estudos.entity.Disciplina;
import br.com.etechoracio.estudos.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //infroma que a classe é um event listener
@RequestMapping("/disciplinas")  //busca elementos (no caso disciplinas) no repositório DisciplinaRepository
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    @GetMapping //vai rodar esse código quando der get
    public List<Disciplina> listar(){
        return service.listar();
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return service.cadastrarDisciplina(disciplina);
    }
}
