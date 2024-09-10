//Gabriel Joaquim e João Victor

package br.com.etechoracio.estudos.service;

import br.com.etechoracio.estudos.entity.Monitor;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.etechoracio.estudos.repository.MonitorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository repository;
    public List<Monitor> listar() {return repository.findAll();}

    public Monitor cadastraMonitor(Monitor monitor){return repository.save(monitor);}
}
