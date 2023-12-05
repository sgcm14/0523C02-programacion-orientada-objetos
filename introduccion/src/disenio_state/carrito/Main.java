package disenio_state.carrito;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Jabón", "1.5");
        Producto producto2 = new Producto("Limpia pisos", "2.8");
        Carrito carrito = new Carrito();

        //Caso 1 - flujo normal
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.siguiente();
        carrito.setEstado(new Pagando());
        carrito.setEstado(new Cerrado());
        System.out.println("**************************** TERMINADO ******************************");

        //Caso 2
        carrito = new Carrito();
        carrito.agregarProducto(producto1);
        carrito.cancelarCarrito();
        System.out.println("**************************** TERMINADO ******************************");

        //Caso 3
        carrito = new Carrito();
        carrito.agregarProducto(producto2);
        carrito.setEstado(new Cerrado());
        carrito.cancelarCarrito();


    }
}
