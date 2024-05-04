package disenio_factory_method.empleado.Forma2;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int legajo;

    public abstract double calcularSueldo(int dias);
}
