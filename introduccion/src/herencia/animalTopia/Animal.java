package herencia.animalTopia;

public abstract class Animal {
    protected String nombre;
    protected int energia;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.energia = 0;
    }

    public abstract void tomarMate(int contenidoMate);
}
