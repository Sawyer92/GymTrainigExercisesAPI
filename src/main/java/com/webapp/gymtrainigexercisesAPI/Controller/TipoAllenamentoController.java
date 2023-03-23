package com.webapp.gymtrainigexercisesAPI.Controller;

import com.webapp.gymtrainigexercisesAPI.Model.TipoAllenamento;
import com.webapp.gymtrainigexercisesAPI.Repository.TipoAllenamentoRepository;
import com.webapp.gymtrainigexercisesAPI.Service.TipoAllenamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping(path="/api")
public class TipoAllenamentoController {
@Autowired
    TipoAllenamentoService tipoAllenamentoService;
@GetMapping(path="/getTipoAllenamento")
    public List<TipoAllenamento> listaCompletaTipoAllamento(){
        return tipoAllenamentoService.getAllTipoAllenamento();
}
}
