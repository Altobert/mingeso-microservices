package cl.mingeso.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.mingeso.app.entity.EstudianteEntity;
import cl.mingeso.app.entity.TipoColegioEntity;
import cl.mingeso.app.repository.EstudianteRepository;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    @Autowired
    TipoColegioService tipoColegioService;

    public int findIdByTipo(String tipo){
       TipoColegioEntity tipoColegioEntity = tipoColegioService.findByTipo(tipo);
       return tipoColegioEntity.getId();
    }

    public void save(EstudianteEntity estudianteEntity){
        estudianteRepository.save(estudianteEntity);
    }

    public List<EstudianteEntity> findAll(){
        return estudianteRepository.findAll();
    }

    public EstudianteEntity findByRut(String rut){
        return estudianteRepository.findByRut(rut);
    }

}
