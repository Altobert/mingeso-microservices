package cl.mingeso.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.mingeso.app.entity.TipoColegioEntity;
import cl.mingeso.app.repository.TipoColegioRepository;

@Service
public class TipoColegioService {
    @Autowired
    TipoColegioRepository tipoColegioRepository;

    public TipoColegioEntity findByTipo(String tipo){
        TipoColegioEntity tipoColegioEntity = tipoColegioRepository.findByTipo(tipo);
        return tipoColegioEntity;
    }
}
