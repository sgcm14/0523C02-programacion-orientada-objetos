package herencia.colegio;

public class Profesor extends Persona {
    private int numeroLegajo;
    private String titulo;
    private int antiguedad;

    public Profesor(String nombre, int edad, int numeroLegajo, String titulo, int antiguedad) {
        super(nombre, edad);
        this.numeroLegajo = numeroLegajo;
        this.titulo = titulo;
        this.antiguedad = antiguedad;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void darClases() {
        System.out.println(getNombre() + " está dando clases.");
    }
}
