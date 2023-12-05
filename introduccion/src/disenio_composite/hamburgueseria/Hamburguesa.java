package disenio_composite.hamburgueseria;

//leaf -hoja
public class Hamburguesa extends Producto {

    public Hamburguesa(String nombre, double precio) {
        super(nombre, precio);
        System.out.println("Usted esta adquiriendo una burger");

    }
}
