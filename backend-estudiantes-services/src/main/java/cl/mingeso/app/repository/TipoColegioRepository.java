package cl.mingeso.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.mingeso.app.entity.TipoColegioEntity;

public interface TipoColegioRepository extends JpaRepository<TipoColegioEntity, Integer> {
    @Query("select e from TipoColegioEntity e where e.tipo = :tipo")
    TipoColegioEntity findByTipo(@Param("tipo") String tipo);
}
