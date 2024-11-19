//Gabriel Joaquim
//João Victor
package br.com.etechoracio.estudos.service;

import br.com.etechoracio.estudos.repository.ConexaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConexaoService {
    @Autowired
    private ConexaoRepository conexaoRepository;
    public Integer getconexoes(){
        return conexaoRepository.findAll().size();
    }
}
