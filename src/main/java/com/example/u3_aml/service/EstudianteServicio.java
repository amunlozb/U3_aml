package com.example.u3_aml.service;

import com.example.u3_aml.data.DataEstudiantes;
import com.example.u3_aml.model.Estudiante;

import java.util.List;

public class EstudianteServicio {
    DataEstudiantes datos = new DataEstudiantes();

    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> lista = datos.getLista();

        lista.add(new Estudiante());

        return lista;
    }

}
