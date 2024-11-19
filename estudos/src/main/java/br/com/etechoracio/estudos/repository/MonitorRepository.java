package br.com.etechoracio.estudos.repository;
//Gabriel Joaquim e Joao Victor

import br.com.etechoracio.estudos.entity.Conexao;
import br.com.etechoracio.estudos.entity.Disciplina;
import br.com.etechoracio.estudos.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
    List<Monitor> findByWhatsapp(String whatsapp);
    List<Monitor> findByEmail(String email);
    Optional<Monitor> findByDisciplina(Disciplina disciplina);

}
