package br.com.etechoracio.estudos.repository;

import br.com.etechoracio.estudos.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}
