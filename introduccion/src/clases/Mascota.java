package clases;

public class Mascota {
    private String nombre;
    private int edad;
    private double cantidadComida;
    private String sonido;

    public Mascota(String nombre, int edad, double cantidadComida, String sonido) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadComida = cantidadComida;
        this.sonido = sonido;
    }

    public void informacionMascota() {
        System.out.println(nombre + " tiene " + edad + " años");
        System.out.println(nombre + " come " + cantidadComida + " kilos" + " y hace " + sonido);
    }

    public static void main(String[] args) {
        Mascota manchitas = new Mascota("Manchitas", 2, 1.5, "guau guau");
        Mascota nemo = new Mascota("Nemo", 1, 0.14, "glu glu");
        Mascota silvestre = new Mascota("Silvestre", 3, 0.5, "miau miau");
        Mascota manuelita = new Mascota("Manuelita", 12, 0.3, "sh sh");
        Mascota gardel = new Mascota("Gardel", 1, 0.35, "fiu fiu");

        manchitas.informacionMascota();
        nemo.informacionMascota();
        silvestre.informacionMascota();
        manuelita.informacionMascota();
        gardel.informacionMascota();
    }
}

