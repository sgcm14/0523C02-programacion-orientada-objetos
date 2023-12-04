package disenio_composite.trencito;

public class Rectangulo extends Figura{
    private double alto;
    private double largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }
    @Override
    public Double calcularArea() {
        return alto * largo;
    }
}
