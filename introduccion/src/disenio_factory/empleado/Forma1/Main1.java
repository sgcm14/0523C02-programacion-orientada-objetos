package disenio_factory.empleado.Forma1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws RuntimeException {
        try{
            System.out.println("***********Bienvenidos a la fabrica de Empleados************");
            Scanner scanner= new Scanner(System.in);
            System.out.println("Ingrese el tipo de emplado: 1 para RD, 2 para PH");
            String entrada= scanner.nextLine();
            if("1".equals(entrada)){
                Empleado empleado= new EmpleadoRelacionDependenciaFactory().crearEmpleado("EMP-RD");
                System.out.println("Ingrese la cantidad dias trabajados: ");
                int dias= scanner.nextInt();
                double sueldo= empleado.calcularSueldo(dias);
                System.out.println("El salario correspondiente al empleado es $: "+sueldo);
            } else if ("2".equals(entrada)) {
                Empleado empleado2= new EmpleadoContratadoFactory().crearEmpleado("EMP-PH");
                System.out.println("Ingrese la cantidad dias trabajados: ");
                int dias= scanner.nextInt();
                double sueldo= empleado2.calcularSueldo(dias);
                System.out.println("El salario correspondiente al empleado es $: "+sueldo);

            }else {
                throw new IllegalArgumentException("No son validos los tipos selecionados");
            }
            scanner.close();

        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }
}
