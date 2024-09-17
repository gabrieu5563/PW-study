package br.com.etechoracio.estudos.repository;

import br.com.etechoracio.estudos.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    //                                         informa qual entidade vai ser alterada e tipo de dado da chave primaria
    //Repository é sempre interface
    List<Disciplina> findByNome(String nome);

}