package com.buildingmgmnt.Edificios.service;

import com.buildingmgmnt.Edificios.model.Edificios;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EdificiosService {
    Edificios saveEdificios(Edificios edificios);

    List<Edificios> findAllEdificios();

    Edificios getEdificioById(int id);

    List<Edificios> getEdificiosByNombre(String nombre);


    void updateEdificios(Edificios edificios, int id);
    void deleteEdificios(int id);

}
