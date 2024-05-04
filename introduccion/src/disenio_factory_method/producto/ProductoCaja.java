package disenio_factory_method.producto;

public class ProductoCaja extends Producto {
    private double longitud;
    private double ancho;
    private double altura;

    public ProductoCaja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public double calcularEspacio() {
        return longitud * ancho * altura;
    }
}
