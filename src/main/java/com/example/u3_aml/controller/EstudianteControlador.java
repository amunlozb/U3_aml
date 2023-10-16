package com.example.u3_aml.controller;

import com.example.u3_aml.data.DataEstudiantes;
import com.example.u3_aml.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EstudianteControlador {

    @GetMapping("/listarEstudiantes")
    public List<Estudiante> listarEstudiantes() {
        DataEstudiantes datos = new DataEstudiantes();

        return (datos.getLista());
    }

    @GetMapping("/buscarEstudiantes")
    public List<Estudiante> buscarEstudiantes() {
        DataEstudiantes datos = new DataEstudiantes();

        return (datos.getLista());
    }

    @GetMapping("/filtrarEstudiantes")
    public List<Estudiante> filtrarEstudiantes() {
        DataEstudiantes datos = new DataEstudiantes();

        return (datos.getLista());
    }

    @GetMapping("/promedioEstudiantes")
    public Double promedioEstudiantes() {
        DataEstudiantes datos = new DataEstudiantes();
        Double promedio = null;

        return promedio;
    }

    @GetMapping("/crearEstudiante")
    public void crearEstudiante() {
        DataEstudiantes datos = new DataEstudiantes();
        Double promedio = null;

    }


}
