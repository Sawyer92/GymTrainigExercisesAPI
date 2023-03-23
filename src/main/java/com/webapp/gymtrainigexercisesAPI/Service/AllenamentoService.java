package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Allenamento;

import java.util.List;

public interface AllenamentoService {

    public Allenamento getAllenamentoById(int idAllenamento);

    public List<Allenamento> getAllAllenamenti();
    public Allenamento inserisciNuovoAllenamento(Allenamento allenamento);
    public void updateAllenamento(Allenamento allenamento);
    public void deleteAllenamento(int idAllenamento);
}
