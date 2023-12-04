package disenio_composite.hamburgueseria;

//leaf -hoja
public class Hamburgesa extends Producto {

    public Hamburgesa(String nombre, double precio) {
        super(nombre, precio);
        System.out.println("Usted esta adquiriendo una burger");

    }
}
