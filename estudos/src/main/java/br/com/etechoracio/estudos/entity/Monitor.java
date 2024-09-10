//Gabriel Joaquim
//João Victor

package br.com.etechoracio.estudos.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.persister.entity.DiscriminatorHelper;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_MONITOR")
public class Monitor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_MONITOR", columnDefinition = "bigint")
    private Long id;

    @Column(name = "TX_NOME", columnDefinition = "varchar")
    private String nome;

    @Column(name = "TX_FOTO", columnDefinition = "varchar")
    private String foto;

    @Column(name = "TX_WHATSAPP", columnDefinition = "varchar")
    private String whatsapp;

    @Column(name = "TX_EMAIL", columnDefinition = "varchar")
    private String email;

    @Column(name = "TX_CONTEUDO", columnDefinition = "varchar")
    private String conteudo;

    @ManyToOne
    @JoinColumn(name = "ID_DISCIPLINA")
    private Disciplina disciplina; //many to one -> o resultado é um elemento só. não usa lista

    @ManyToMany
    @JoinTable(name = "TBL_REL_MONITOR_DISPONIBILIDADE",
            joinColumns = @JoinColumn(name = "ID_MONITOR"),
            inverseJoinColumns = @JoinColumn(name = "ID_DISPONIBILIDADE")
    )
    private List<Disponibilidade> Disponibilidade; // many to many -> resultado sao muitos(many) usa lista

}