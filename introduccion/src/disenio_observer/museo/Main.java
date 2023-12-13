package disenio_observer.museo;

public class Main {
    public static void main(String[] args) {
        Subasta subasta = new Subasta(1000, "Pintura antigua");

        Oferente oferente1 = new Oferente("Juan", "Perez", 12345678, 1500);
        Oferente oferente2 = new Oferente("Maria", "Gomez", 87654321, 800);

        subasta.addObserver(oferente1);
        subasta.addObserver(oferente2);

        // Cambiar el monto de la subasta y notificar a los oferentes
        subasta.setMonto(1200);
    }
}
