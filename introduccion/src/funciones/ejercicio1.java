package funciones;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esDivisible(int n, int divisor){
        if(n % divisor ==0){
            return true;
        } else{
            return false;
        }
    }

    public static boolean esPrimo (int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (esDivisible(numero, i)) {
                return false;
            }
        }
        return true;
    }
}