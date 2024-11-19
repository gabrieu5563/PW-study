package br.com.etechoracio.estudos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_CONEXAO")
public class Conexao {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONEXAO", columnDefinition = "bigint")
    @Id
    private Long id;

    @Column(name = "DT_CRIACAO", columnDefinition = "daterime")
    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "ID_MONITOR")
    private Monitor monitor;

}
