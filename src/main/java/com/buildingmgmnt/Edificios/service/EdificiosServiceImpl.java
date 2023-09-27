package com.buildingmgmnt.Edificios.service;

import com.buildingmgmnt.Edificios.model.Edificios;
import com.buildingmgmnt.Edificios.repository.EdificiosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class EdificiosServiceImpl implements EdificiosService{
    private final EdificiosRepository repository;
    public EdificiosServiceImpl(EdificiosRepository repository) {
        this.repository = repository;
    }

    @Override
    public Edificios saveEdificios(Edificios edificios){
        return repository.save(edificios);
    }
    @Override
    public List<Edificios> findAllEdificios(){
        return repository.findAll();
    }
    @Override
    public Edificios getEdificioById(int id){
        Optional<Edificios> edificiosOptional = this.repository.findById(id);
        if (!edificiosOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El registro especificado no existe.");
        }
        return repository.findById(id).get();
    }
    @Override
    public void updateEdificios(Edificios edificios, int id){
        Optional<Edificios> edificiosOptional = this.repository.findById(id);
        if (!edificiosOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El registro especificado no existe.");
        }
        Edificios edificioUPD = edificiosOptional.get();
        edificioUPD.setNombre(edificios.getNombre());
        repository.save(edificioUPD);
    }
    @Override
    public void deleteEdificios(int id){
        Optional<Edificios> edificiosOptional = this.repository.findById(id);
        if (!edificiosOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El registro especificado no existe.");
        }
        repository.deleteById(id);
    }

}
