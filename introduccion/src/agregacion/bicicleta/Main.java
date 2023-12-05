package agregacion.bicicleta;

public class Main {
    public static void main(String[] args) {
        // Crear una bicicleta
        Bicicleta bicicleta = new Bicicleta(26, "plástico", "disco", "aluminio");

        System.out.println("Información de la bicicleta:");
        System.out.println(bicicleta);

        // Desarmar la bicicleta
        Rueda ruedaDelantera = bicicleta.getRuedaDelantera();
        Rueda ruedaTrasera = bicicleta.getRuedaTrasera();
        Pedal pedales = bicicleta.getPedales();
        Freno frenos = bicicleta.getFrenos();
        Chasis chasis = bicicleta.getChasis();

        // Los componentes individuales pueden ser utilizados en otro contexto
        Triciclo triciclo = new Triciclo(ruedaDelantera, ruedaTrasera, pedales, frenos, chasis);

        System.out.println("Información del triciclo:");
        System.out.println(triciclo);
    }
}
