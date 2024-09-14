//Gabriel Joaquim e João Victor

package br.com.etechoracio.estudos.controller;

import br.com.etechoracio.estudos.entity.Monitor;
import br.com.etechoracio.estudos.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitores")
public class MonitorController {

    @Autowired
    private MonitorService service;

    @GetMapping
    public List<Monitor> listar(){
        return service.listar();
    }

    @PostMapping
    public Monitor cadastrar(@RequestBody Monitor monitor){
        return service.cadastraMonitor(monitor);
    }
}
