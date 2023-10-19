package com.example.u3_aml.controller;

import com.example.u3_aml.data.DataEstudiantes;
import com.example.u3_aml.model.Estudiante;
import com.example.u3_aml.service.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EstudianteControlador {
    @Autowired
    private EstudianteServicio servicio;

    @GetMapping("/")
    public String listarEstudiantes(Model model) {
        List<Estudiante> estudiantes = servicio.obtenerListaEstudiantes();
        model.addAttribute("listaEstudiantes", estudiantes);
        model.addAttribute("nombre", "");
        return "templateEstudiantes";
    }

    @GetMapping("/buscarEstudiantes")
    public String buscarEstudiantes(@RequestParam("nombre") String nombre, Model model) {
        List<Estudiante> listaFiltrada = servicio.buscarEstudiantes(nombre);

        if (listaFiltrada.isEmpty()) {
            System.out.println("No se encontraron estudiantes con el nombre: " + nombre);
        } else {
            for (Estudiante e : listaFiltrada) {
                System.out.println(e.toString());
            }
        }

        model.addAttribute("listaEstudiantes", listaFiltrada);
        return "templateEstudiantes";
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
