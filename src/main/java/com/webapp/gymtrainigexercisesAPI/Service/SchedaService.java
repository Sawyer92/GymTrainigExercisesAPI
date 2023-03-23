package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Scheda;

import java.util.List;

public interface SchedaService {

    public List<Scheda> getAllSchede();

    public Scheda getSchedaById(int id);

   // public List<Scheda> getAllSchedeByIdUtente(int idUtente);


}
