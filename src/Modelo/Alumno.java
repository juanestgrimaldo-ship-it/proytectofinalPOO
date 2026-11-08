package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Alumno implements Serializable {

    protected int codigo;
    protected String nombre;
    protected ArrayList<Asesoria> susAsesorias;

    public Alumno(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.susAsesorias = new ArrayList<Asesoria>();
    }

    public int adicionarAsesoria(Asesoria nvaAsesoria) {
        int res;

        susAsesorias.add(0, nvaAsesoria);
        res = nvaAsesoria.calcularEsfuerzo();

        return res;
    }

    public int calcularMinutos() {
        int res = 0;

        for (Asesoria a : susAsesorias) {
            res = res + a.getMinutos();
        }

        return res;
    }

    public abstract String calcularAprovechamiento();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asesoria> getSusAsesorias() {
        return susAsesorias;
    }

    public void setSusAsesorias(ArrayList<Asesoria> susAsesorias) {
        this.susAsesorias = susAsesorias;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", susAsesorias=" + susAsesorias + '}';
    }

}
