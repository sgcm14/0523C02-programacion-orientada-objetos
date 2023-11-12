package herencia.colegio;

public class Estudiante extends Persona {
    private int numeroLegajo;

    public Estudiante(String nombre, int edad, int numeroLegajo) {
        super(nombre, edad);
        this.numeroLegajo = numeroLegajo;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void estudiar() {
        System.out.println(getNombre() + " está estudiando.");
    }
}
