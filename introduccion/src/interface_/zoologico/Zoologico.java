package interface_.zoologico;

public class Zoologico {
    public static void main(String[] args) {
        Felino leon = new Felino("León", 5, 3);
        Canino perro = new Canino("Perro", 3, 5);
        Ornitorrinco ornitorrinco = new Ornitorrinco("Ornitorrinco", 2, 2);
        Ave aguila = new Ave("Águila", 4);
        Pez pez = new Pez("Pez", 1);

        leon.parir();
        perro.amamantar();
        ornitorrinco.volar();
        aguila.ponerHuevos();
    }
}
