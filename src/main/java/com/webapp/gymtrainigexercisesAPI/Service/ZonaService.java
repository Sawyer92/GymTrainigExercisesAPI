package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Zona;

import java.util.List;

public interface ZonaService {

    public Zona getZonaById(int id);

    public List<Zona> getAllZone();

    //public Map<Zona, List<Esercizio>> getAllEserciziPerAllZone();
    public List<Zona> getAllEserciziPerAllZone();

}
