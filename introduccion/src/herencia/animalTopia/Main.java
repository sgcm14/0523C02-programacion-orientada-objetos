package herencia.animalTopia;

public class Main {
    public static void main(String[] args) {
        Reptil reptil = new Reptil("Repti");
        Mamifero mamifero = new Mamifero("Mamifi");

        Animal[] animales = { reptil, mamifero };

        CebadorDeMate cebador = new CebadorDeMate();
        cebador.cebadorRondaDeMate(animales, 3);
    }
}
