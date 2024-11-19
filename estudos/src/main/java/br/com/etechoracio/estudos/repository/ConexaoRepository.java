//Gabriel Joaquim
//João Victor
package br.com.etechoracio.estudos.repository;

import br.com.etechoracio.estudos.entity.Conexao;
import br.com.etechoracio.estudos.entity.Monitor;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Repository
public interface ConexaoRepository extends JpaRepository<Conexao, Long> {

    Optional<Monitor> findByMonitor(Optional monitor);

}
