package disenio_state.carrito;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private EstadoCarrito estado;
    private List<Productos> listaProductos;

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }

    public Carrito() {
        this.estado = new Vacio();
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto){
        if(estado instanceof Vacio){
            estado = new Cargando();
        }
        if(estado instanceof Cargando ){
            listaProductos.add(producto);
        }
        estado.agregarProducto();
    }
    public void cancelarCarrito(){
        if(!(estado instanceof Cerrado)){
            if(this.listaProductos.stream().count() >0){
                System.out.println("Este carrito contenía productos que se eliminarán");
            }
            this.listaProductos = new ArrayList<>();
            this.estado = new Vacio();
        }
        estado.cancelarCarrito();
    };
    public void volver(){
        if(estado instanceof Cargando){
            this.listaProductos = new ArrayList<>();
            this.estado = new Vacio();
        }
        estado.volver();
    };
    public void siguiente(){
        if (estado instanceof Cerrado){
            estado = new Vacio();
            this.listaProductos = new ArrayList<>();
        }
    };
    
}
