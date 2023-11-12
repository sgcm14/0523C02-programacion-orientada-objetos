package preParcial.examenes;

public class Parcial  extends Examen {
    private int numeroUnidad;
    private int intentosRecuperacion;

    public Parcial(Alumno alumno, String titulo, String enunciado, int nota, int numeroUnidad) {
        super(alumno, titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.intentosRecuperacion = 0;
    }

    public boolean esPosibleRecuperar() {
        if (numeroUnidad <= 3) {
            return intentosRecuperacion < 3;
        } else {
            return intentosRecuperacion < 2;
        }
    }

    public int getIntentosRecuperacion() {
        return intentosRecuperacion;
    }

    public void incrementarIntentosRecuperacion() {
        intentosRecuperacion++;
    }
}
