package com.webapp.gymtrainigexercisesAPI.Service;

import com.webapp.gymtrainigexercisesAPI.Model.TipoAllenamento;
import com.webapp.gymtrainigexercisesAPI.Repository.TipoAllenamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TipoAllenamentoServiceImpl implements TipoAllenamentoService{

    @Autowired
    TipoAllenamentoRepository tipoAllenamentoRepository;

    @Override
    public List<TipoAllenamento> getAllTipoAllenamento() {
        return (List<TipoAllenamento>) tipoAllenamentoRepository.findAll();
    }
}
