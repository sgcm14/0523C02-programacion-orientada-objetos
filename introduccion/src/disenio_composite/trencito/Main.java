package disenio_composite.trencito;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 4);
        Figura triangulo = new Triangulo(3, 4);
        Figura circulo = new Circulo(1);

        Vagon vagon = new Vagon();
        vagon.agregarFigura(rectangulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo);
        vagon.agregarFigura(circulo);
        System.out.println("**********************************************");
        System.out.println("Area total del vagon 1: " + vagon.calcularArea());
        System.out.println("**********************************************");

        Vagon vagonPrincipal = new Vagon();
        Figura rectangulo2 = new Rectangulo(2, 4);
        Figura rectangulo3 = new Rectangulo(2, 2);
        Figura rectangulo4 = new Rectangulo(2, 1);
        vagonPrincipal.agregarFigura(circulo);
        vagonPrincipal.agregarFigura(circulo);
        vagonPrincipal.agregarFigura(rectangulo2);
        vagonPrincipal.agregarFigura(rectangulo3);
        vagonPrincipal.agregarFigura(rectangulo4);
        vagonPrincipal.agregarFigura(triangulo);

        Locomotora trencito = new Locomotora();
        trencito.agregarVagon(vagonPrincipal);
        trencito.agregarVagon(vagon);
        trencito.agregarVagon(vagon);

        System.out.println("**********************************************");
        System.out.println("Area total del Tren: " + trencito.calcularArea());
        System.out.println("**********************************************");

    }
}