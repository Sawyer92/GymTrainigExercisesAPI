package com.webapp.gymtrainigexercisesAPI.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
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
@Table(name = "esercizio")
public class EsercizioExtendedAllenamento extends Esercizio{

    @JsonBackReference
    @ManyToMany(mappedBy ="listaEsercizi", cascade = CascadeType.ALL)
    private Collection<Allenamento> allenamenti;
    //@JsonManagedReference
}
