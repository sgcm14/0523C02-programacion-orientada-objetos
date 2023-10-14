package funciones;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean resultado = esDivisible(10, 2);

        System.out.println("¿Es divisible? " + resultado);

    }

    public static boolean esDivisible(int n, int divisor){
        if(n % divisor ==0){
            return true;
        } else{
            return false;
        }
    }

}