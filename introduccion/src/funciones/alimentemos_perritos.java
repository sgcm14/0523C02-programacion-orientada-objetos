package funciones;
import java.util.Scanner;

public class alimentemos_perritos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del perro: ");
        String nombre = scanner.nextLine();

        System.out.print("Cantidad de comida que come " + nombre + " (en kg): ");
        double cantidadDiaria = scanner.nextDouble();

        int numPaquetes = cuantosPaquetes(cantidadDiaria);

        System.out.println(nombre + " necesita " + numPaquetes + " paquetes.");
    }

    public static int cuantosPaquetes(double cantidadDiaria) {
        double cantidadNecesaria = cantidadDiaria;
        int numPaquetes = 0;

        while (cantidadNecesaria > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Peso del próximo paquete (en kg): ");
            double pesoPaquete = scanner.nextDouble();
            cantidadNecesaria -= pesoPaquete;
            numPaquetes++;
        }

        return numPaquetes;
    }
}
