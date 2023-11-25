package disenio_factory.empleado.Forma2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws RuntimeException {
        try{
            System.out.println("***********Bienvenidos a la fabrica de Empleados************");
            Scanner scanner= new Scanner(System.in);
            System.out.println("Ingrese el tipo de emplado: EMP-RD o EMP-PH");
            String entrada= scanner.nextLine();
             Empleado empleado= EmpleadoFactory.crearEmpleado(entrada);
                System.out.println("Ingrese la cantidad dias trabajados: ");
                int dias= scanner.nextInt();
                double sueldo= empleado.calcularSueldo(dias);
                System.out.println("El salario correspondiente al empleado es $: "+sueldo);

            scanner.close();

        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }
}
