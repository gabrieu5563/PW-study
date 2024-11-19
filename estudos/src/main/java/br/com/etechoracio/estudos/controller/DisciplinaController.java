package br.com.etechoracio.estudos.controller;

import br.com.etechoracio.estudos.entity.Disciplina;
import br.com.etechoracio.estudos.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarPorId(@PathVariable Long id){ //pega a variável do endpoint  faz com que o java possa manipular ela
        var existe = service.buscarPorId(id);
        if(existe.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            //return ResponseEntity.notFount().build()
            // ,build() formata a resposta
        }else{
            return ResponseEntity.ok(existe.get());
            //              .ok = 200  existe.get vai tirar o resultado de dentro da caixa
        }
        //return service.buscarPorId(id).map(e-> ResponseEntity.ok(e))
                                      //.orElse(ResponseEntity.notFound().build())
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Disciplina> excluir(@PathVariable Long id){
        var existe = service.buscarPorId(id);
        if(existe.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            service.excluir(id);
            return ResponseEntity.ok().build();
        }
    }
    @PostMapping
    public Disciplina cadastrar(@RequestBody Disciplina disciplina){
        return service.cadastrarDisciplina(disciplina);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Disciplina> update(@PathVariable Long id, @RequestBody Disciplina disciplina){
        var existe = service.buscarPorId(id);
            if (existe.isEmpty()){
                return ResponseEntity.notFound().build();
            }
            var atualizado = service.update(disciplina);
            return ResponseEntity.ok(atualizado);
        }
    }


