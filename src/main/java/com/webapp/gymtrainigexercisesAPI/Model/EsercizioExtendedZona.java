package com.webapp.gymtrainigexercisesAPI.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class EsercizioExtendedZona extends Esercizio{

    @JsonBackReference
    @ManyToMany(mappedBy = "eserciziList", cascade = CascadeType.ALL)
    private List<ZonaExtended> zone;



}
