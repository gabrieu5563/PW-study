//Gabriel Joaquim
//João Victor

package br.com.etechoracio.estudos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISCIPLINA")
public class Disciplina {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISCIPLINA", columnDefinition = "bigint")
    @Id
    private Long id;

    @Column(name = "TX_NOME", columnDefinition = "varchar")
    private String nome;

}
