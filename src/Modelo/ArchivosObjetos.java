package modelo;

import java.util.ArrayList;

public interface ArchivosObjetos {

    void almacenarAlumnos(ArrayList<Alumno> info);

    void recuperarAlumnos(ArrayList<Alumno> info);

    void almacenarAsignaturas(ArrayList<Asignatura> info);

    void recuperarAsignaturas(ArrayList<Asignatura> info);

}
s