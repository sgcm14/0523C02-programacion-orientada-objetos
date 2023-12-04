package disenio_composite.instituto_sistema;

public class TalleresIntensivos  extends Curso{

    private int cantidadTrabajosPracticos;
    private double costoPorTrabajoPractico;

    public TalleresIntensivos(String nombre, String descripcion,int cantidadTrabajosPracticos, double costoPorTrabajoPractico) {
        super(nombre, descripcion, 0, 0, 0);
        this.cantidadTrabajosPracticos = cantidadTrabajosPracticos;
        this.costoPorTrabajoPractico = costoPorTrabajoPractico;
    }

    @Override
    public double calcularPrecio() {
        return cantidadTrabajosPracticos * costoPorTrabajoPractico;
    }
}
