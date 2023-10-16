package funciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class sintaxis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresa tu nombre y apellido por separado
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.next();

        // Ingresa tu fecha de nacimiento en formato "dd/mm/aaaa"
        System.out.print("Ingresa tu día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa tu mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa tu año de nacimiento: ");
        int anio = scanner.nextInt();

        // Concatenar las iniciales del nombre y apellido
        String iniciales = nombre.charAt(0) + "" + apellido.charAt(0);

        // Crear una instancia de LocalDate
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        // Formatear la fecha de nacimiento en el formato "dd/mm/aaaa"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaNacimientoFormateada = fechaNacimiento.format(formatter);

        // Mostrar la ficha con los datos
        System.out.println("Ficha Personal:");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Iniciales: " + iniciales);
        System.out.println("Fecha de nacimiento: " + fechaNacimientoFormateada);
    }
}
