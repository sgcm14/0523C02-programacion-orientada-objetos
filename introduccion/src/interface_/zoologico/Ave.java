package interface_.zoologico;

public class Ave extends Oviparo implements Volador {
    public Ave(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }
}
