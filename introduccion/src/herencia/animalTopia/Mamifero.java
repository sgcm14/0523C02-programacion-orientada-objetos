package herencia.animalTopia;

public class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    public void tomarMate(int contenidoMate) {
        // Energía aumenta en 5 unidades por cada unidad de contenido del mate
        this.energia += contenidoMate * 5;
        System.out.println(nombre + " ha tomado el mate y su energía es ahora: " + energia);
    }
}
