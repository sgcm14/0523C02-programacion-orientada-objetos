package herencia.animalTopia;

public class CebadorDeMate {
    public void cebadorRondaDeMate(Animal[] animales, int contenidoMate) {
        for (Animal animal : animales) {
            animal.tomarMate(contenidoMate);
        }
    }
}
