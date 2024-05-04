package disenio_factory_method.producto;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productoList;

    public Almacen() {
        this.productoList = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.productoList.add(producto);
    }
    public double calcularEspacioNecesario(){
        double totalEspacio = 0.0;
        for(Producto product : productoList){
            // DEBUG: System.out.println("Valor calculado producto " + product.getClass().toString() + " "+ product.calcularEspacio());
            totalEspacio += product.calcularEspacio();
        }
        return totalEspacio;
    }
}
