//Gabriel Joaquim
//João Victor

package br.com.etechoracio.estudos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISPONIBILIDADE")
    private long id;

    @Column(name = "TX_DIA_SEMANA", columnDefinition = "varchar")
    private String diaSemana;

    @Column(name = "DT_DAS", columnDefinition = "datetime")
    private LocalDateTime dtDas;

    @Column(name = "DT_ATE", columnDefinition = "datetime")
    private LocalDateTime dtAte;


}
