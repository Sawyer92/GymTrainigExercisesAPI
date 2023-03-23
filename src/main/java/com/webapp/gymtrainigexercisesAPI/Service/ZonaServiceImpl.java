package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Esercizio;
import com.webapp.gymtrainigexercisesAPI.Model.Zona;
import com.webapp.gymtrainigexercisesAPI.Model.ZonaExtended;
import com.webapp.gymtrainigexercisesAPI.Repository.ZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class ZonaServiceImpl implements ZonaService {

    @Autowired
    ZonaRepository zonaRepository;

    @Autowired
    EsercizioService esercizioService;

    @Override
    public Zona getZonaById(int id) {
        Zona zona = new Zona();
        Optional optional = zonaRepository.findById(id);
        if(optional.isPresent())
            return zona = (Zona) optional.get();
        return zona;
    }

    @Override
    public List<Zona> getAllZone() {
        return (List<Zona>) zonaRepository.findAll();
    }

    @Override
    public List<Zona> getAllEserciziPerAllZone(){
        List<Zona> zonaList = (List<Zona>) zonaRepository.findAll();
        List<Zona> result = new ArrayList<>();
        List<Esercizio> listaEserciziPerZona = new ArrayList<>();
        //ciclo le zone e prendo gli esercizi
        for(Zona zona : zonaList){
            ZonaExtended zonaToAdd = new ZonaExtended();
            zonaToAdd.setId(zona.getId());
            zonaToAdd.setNomeZona(zona.getNomeZona());
            listaEserciziPerZona= esercizioService.getEserciziPerIdZona(zona.getId());
            zonaToAdd.setEserciziList(listaEserciziPerZona);
            result.add(zonaToAdd);
        }
        return result;
    }

}
