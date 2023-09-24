package com.buildingmgmnt.Edificios.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Edificios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @NonNull
    private String nombre;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
