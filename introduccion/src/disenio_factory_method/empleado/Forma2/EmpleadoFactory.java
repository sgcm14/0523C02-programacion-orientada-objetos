package disenio_factory_method.empleado.Forma2;

public abstract class EmpleadoFactory {
    public static Empleado crearEmpleado(String tipo) throws RuntimeException{
        if("EMP-RD".equalsIgnoreCase(tipo)){
            return new EmpleadoRelacionDeDepedencia(1000);
        } else if ("EMP-PH".equalsIgnoreCase(tipo)) {
            return new EmpleadoContratado(7,14);

        }else {
            throw new IllegalArgumentException("Tipo de empleado no valido:  "+tipo);
        }
    }
}
