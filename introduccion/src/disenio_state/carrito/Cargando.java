package disenio_state.carrito;

public class Cargando implements  EstadoCarrito{
    public Cargando(){
        System.out.println("Mi estado es Cargando");
    }
    @Override
    public void agregarProducto() {
        System.out.println("Producto agregado");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Realmente desea cancelar?");
    }

    @Override
    public void volver() {
        System.out.println("Se eliminan productos, carrito Vacío");
    }

    @Override
    public void siguiente() {
        System.out.println("Proceda con el pago");
    }
}
