package disenio_composite.trencito;
public class Circulo extends Figura{
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return radio * radio * Math.PI;
    }
}
