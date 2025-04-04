package com.example.tortugas.model;

public class Tortuga {
    private String nombre;
    private double velocidad;
    private double resistencia;
    private double suerte;
    private double posicion;

    public Tortuga(String nombre, double velocidad, double resistencia, double suerte) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.suerte = suerte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getSuerte() {
        return suerte;
    }

    public void setSuerte(double suerte) {
        this.suerte = suerte;
    }

    public double getPosicion() {
        return posicion;
    }

    public void setPosicion(double posicion) {
        this.posicion = posicion;
    }
}
