package Modelo;

import java.util.ArrayList;

public interface ReportesAlumnos {

    String listarAlumnos(ArrayList<Alumno> info);

    String consultarAlumno(ArrayList<Alumno> info, int codigoDado);

    void ordenarPorCodigo(ArrayList<Alumno> info);

}
