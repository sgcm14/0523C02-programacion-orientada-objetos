package funciones;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        Integer numeroA = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        Integer numeroB = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        Integer numeroC = scanner.nextInt();

        Integer maximo = maximoEntreTresNumeros(numeroA, numeroB, numeroC);

        System.out.println("El número máximo entre " + numeroA + ", " + numeroB + " y " + numeroC + " es " + maximo);
    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        Integer maximo = unNumeroA;

        if (unNumeroB.compareTo(maximo) > 0) {
            maximo = unNumeroB;
        }

        if (unNumeroC.compareTo(maximo) > 0) {
            maximo = unNumeroC;
        }

        return maximo;
    }

}
