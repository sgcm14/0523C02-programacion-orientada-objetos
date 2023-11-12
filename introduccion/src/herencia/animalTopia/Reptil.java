package herencia.animalTopia;

public class Reptil extends Animal {
    public Reptil(String nombre) {
        super(nombre);
    }

    @Override
    public void tomarMate(int contenidoMate) {
        // Energía se duplica por cada unidad de contenido del mate
        this.energia += contenidoMate * 2;
        System.out.println(nombre + " ha tomado el mate y su energía es ahora: " + energia);
    }
}
