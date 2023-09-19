package com.buildingmgmnt.Edificios.controllers;

import com.buildingmgmnt.Edificios.models.Edificios;
import com.buildingmgmnt.Edificios.services.EdificiosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/edificiosservice")
public class EdificiosController {
    @Autowired
    private EdificiosServiceImpl edificiosService;

    @PostMapping
    public ResponseEntity<?> saveEdificios(@RequestBody Edificios edificios){
        return new ResponseEntity<>(edificiosService.saveEdificios(edificios), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getAllEdificios(){
        return ResponseEntity.ok(edificiosService.findAllEdificios());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEdificio(@PathVariable int id){
        edificiosService.deleteEdificios(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getEdificioById(@PathVariable int id){
        return ResponseEntity.ok(edificiosService.getEdificioById(id));
    }
}
