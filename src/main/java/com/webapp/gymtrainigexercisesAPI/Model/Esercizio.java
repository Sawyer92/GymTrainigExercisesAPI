package com.webapp.gymtrainigexercisesAPI.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "esercizio")
public class Esercizio {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_esercizio")
    private int id_esercizio;
    @Column(name="nome_esercizio")
    private String nomeEsercizio;

    @Override
    public String toString() {
        return  "id: " + id_esercizio +
                ", nomeEsercizio: " + nomeEsercizio + '\''

        ;
    }

    private String getNomeZone(List<Zona> zone){
        String result = "[";
        for(int i=0; i<zone.size(); i++){
            result.concat("{[" +
                    "idZona: "+zone.get(i).getId()
                    +", nomeZona: "+zone.get(i).getNomeZona()
                    +"]}");
        }
        result.concat("]");
        return result;
    }
}
