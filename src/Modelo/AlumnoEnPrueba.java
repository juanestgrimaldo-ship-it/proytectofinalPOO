package modelo;

public class AlumnoEnPrueba extends Alumno {

    private double promedio;
    private static final int UMBRAL_MINUTOS = 50;

    public AlumnoEnPrueba(double promedio, int codigo, String nombre) {
        super(codigo, nombre);
        this.promedio = promedio;
    }

    @Override
    public String calcularAprovechamiento() {
        String res = "MEJORABLE";

        if (calcularMinutos() > UMBRAL_MINUTOS) {
            res = "BUENO";
        }

        return res;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + " AlumnoEnPrueba{" + "promedio=" + promedio + '}';
    }

}
