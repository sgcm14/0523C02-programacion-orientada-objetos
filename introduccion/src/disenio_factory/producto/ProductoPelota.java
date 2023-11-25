package disenio_factory.producto;

public class ProductoPelota extends Producto {
    private double radio;

    public ProductoPelota(double radio) {
        this.radio = radio;
    }
    /*
     * V = 4/3 π r³*/
    @Override
    public double calcularEspacio() {
        return ((4.0/3.0) * (Math.PI) * Math.pow(radio, 3));
    }
}
