package disenio_state.carrito;

public class Cerrado implements EstadoCarrito{

    public Cerrado(){
        System.out.println("Mi estado es Cerrado");
    }
    @Override
    public void agregarProducto() {
        System.out.println("No se pueden agregar productos");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No se puede cancelar el carrito");
    }

    @Override
    public void volver() {
        System.out.println("No se puede volver, carrito cerrado");
    }

    @Override
    public void siguiente() {
        System.out.println("Carrito Vacío");
    }
}
