package modelo;

public class AlumnoSinPrueba extends Alumno {

    private int semestre;
    private static final int UMBRAL_ASESORIAS = 1;

    public AlumnoSinPrueba(int semestre, int codigo, String nombre) {
        super(codigo, nombre);
        this.semestre = semestre;
    }

    @Override
    public String calcularAprovechamiento() {
        String res = "NO";

        if (susAsesorias.size() > UMBRAL_ASESORIAS) {
            res = "BUENO";
        }

        return res;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + " AlumnoSinPrueba{" + "semestre=" + semestre + '}';
    }

}
