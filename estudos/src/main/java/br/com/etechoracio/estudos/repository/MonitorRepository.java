package br.com.etechoracio.estudos.repository;

import br.com.etechoracio.estudos.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
    List<Monitor> findByWhatsapp(String whatsapp);
    List<Monitor> findByEmail(String email);
}
