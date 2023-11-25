package disenio_factory.empleado.Forma1;

public class EmpleadoRelacionDependenciaFactory implements EmpleadoFactory{
    @Override
    public Empleado crearEmpleado(String tipo) throws RuntimeException {
        if("EMP-RD".equals(tipo)){
            return new EmpleadoRelacionDeDepedencia(1000);
        }else{
            throw new IllegalArgumentException("No se puede crear el empleado RD solicitado");
        }
    }
}
