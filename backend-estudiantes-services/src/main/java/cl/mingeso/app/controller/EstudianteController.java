package cl.mingeso.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.mingeso.app.entity.EstudianteEntity;
import cl.mingeso.app.service.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @PostMapping()
    public ResponseEntity<EstudianteEntity> newEstudiante(@RequestBody EstudianteEntity estudiante) {
        /*
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate NewFechaNacimiento = LocalDate.parse(fecha_nacimiento, formato);
        LocalDate NewAnioEgreso = LocalDate.parse(anio_egreso, formato);
        System.out.println(rut + "  " + nombres + "  " + apellidos + "  " + fecha_nacimiento + "  " + tipo_colegio + "  " + nombre_colegio + "  " + anio_egreso);
        int idTipoColegio = estudianteService.findIdByTipo(tipo_colegio);
        LocalDate anio_ingreso = LocalDate.now();
        EstudianteEntity estudianteEntity = new EstudianteEntity(rut, nombres, apellidos, NewFechaNacimiento, idTipoColegio, nombre_colegio, NewAnioEgreso, anio_ingreso);
        estudianteService.save(estudianteEntity);
        return ResponseEntity.ok(estudianteEntity);
         */
        LocalDate anio_ingreso = LocalDate.now();
        estudiante.setAnio_ingreso(anio_ingreso);
        estudianteService.save(estudiante);
        return ResponseEntity.ok(estudiante);
    }

    @GetMapping("/")
    public ResponseEntity<List<EstudianteEntity>> listar() {
        List<EstudianteEntity> estudianteEntities = estudianteService.findAll();
        return ResponseEntity.ok(estudianteEntities);
    }

    @GetMapping("/{rut}")
    public ResponseEntity<EstudianteEntity> findByRut(@PathVariable("rut") String rut) {
        EstudianteEntity estudianteEntity = estudianteService.findByRut(rut);
        System.out.println(estudianteEntity);
        return ResponseEntity.ok(estudianteEntity);
    }
}
