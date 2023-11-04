package cl.mingeso.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.mingeso.app.entity.CuotasEntity;

@Repository
public interface CuotasRepository extends JpaRepository<CuotasEntity, Integer> {
    @Query("select e from CuotasEntity e where e.rut = :rut and e.estado=true")
    List<CuotasEntity> findCuotaByRut(@Param("rut") String rut);
}
