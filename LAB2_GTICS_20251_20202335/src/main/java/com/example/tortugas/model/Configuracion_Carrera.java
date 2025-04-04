package com.example.tortugas.model;

public class Configuracion_Carrera {
    private String nombreTortuga;
    private double montoApuesta;
    private String pista;

    // Métodos getters y setters
    public String getNombreTortuga() {
        return nombreTortuga;
    }

    public void setNombreTortuga(String nombreTortuga) {
        this.nombreTortuga = nombreTortuga;
    }

    public double getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(double montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }
}
