package com.example.tortugas.controller;

import com.example.tortugas.model.Configuracion_Carrera;
import com.example.tortugas.model.Sesion_Carrera;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Tortuga_Controlador {

    @GetMapping("/")
    public String mostrarFormularioConfiguracion(Model model) {
        model.addAttribute("configuracionCarrera", new Configuracion_Carrera());
        return "carreraConfiguracion";
    }

    @PostMapping("/iniciar-carrera")
    public String iniciarCarrera(Configuracion_Carrera configuracionCarrera, Model model) {
        Sesion_Carrera sesionCarrera = new Sesion_Carrera(configuracionCarrera);
        sesionCarrera.ejecutarCarrera();

        model.addAttribute("sesionCarrera", sesionCarrera);
        return "carreraResultados";
    }
}
