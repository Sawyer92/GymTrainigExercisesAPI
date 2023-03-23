package com.webapp.gymtrainigexercisesAPI.Controller;

import com.webapp.gymtrainigexercisesAPI.Model.Allenamento;
import com.webapp.gymtrainigexercisesAPI.Model.Esercizio;
import com.webapp.gymtrainigexercisesAPI.Service.EsercizioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping(path="/api")
public class EsercizioController {

    @Autowired
    EsercizioService esercizioService;
    @GetMapping(path = "/getListaEsercizi")
    public List<Esercizio> listaEsercizi(){return esercizioService.getAllEsercizi();}
    @GetMapping(path = "/getEsercizio")
    public Esercizio getEsercizioPerId(@RequestParam int idEsercizio){return esercizioService.getEsercizioById(idEsercizio);}

    @GetMapping(path = "/getEserciziByTpAllenamento")
    public List<Esercizio> listaEserciziPerAllenamento(@RequestParam int tpAllenamento){
        return esercizioService.getEserciziByTpAllenamento(tpAllenamento);
    }

    @GetMapping(path = "/getEserciziPerIdZona")
    public List<Esercizio> listaEserciziPerIdZona(@RequestParam int idZona){
        return esercizioService.getEserciziPerIdZona(idZona);
    }

    @GetMapping(path = "/getEserciziPerZone")
    public List<Esercizio> listaEserciziPerZona(){
        return esercizioService.getEserciziPerZona();
    }

}
