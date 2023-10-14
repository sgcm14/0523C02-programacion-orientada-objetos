package ingresoDatos;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first_name, second_name, first_last_name, second_last_name, initials;

        System.out.println("Ingresa tu nombre");
        first_name = scanner.nextLine();

        System.out.println("Ingresa tu segundo nombre");
        second_name = scanner.nextLine();

        System.out.println("Ingresa tu primer apellido");
        first_last_name = scanner.nextLine();

        System.out.println("Ingresa tu segundo apellido");
        second_last_name = scanner.nextLine();

        char first_initial = first_name.charAt(0);
        char second_initial = second_name.charAt(0);
        char third_initial = first_last_name.charAt(0);
        char fourth_initial = second_last_name.charAt(0);

        initials = String.valueOf(first_initial) + String.valueOf(second_initial) +
                String.valueOf(third_initial) + String.valueOf(fourth_initial);
        System.out.println(initials);
    }
}