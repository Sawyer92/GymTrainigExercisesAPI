package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.Allenamento;
import com.webapp.gymtrainigexercisesAPI.Model.Scheda;
import com.webapp.gymtrainigexercisesAPI.Repository.AllenamentoRepository;
import com.webapp.gymtrainigexercisesAPI.Repository.SchedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SchedaServiceImpl implements SchedaService{


    @Autowired
    SchedaRepository schedaRepository;

    @Autowired
    AllenamentoService allenamentoService;

    @Override
    public List<Scheda> getAllSchede() {
        List<Scheda> result = (List<Scheda>) schedaRepository.findAll();
        return  result;

    }

    @Override
    public Scheda getSchedaById(int id) {
        Scheda result = null;
        Optional op = schedaRepository.findById(id);
        if(op.isPresent()){
            result = (Scheda) op.get();
        }
        return result;
    }
/*
    @Override
    public List<Scheda> getAllSchedeByIdUtente(int idUtente) {
        List<Scheda> result = new ArrayList<>();
        List<Scheda> schedeTrovate = getAllSchede();

        for(Scheda scheda : schedeTrovate){
             if(scheda.getUtente().getId()==idUtente){
                result.add(scheda);
            }
        }

        return result;
    }
/*
    public void creaNuovaScheda(int idUtente, Allenamento allenamento){
        //devo controllare se ci sono schede relative all'utente con id idUtente
        //se si, allora aggiugno quell'allenamento alla scheda
        //altrimenti creo una nuova scheda e aggiungo l'allenamento

        List<Scheda> schedePresenti = getAllSchedeByIdUtente(idUtente);
        if(schedePresenti.size()>0){
            //ci sono già allenamenti per quell'utente
            allenamentoService.inserisciNuovoAllenamento(allenamento);
        } else {
            //devo definire una nuova scheda
            Scheda nuovaScheda = new Scheda();
            nuovaScheda.setTitolo();
            nuovaScheda.setUtente();
        }

    }
*/

}
