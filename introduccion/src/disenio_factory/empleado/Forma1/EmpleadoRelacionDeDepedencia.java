package disenio_factory.empleado.Forma1;

public class EmpleadoRelacionDeDepedencia extends Empleado{
    private double sueldoMensual;

    public EmpleadoRelacionDeDepedencia(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return (sueldoMensual/30)*dias;
    }
}
