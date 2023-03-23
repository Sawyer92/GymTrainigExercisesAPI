package com.webapp.gymtrainigexercisesAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="utente")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(name = "id_utente")
    private int id;

    @Column(name = "nome")
    private String nomeUtente;
    @Column(name = "cognome")
    private String cognomeUtente;
    @Column(name = "peso")
    private Double peso;
    @Column(name = "data_nascita")
    private Date dataNascita;
    @Column(name = "altezza")
    private Double altezza;
    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String username;




}
