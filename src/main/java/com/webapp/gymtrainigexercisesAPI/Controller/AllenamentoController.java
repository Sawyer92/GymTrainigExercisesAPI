package com.webapp.gymtrainigexercisesAPI.Controller;

import com.webapp.gymtrainigexercisesAPI.Model.Allenamento;
import com.webapp.gymtrainigexercisesAPI.Service.AllenamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping(path="/api")
public class AllenamentoController {

    @Autowired
    AllenamentoService allenamentoService;

    @PostMapping(consumes = "application/json;charset=UTF-8", path = "/creaAllenamento")
    public void creaNuovoAllenamento(@RequestBody Allenamento allenamento){
        System.out.println("Metodo invocato");
        allenamentoService.inserisciNuovoAllenamento(allenamento);
    }


}
