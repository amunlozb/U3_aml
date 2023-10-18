package com.example.u3_aml.data;

import com.example.u3_aml.model.Curso;
import com.example.u3_aml.model.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class DataEstudiantes {
    private List<Estudiante> lista = new ArrayList<Estudiante>();

    public DataEstudiantes() {

        // Creo 5 estudiantes (mock)

        Estudiante estudiante1 = new Estudiante("Alice", 18, Curso.Primero);
        Estudiante estudiante2 = new Estudiante("Bob", 20, Curso.Segundo);
        Estudiante estudiante3 = new Estudiante("Charlie", 19, Curso.Primero);
        Estudiante estudiante4 = new Estudiante("David", 21, Curso.Segundo);
        Estudiante estudiante5 = new Estudiante("Eve", 22, Curso.Primero);

        // Los añado a la lista de datos

        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(estudiante3);
        lista.add(estudiante4);
        lista.add(estudiante5);
    }

    public List<Estudiante> getLista() {
        return lista;
    }

    public void setLista(List<Estudiante> lista) {
        this.lista = lista;
    }

    public void addEstudiante(Estudiante estudiante) {
        lista.add(estudiante);
    }


}
