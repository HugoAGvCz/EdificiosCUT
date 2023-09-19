package com.buildingmgmnt.Edificios.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Edificios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
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

    /*public List<Dispositivos> getDispotivos() {
        return dispotivos;
    }

    public void setDispotivos(List<Dispositivos> dispotivos) {
        this.dispotivos = dispotivos;
    }*/
}
