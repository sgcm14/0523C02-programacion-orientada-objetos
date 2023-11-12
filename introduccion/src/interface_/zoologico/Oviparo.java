package interface_.zoologico;

public class Oviparo extends Animal {
    public Oviparo(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ponerHuevos() {
        System.out.println(getNombre() + " está poniendo huevos.");
    }

    public void romperCascaron() {
        System.out.println(getNombre() + " ha roto el cascarón al nacer.");
    }
}
