package com.example.u3_aml.service;

import com.example.u3_aml.data.DataEstudiantes;
import com.example.u3_aml.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

@Service
public class EstudianteServicio {
    DataEstudiantes datos = new DataEstudiantes();

    /**
    *  Recupera la lista completa de estudiantes
     * @return Una lista de objetos de estudiante
    * */
    public List<Estudiante> obtenerListaEstudiantes() {
        List<Estudiante> lista = datos.getLista();
        return lista;
    }

    public List<Estudiante> buscarEstudiantes(String nombre) {

        return datos.getLista().stream()
                .filter(e -> e.getNombre().contains(nombre))
                .collect(Collectors.toList());
    }

    public List<Estudiante> filtrarEstudiantes(String curso) {
        List<Estudiante> lista = datos.getLista();
        return lista.stream()
                .filter(e -> e.getCurso().equals(curso))
                .collect(Collectors.toList());
    }

    public double mediaEdad() {
        List<Estudiante> lista = datos.getLista();
        return lista.stream()
                .mapToInt((Estudiante::getEdad))
                .average()
                .orElse(0);
    }

    public List<String> obtenerCursos() {
        List<Estudiante> lista = datos.getLista();
        return lista.stream().map(Estudiante::getCurso).distinct().collect(Collectors.toList());
    }


}
