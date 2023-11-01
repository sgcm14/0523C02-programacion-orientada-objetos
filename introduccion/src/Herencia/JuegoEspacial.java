package Herencia;

public class JuegoEspacial {
    public static void main(String[] args) {
        Nave nave = new Nave(0, 0, 'N', 10.0);
        Nave naveEnemiga  = new Nave(3, 3, 'E', 12.0);
        Asteroide asteroide = new Asteroide(5, 5, 'O', 30);

        System.out.println("Posición inicial de la nave: (" + nave.getPosx() + ", " + nave.getPosy() + "), Dirección: " + nave.getDireccion());
        System.out.println("Posición inicial de la nave enemiga: (" + naveEnemiga.getPosx() + ", " + naveEnemiga.getPosy() + "), Dirección: " + naveEnemiga.getDireccion());
        System.out.println("Posición inicial del asteroide: (" + asteroide.getPosx() + ", " + asteroide.getPosy() + "), Dirección: " + asteroide.getDireccion());
        System.out.println("****************************");

        // Mover
        nave.irA(3, 3, 'E');
        naveEnemiga.irA(4,5,'N');
        asteroide.irA(8, 8, 'S');

        // Mostrar la nueva posición
        System.out.println("Nueva posición de la nave: (" + nave.getPosx() + ", " + nave.getPosy() + "), Dirección: " + nave.getDireccion());
        System.out.println("Nueva posición del asteroide: ("+ asteroide.getPosx() + ", " + asteroide.getPosy() + "), Dirección: " + asteroide.getDireccion());
        System.out.println("Nueva posición de la nave enemiga: (" + naveEnemiga.getPosx() + ", " + naveEnemiga.getPosy() + "), Dirección: " + naveEnemiga.getDireccion());
        System.out.println("****************************");

        // Girar la nave
        nave.girar('S');

        // Mostrar la dirección actual de la nave
        System.out.println("Nueva dirección de la nave: " + nave.getDireccion());

        // Reducir la vida de la nave y mostrar su vida restante
        System.out.println("Vida de la nave: " + nave.getVida());
        nave.restaVida(20);
        System.out.println("Vida restante de la nave: " + nave.getVida());

        System.out.println(nave.toString());
        System.out.println(naveEnemiga.toString());
        System.out.println(asteroide.toString());

        System.out.println(nave.hashCode());
        System.out.println(naveEnemiga.hashCode());
        System.out.println(asteroide.hashCode());
    }
}
