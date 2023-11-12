package herencia.juego;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, double velocidad) {
        super(x, y, direccion);
        this.velocidad = velocidad;
        this.vida = 100;
    }

    public void girar(char nuevaDireccion) {
        //this.direccion = nuevaDireccion;
        this.setDireccion(nuevaDireccion);
    }

    public void restaVida(int valor) {
        this.vida -= valor;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

