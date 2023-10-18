package com.buildingmgmnt.Edificios.service;

import com.buildingmgmnt.Edificios.model.Edificios;
import com.buildingmgmnt.Edificios.repository.EdificiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class EdificiosServiceImpl implements EdificiosService{
    private final EdificiosRepository repository;
    @Autowired
    public EdificiosServiceImpl(EdificiosRepository repository) {
        this.repository = repository;
    }

    @Override
    public Edificios saveEdificios(Edificios edificios){
        if(repository.existsByNombre(edificios.getNombre())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Ya existe un registro con este nombre.");
        }
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
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El registro no existe.");
        }
        return repository.findById(id).get();
    }
    @Override
    public List<Edificios> getEdificiosByNombre(String nombre){
        List<Edificios> edificiosList = repository.getEdificioByNombre(nombre);

        if (edificiosList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El nombre del registro no existe.");
        }
        return edificiosList;
    }
    @Override
    public void updateEdificios(Edificios edificios, int id){
        Optional<Edificios> edificiosOptional = this.repository.findById(id);

        if (!edificiosOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El registro no existe.");
        }
        if(repository.existsByNombreAndIdIsNot(edificios.getNombre(), id)){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Ya existe un registro con este nombre.");
        }
        Edificios edificioUPD = edificiosOptional.get();
        edificioUPD.setNombre(edificios.getNombre());
        repository.save(edificioUPD);
    }
    @Override
    public void deleteEdificios(int id){
        Optional<Edificios> edificiosOptional = this.repository.findById(id);
        if (!edificiosOptional.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El registro no existe.");
        }
        repository.deleteById(id);
    }

}