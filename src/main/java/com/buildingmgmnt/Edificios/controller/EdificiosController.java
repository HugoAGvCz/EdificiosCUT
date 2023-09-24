package com.buildingmgmnt.Edificios.controller;

import com.buildingmgmnt.Edificios.model.Edificios;
import com.buildingmgmnt.Edificios.service.EdificiosServiceImpl;
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
    @GetMapping("/{id}")
    public ResponseEntity<?> getEdificioById(@PathVariable int id){
        return ResponseEntity.ok(edificiosService.getEdificioById(id));
    }
    @PutMapping("/{id}/update")
    public ResponseEntity<?> updateEdificio(@RequestBody Edificios edificios, @PathVariable int id){
        edificiosService.updateEdificios(edificios, id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}/delete")
    public ResponseEntity<?> deleteEdificio(@PathVariable int id){
        edificiosService.deleteEdificios(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
