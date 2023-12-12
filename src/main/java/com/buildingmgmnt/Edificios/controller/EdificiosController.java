package com.buildingmgmnt.Edificios.controller;

import com.buildingmgmnt.Edificios.model.Edificios;
import com.buildingmgmnt.Edificios.service.EdificiosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/edificios")
public class EdificiosController {
    private final EdificiosServiceImpl edificiosService;
    @Autowired
    public EdificiosController(EdificiosServiceImpl edificiosService) {
        this.edificiosService = edificiosService;
    }
    @PostMapping("/save-edificio")
    public ResponseEntity<?> saveEdificios(@RequestBody Edificios edificios){
        return new ResponseEntity<>(edificiosService.saveEdificios(edificios), HttpStatus.CREATED);
    }
    @GetMapping("/get-all")
    public ResponseEntity<?> getAllEdificios(){
        return ResponseEntity.ok(edificiosService.findAllEdificios());
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getEdificioById(@PathVariable int id){
        return ResponseEntity.ok(edificiosService.getEdificioById(id));
    }
    @GetMapping("/getByNombre/{nombre}")
    public ResponseEntity<?> getEdificiosByNombre(@PathVariable String nombre){

        return ResponseEntity.ok(edificiosService.getEdificiosByNombre(nombre));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateEdificio(@RequestBody Edificios edificios, @PathVariable int id){
        edificiosService.updateEdificios(edificios, id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEdificio(@PathVariable int id){
        edificiosService.deleteEdificios(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
