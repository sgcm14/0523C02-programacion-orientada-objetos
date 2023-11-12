package preParcial.examenes;

public class Examen {
    protected Alumno alumno;
    protected String titulo;
    protected String enunciado;
    protected int nota;

    public Examen(Alumno alumno, String titulo, String enunciado, int nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public boolean estaAprobado() {
        return nota >= 4;
    }
}
