package disenio_composite.instituto_sistema;

import java.util.ArrayList;
import java.util.List;

public class Carreras  extends Curso{
    private double costoBasico;
    private List<Curso> cursosYTalleres = new ArrayList<>();

    public Carreras(String nombre, String descripcion, double costoBasico) {
        super(nombre, descripcion, 0, 0, 0);
        this.costoBasico = costoBasico;
    }

    public void agregarCursoOTaller(Curso cursoOTaller) {
        cursosYTalleres.add(cursoOTaller);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = costoBasico;

        for (Curso curso : cursosYTalleres) {
            precioTotal += curso.calcularPrecio();
        }

        return precioTotal;
    }

    public List<Curso> getCursosYTalleres() {
        return cursosYTalleres;
    }

}
