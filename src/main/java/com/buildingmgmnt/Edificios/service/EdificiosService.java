package com.buildingmgmnt.Edificios.service;

import com.buildingmgmnt.Edificios.model.Edificios;

import java.util.List;

public interface EdificiosService {
    Edificios saveEdificios(Edificios edificios);

    List<Edificios> findAllEdificios();

    Edificios getEdificioById(int id);

    void updateEdificios(Edificios edificios, int id);
    void deleteEdificios(int id);

}
