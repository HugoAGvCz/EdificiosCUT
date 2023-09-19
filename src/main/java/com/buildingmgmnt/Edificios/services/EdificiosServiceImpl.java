package com.buildingmgmnt.Edificios.services;

import com.buildingmgmnt.Edificios.models.Edificios;
import com.buildingmgmnt.Edificios.repositories.EdificiosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public void deleteEdificios(int id){
        repository.deleteById(id);
    }
    @Override
    public Edificios getEdificioById(int id){
        return repository.findById(id).get();
    }

}
