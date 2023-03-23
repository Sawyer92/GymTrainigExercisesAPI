package com.webapp.gymtrainigexercisesAPI.Controller;


import com.webapp.gymtrainigexercisesAPI.Model.Esercizio;
import com.webapp.gymtrainigexercisesAPI.Model.Zona;
import com.webapp.gymtrainigexercisesAPI.Service.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@EnableAutoConfiguration
@RequestMapping(path="/api")
public class ZonaController {
    @Autowired
    ZonaService zonaService;

    @GetMapping(path = "/getAllZone")
    public List<Zona> getAllZone() {
        return zonaService.getAllZone();
    }

    @GetMapping(path = "/getZonaById")
    public Zona getZonaById(@RequestParam int idZona) {
        return zonaService.getZonaById(idZona);
    }

    /*
    @GetMapping(path = "/getAllEserciziPerAllZone")
    public Map<Zona, List<Esercizio>> getAllEserciziPerAllZone(){return  zonaService.getAllEserciziPerAllZone();}
     */
    @GetMapping(path = "/getAllEserciziPerAllZone")
    public List<Zona> getAllEserciziPerAllZone(){return  zonaService.getAllEserciziPerAllZone();}


}