package com.example.ficheros.repositories;

import com.example.ficheros.entities.Fichero;
import com.example.ficheros.models.projections.FicheroProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FicheroRepository extends JpaRepository<Fichero, Long>{
    @Query(value = "select a from #{#entityName} a where a.periodoFactura = ?1")
    List<FicheroProjection> findByPeriodoFactura(int periodoFactura);
}
