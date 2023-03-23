package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Allenamento;
import com.webapp.gymtrainigexercisesAPI.Repository.AllenamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AllenamentoServiceImpl implements AllenamentoService{

    @Autowired
    AllenamentoRepository allenamentoRepository;


    @Override
    public Allenamento getAllenamentoById(int idAllenamento){
        Allenamento result = null;
        Optional optional= allenamentoRepository.findById(idAllenamento);
        if(optional.isPresent())
            result = (Allenamento) optional.get();
        return result;

    }

    @Override
    public List<Allenamento> getAllAllenamenti() {
        List<Allenamento> result = new ArrayList<>();
        result = (List<Allenamento>) allenamentoRepository.findAll();
        return result;
    }

    @Override
    public Allenamento inserisciNuovoAllenamento(Allenamento allenamento) {
        System.out.println("Metodo invocato");
        if(allenamento!=null){
            if(!allenamentoRepository.existsById(allenamento.getId())){
              return allenamentoRepository.save(allenamento);
            }
        }

        return allenamento;
    }

    @Override
    public void updateAllenamento(Allenamento allenamento) {

    }

    @Override
    public void deleteAllenamento(int idAllenamento) {

    }
}
