package com.buildingmgmnt.Edificios.services;

import com.buildingmgmnt.Edificios.models.Edificios;

import java.util.List;

public interface EdificiosService {
    Edificios saveEdificios(Edificios edificios);

    List<Edificios> findAllEdificios();

    void deleteEdificios(int id);

    Edificios getEdificioById(int id);
}
