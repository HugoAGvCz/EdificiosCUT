package com.buildingmgmnt.Edificios.repository;

import com.buildingmgmnt.Edificios.model.Edificios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EdificiosRepository extends JpaRepository<Edificios, Integer> {
    boolean existsById(int id);
    boolean existsByNombreAndIdIsNot(String nombre, int id);
    boolean existsByNombre(String nombre);
    List<Edificios> getEdificioByNombre(String nombre);
}
