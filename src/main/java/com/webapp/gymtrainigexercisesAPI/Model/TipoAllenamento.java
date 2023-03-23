package com.webapp.gymtrainigexercisesAPI.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tipo_allenamento")
public class TipoAllenamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name = "nome_allenamento")
    private String nomeAllenamento;


    public String toString(){
        return "TipoAllenamento:" +"id:"+id+", nomeAllenamento= "+nomeAllenamento;
    }
}
