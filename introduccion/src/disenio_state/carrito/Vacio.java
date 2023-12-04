package disenio_state.carrito;

public class Vacio implements EstadoCarrito {

    public Vacio(){
        System.out.println("Mi estado es Vacío");
    }

    @Override
    public void agregarProducto() {
        System.out.println("Carrito creado");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("Carrito vacío, sin cambios");
    }

    @Override
    public void volver() {
        System.out.println("Sin cambios, no puedes volver");
    }

    @Override
    public void siguiente() {
        System.out.println("Agregue productos para avanzar");
    }
}
