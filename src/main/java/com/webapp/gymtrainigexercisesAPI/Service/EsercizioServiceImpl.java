package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Allenamento;
import com.webapp.gymtrainigexercisesAPI.Model.Esercizio;
import com.webapp.gymtrainigexercisesAPI.Model.Zona;
import com.webapp.gymtrainigexercisesAPI.Repository.EsercizioRepository;
import com.webapp.gymtrainigexercisesAPI.Repository.ZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EsercizioServiceImpl implements EsercizioService{

    @Autowired
    EsercizioRepository esercizioRepository;
    @Autowired
    ZonaRepository zonaRepository;
    @Override
    public List<Esercizio> getAllEsercizi() {
        return (List<Esercizio>) esercizioRepository.findAll();
    }

    @Override
    public Esercizio getEsercizioById(int idEsercizio) {
        Esercizio esercizio = new Esercizio();
        Optional op = esercizioRepository.findById(idEsercizio);
        if(op.isPresent())
            return esercizio = (Esercizio) op.get();

        return esercizio;
    }

    @Override
    public List<Esercizio> getEserciziByTpAllenamento(int tpAllenamento) {
        List<Esercizio> listaResult = new ArrayList<>();
        List<Esercizio> eserciziList = getAllEsercizi();
        for(Esercizio e : eserciziList){
            if (e.getTipoAllenamento()==tpAllenamento){
                listaResult.add(e);
            }
        }
        return listaResult;
    }

    public List<Esercizio> getEserciziPerIdZona(int idZona){
        List<Esercizio> listaResult = new ArrayList<>();
        List<Esercizio> eserciziList = getAllEsercizi();
        for(Esercizio e : eserciziList){
            if (e.getIdZona()==idZona){
                listaResult.add(e);
            }
        }
        return listaResult;
    }

    @Override
    public List<Esercizio> getEserciziPerZona() {
        List<Zona> zoneDisponibili = new ArrayList<>();
        List<Esercizio> eserciziDisponibili = new ArrayList<>();
        List<Esercizio> result = new ArrayList<>();
        zoneDisponibili = (List<Zona>) zonaRepository.findAll();
        for(Zona zona : zoneDisponibili){
            eserciziDisponibili = getEserciziPerIdZona(zona.getId());
            result.addAll(eserciziDisponibili);
        }
        return result;
    }
}
