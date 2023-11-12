package modelado.tienda;
import java.util.List;

public class Venta {
    // Atributos
    private String fechaHora;
    private Empleado empleado;
    private List<Articulo> articulosVendidos;

    // Comportamientos
    public double calcularMontoTotal() {
        // lógica para calcular el monto total de la venta
        return 0.0;
    }

    public void registrarVentaEnSistema() {
        // lógica para registrar la venta en el sistema
    }
}
