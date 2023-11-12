package interface_.zoologico;

public class Mamifero extends Animal {
    private int cantidadCrias;

    public Mamifero(String nombre, int edad, int cantidadCrias) {
        super(nombre, edad);
        this.cantidadCrias = cantidadCrias;
    }

    public int getCantidadCrias() {
        return cantidadCrias;
    }

    public void parir() {
        System.out.println(getNombre() + " está pariendo.");
    }

    public void amamantar() {
        System.out.println(getNombre() + " está amamantando a sus crías.");
    }
}
