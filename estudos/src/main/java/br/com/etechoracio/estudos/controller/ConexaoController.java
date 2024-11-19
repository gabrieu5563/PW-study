//Gabriel Joaquim
//João Victor

package br.com.etechoracio.estudos.controller;

import br.com.etechoracio.estudos.service.ConexaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/conexoes")
public class ConexaoController {

    @Autowired
    private ConexaoService conexaoService;
    @GetMapping("/count")
    public ResponseEntity<Integer> getconexoes(){
        return ResponseEntity.status(HttpStatus.OK).body(conexaoService.getconexoes());
    }
}
