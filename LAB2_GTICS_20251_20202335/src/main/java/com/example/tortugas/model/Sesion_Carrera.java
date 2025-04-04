package com.example.tortugas.model;

import java.util.Random;

public class Sesion_Carrera {
    private Configuracion_Carrera configuracion;
    private String mensajeResultado;
    private Tortuga[] tortugas;

    public Sesion_Carrera(Configuracion_Carrera configuracion) {
        this.configuracion = configuracion;
        this.tortugas = new Tortuga[] { new Tortuga(configuracion.getNombreTortuga(), 10, 5, 2) };
    }

    public void ejecutarCarrera() {
        Random rand = new Random();
        for (Tortuga tortuga : tortugas) {
            double rendimiento = (tortuga.getVelocidad() * 1.5) + (tortuga.getResistencia() * 1.2) + (rand.nextDouble() * tortuga.getSuerte());
            tortuga.setPosicion(rendimiento);
        }

        Tortuga ganadora = tortugas[0];
        this.mensajeResultado = ganadora.getNombre() + " GANO LA CARRERA!FELICIDADES!";
    }

    public String getMensajeResultado() {
        return mensajeResultado;
    }

    public void setMensajeResultado(String mensajeResultado) {
        this.mensajeResultado = mensajeResultado;
    }

    public Tortuga[] getTortugas() {
        return tortugas;
    }

    public void setTortugas(Tortuga[] tortugas) {
        this.tortugas = tortugas;
    }
}
