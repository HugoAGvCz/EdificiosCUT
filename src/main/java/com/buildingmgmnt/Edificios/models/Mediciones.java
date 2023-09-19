package com.buildingmgmnt.Edificios.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.Date;

@Entity
public class Mediciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int Id_Dispositivo;
    private Date Fecha;
    private Time Hora;
    private float Corriente;
    private float Potencia;
    private float Voltaje;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId_Dispositivo() {
        return Id_Dispositivo;
    }

    public void setId_Dispositivo(int id_Dispositivo) {
        Id_Dispositivo = id_Dispositivo;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time hora) {
        Hora = hora;
    }

    public float getCorriente() {
        return Corriente;
    }

    public void setCorriente(float corriente) {
        Corriente = corriente;
    }

    public float getPotencia() {
        return Potencia;
    }

    public void setPotencia(float potencia) {
        Potencia = potencia;
    }

    public float getVoltaje() {
        return Voltaje;
    }

    public void setVoltaje(float voltaje) {
        Voltaje = voltaje;
    }
}
