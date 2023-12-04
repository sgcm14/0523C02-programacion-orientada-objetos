package disenio_composite.hamburgueseria;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos= new ArrayList<>();
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void cancelarCarrito(){
        productos.clear();
    }

    public double calcularTotalCompra(){
        System.out.println("**********calculando el precio********");
        double precioCarrito=0;
        for (Producto producto : productos) {
            precioCarrito+= producto.getPrecio();
            System.out.println("*******************************");
            System.out.println("*** Producto: "+producto.getNombre()+" .-Precio: $"+producto.getPrecio());
        }
        return precioCarrito;
    }
}
