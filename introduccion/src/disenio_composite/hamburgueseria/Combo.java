package disenio_composite.hamburgueseria;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto{
    private List<Producto> productos= new ArrayList<>();
    public Combo(String nombre) {
        super(nombre, 0);
        System.out.println("Usted esta adquiriendo un combo");
//es decir el combo cuesta en un principio 0;
    }
   public void agregarProducto(Producto producto){

        productos.add(producto);
   }

    @Override
    public double getPrecio() {
        double precioTotal=0;
        for (Producto producto : productos) {
            precioTotal+=producto.getPrecio(); //acumulando y sumando
        }
        System.out.println("El descuento aplicado es del 10% sobre el precio total: $ "+precioTotal);
        return precioTotal*0.9; //me obtenga un 10 % off
    }
}
