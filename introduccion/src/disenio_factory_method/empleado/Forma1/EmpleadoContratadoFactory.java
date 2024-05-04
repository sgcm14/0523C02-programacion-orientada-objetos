package disenio_factory_method.empleado.Forma1;

public class EmpleadoContratadoFactory implements EmpleadoFactory{
    @Override
    public Empleado crearEmpleado(String tipo) throws RuntimeException {
        if("EMP-PH".equals(tipo)){
            return new EmpleadoContratado(7,14);
        }else{
            throw new IllegalArgumentException("No se puede crear el empleado PH solicitado");
        }

    }
}
