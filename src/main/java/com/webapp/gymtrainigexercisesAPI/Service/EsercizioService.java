package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Esercizio;

import java.util.List;

public interface EsercizioService {

    public List<Esercizio> getAllEsercizi();
    public Esercizio getEsercizioById(int idEsercizio);
    public List<Esercizio> getEserciziByTpAllenamento(int tpAllenamento);
    public List<Esercizio> getEserciziPerIdZona(int idZona);
    public List<Esercizio> getEserciziPerZona();

}
