package disenio_state.carrito;

public class Pagando implements EstadoCarrito{

    public Pagando(){
        System.out.println("Mi Estado es Pagando");
    }
    @Override
    public void agregarProducto() {
        System.out.println("No se aceptan más productos, debe continuar con el pago");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Se espera el pago de su compra, desea cancelar la transacción?");
    }

    @Override
    public void volver() {
        System.out.println("Volver a cargar productos");
    }

    @Override
    public void siguiente() {
        System.out.println("Pagando, Espere la aceptación de la compra");
    }
}
