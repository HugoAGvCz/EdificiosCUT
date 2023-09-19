package com.buildingmgmnt.Edificios.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dispositivos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String nombreDispositivo;
    private String IP_Asignada;
    private int ubicacionArea;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getIP_Asignada() {
        return IP_Asignada;
    }

    public void setIP_Asignada(String IP_Asignada) {
        this.IP_Asignada = IP_Asignada;
    }

    public int getUbicacionArea() {
        return ubicacionArea;
    }

    public void setUbicacionArea(int ubicacionArea) {
        this.ubicacionArea = ubicacionArea;
    }
}
