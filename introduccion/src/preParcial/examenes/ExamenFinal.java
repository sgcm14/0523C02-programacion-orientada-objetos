package preParcial.examenes;

public class ExamenFinal extends Examen implements ComparadorExamenFinal {
    private int notaOral;
    private String descripcionTemaOral;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, int nota, int notaOral, String descripcionTemaOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionTemaOral = descripcionTemaOral;
    }

    public boolean esMayor(ExamenFinal otroExamen) {
        double promedioThis = (nota + notaOral) / 2.0;
        double promedioOtro = (otroExamen.nota + otroExamen.notaOral) / 2.0;
        return promedioThis > promedioOtro;
    }

}
