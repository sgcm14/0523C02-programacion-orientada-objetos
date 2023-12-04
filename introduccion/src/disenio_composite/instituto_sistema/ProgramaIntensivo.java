package disenio_composite.instituto_sistema;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends Curso{

    private List<Curso> cursos = new ArrayList<>();
    private double bonificacionPorcentaje;

    public ProgramaIntensivo(String nombre, String descripcion, double bonificacionPorcentaje) {
        super(nombre, descripcion, 0, 0, 0);
        this.bonificacionPorcentaje = bonificacionPorcentaje;
    }

    public void agregarCurso (Curso curso){

        cursos.add(curso);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0;
        for (Curso curso : cursos) {
            precioTotal += curso.calcularPrecio();
        }

        precioTotal *= (1 - bonificacionPorcentaje / 100);

        return precioTotal;
    }

    public List<Curso> obtenerNombresCursos() {
        return cursos;
    }
}
