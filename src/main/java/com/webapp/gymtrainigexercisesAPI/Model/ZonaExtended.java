package com.webapp.gymtrainigexercisesAPI.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ZonaExtended extends Zona{

    @JsonManagedReference
    @ManyToMany
    @JoinTable(name = "esercizio_has_zona"
            ,joinColumns = @JoinColumn(name = "Zona_id_zona" , referencedColumnName = "id_zona")
            ,inverseJoinColumns = @JoinColumn(name = "esercizio_id_esercizio", referencedColumnName = "id_esercizio")
    )
    private List<Esercizio> eserciziList;


}
