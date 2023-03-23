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
@Table(name="scheda")
public class Scheda {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_scheda")
    private int id;

    @Column(name="titolo")
    private String titolo;

    @ManyToOne
    User utente;

}
