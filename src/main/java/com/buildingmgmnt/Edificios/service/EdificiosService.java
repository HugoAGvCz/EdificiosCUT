package com.buildingmgmnt.Edificios.service;

import com.buildingmgmnt.Edificios.model.Edificios;

import java.util.List;

public interface EdificiosService {
    Edificios saveEdificios(Edificios edificios);

    List<Edificios> findAllEdificios();

    Edificios getEdificioById(int id);

    List<Edificios> getEdificiosByNombre(String nombre);

    Edificios updateEdificios(Edificios edificios, int id);
    void deleteEdificios(int id);

}
