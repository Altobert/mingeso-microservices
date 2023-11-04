package cl.mingeso.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.mingeso.app.entity.CuotasEntity;
import cl.mingeso.app.entity.EstudianteEntity;
import cl.mingeso.app.service.CuotasService;

@RestController
@RequestMapping("/cuotas")
public class CuotasController {

    @Autowired
    CuotasService cuotasService;

    @GetMapping("/{rut}/{cuotas}")
    public ResponseEntity<List<CuotasEntity>> cuotas(@PathVariable("rut") String rut, @PathVariable("cuotas") String cuotas){
        EstudianteEntity estudianteEntity = cuotasService.findByRut(rut);
        System.out.println(estudianteEntity);
        if(estudianteEntity != null){
            if(cuotasService.findCuotaByRut(estudianteEntity.getRut()).isEmpty()){
                cuotasService.descuentoArancel_generacionCuotas(estudianteEntity, Integer.parseInt(cuotas));
                List<CuotasEntity> cuotasEntities = cuotasService.findCuotaByRut(estudianteEntity.getRut());
                System.out.println(cuotasEntities);
                return ResponseEntity.ok(cuotasEntities);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{rut}")
    public ResponseEntity<List<CuotasEntity>> listado(@PathVariable("rut") String rut){
        System.out.println("Listar");
        System.out.println("rut: "+rut+"\n");
        EstudianteEntity estudianteEntity = cuotasService.findByRut(rut);
        System.out.println(estudianteEntity);
        if(estudianteEntity != null){
            List<CuotasEntity> cuotasEntities = cuotasService.findCuotaByRut(estudianteEntity.getRut());
            return ResponseEntity.ok(cuotasEntities);
        }
        return ResponseEntity.ok(null);
    }
    
}
