package interface_.zoologico;

public class Ornitorrinco extends Mamifero implements Volador {
    public Ornitorrinco(String nombre, int edad, int cantidadCrias) {
        super(nombre, edad, cantidadCrias);
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }
}
