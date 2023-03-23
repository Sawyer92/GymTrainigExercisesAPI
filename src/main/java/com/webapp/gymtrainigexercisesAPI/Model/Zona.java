package com.webapp.gymtrainigexercisesAPI.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "zona")
public class Zona {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_zona")
    private int id;
    @Column(name = "nome_zona")
    private String nomeZona;
    //@JsonBackReference


    @Override
    public String toString(){
        return "id"+"=" + this.id + ", nomeZona= "+ this.nomeZona ;
    }

    private String getListaEsercizi(List<Esercizio> listaEsercizi){
        String result = "";
        for(int i=0; i<listaEsercizi.size(); i++){
            result.concat("{"+'\''+
                    "idEsercizio :"+ String.valueOf(listaEsercizi.get(i).getId_esercizio())+'\''
            +"nomeEsercizio :"+listaEsercizi.get(i).getNomeEsercizio()+'\''+"},"
            );
        }
        return result;
    }

}
