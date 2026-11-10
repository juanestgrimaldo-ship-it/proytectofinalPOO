package Modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Asesoria implements Serializable {

    private Asignatura suAsignatura;
    private String modalidad;
    private LocalDate fecha;
    private int minutos;
    private static final int MINUTOS_UNIDAD_PRESENCIAL = 10;
    private static final int MINUTOS_UNIDAD_VIRTUAL = 5;

    public Asesoria(Asignatura suAsignatura, String modalidad, LocalDate fecha, int minutos) {
        this.suAsignatura = suAsignatura;
        this.modalidad = modalidad;
        this.fecha = fecha;
        this.minutos = minutos;
    }

    public int calcularEsfuerzo() {
        int res = 0;

        if (modalidad.equals("PRESENCIAL")) {
            res = minutos / MINUTOS_UNIDAD_PRESENCIAL;
        } else if (modalidad.equals("VIRTUAL")) {
            res = minutos / MINUTOS_UNIDAD_VIRTUAL;
        }

        return res;
    }

    public Asignatura getSuAsignatura() {
        return suAsignatura;
    }

    public void setSuAsignatura(Asignatura suAsignatura) {
        this.suAsignatura = suAsignatura;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Asesoria{" + "suAsignatura=" + suAsignatura + ", modalidad=" + modalidad + ", fecha=" + fecha + ", minutos=" + minutos + '}';
    }

}
