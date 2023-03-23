package com.webapp.gymtrainigexercisesAPI.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "allenamento")
public class Allenamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
    @Column(name = "nome_allenamento")
    private String nomeAllenamento;

    @ManyToMany
    @JoinTable(
            name = "esercizio_has_allenamento"
            , joinColumns = @JoinColumn(name = "allenamento_id", referencedColumnName = "id")
            , inverseJoinColumns = @JoinColumn(name = "esercizio_id_esercizio", referencedColumnName = "id_esercizio")
    )
    private Collection<EsercizioExtendedAllenamento> listaEsercizi;

    @Override
    public String toString() {
        return "id: " + id +
                "nome: " + nomeAllenamento
                //+"}"
                ;

    }

    public int getId() {
        return id;
    }
}