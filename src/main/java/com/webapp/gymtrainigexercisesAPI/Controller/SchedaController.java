package com.webapp.gymtrainigexercisesAPI.Controller;

import com.webapp.gymtrainigexercisesAPI.Model.Scheda;
import com.webapp.gymtrainigexercisesAPI.Service.SchedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping(path="/api")
public class SchedaController {

    @Autowired
    SchedaService schedaService;

    @GetMapping(path = "/getAllSchede")
    public List<Scheda> listaSchede(){
        return schedaService.getAllSchede();
    }

    @GetMapping(path = "/getSchedaById")
    public Scheda ottieniSchedaById(@RequestParam int idScheda){
        return schedaService.getSchedaById(idScheda);
    }

    /*
    @GetMapping(path = "/getSchedaByIdUser")
    public List<Scheda> ottieniSchedaByIdUser(@RequestParam int idUser){
        return schedaService.getAllSchedeByIdUtente(idUser);
    }

     */
}
