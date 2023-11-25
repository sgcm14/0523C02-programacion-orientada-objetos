package excepciones.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
//	    Paciente paciente=new Paciente("Juan","Perez","12345",new Date(10,5,2021));
        try {

            // Flujo normal

            Paciente paciente = new Paciente("Juan", "Perez", "12345", new Date(123, 10, 24)); //24-nov-2023
            // Año 2021 es representado como 121

            paciente.darAlta(new Date(123, 10, 25));


            //no se puede dar de alta antes de la fecha de internacion
            Paciente paciente3 =new Paciente("Ana","Rojas","123459",new Date(123,10,19));
            paciente3.darAlta(new Date(123, 9, 1));


            // Paciente no puede ingresar despues de hoy
            Paciente paciente2 =new Paciente("Pepito","Gomez","123458",new Date(123,10,30));

        } catch (FechaInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
