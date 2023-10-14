package funciones;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer texto: ");
        String textoA = scanner.nextLine();
        System.out.print("Ingresa el segundo texto: ");
        String textoB = scanner.nextLine();

        boolean sonDistintas = cadenasDeTextoDistintas(textoA, textoB);

        if (sonDistintas) {
            System.out.println("Las cadenas son distintas.");
        } else {
            System.out.println("Las cadenas son iguales.");
        }
    }

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return !unTextoA.equals(unTextoB);
    }
}
