package modelado.cuentasBancarias.modeladoDigitalBank;
import java.time.LocalDate;
public class Cheque {
    private String tipo; // Común o de pago diferido
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private String endoso; // Datos de la persona propietaria en caso de endoso

    // Constructor
    public Cheque(String tipo, LocalDate fechaEmision, LocalDate fechaVencimiento) {
        this.tipo = tipo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.endoso = null;
    }

    // Método para realizar endoso
    public void endosarCheque(String nuevosDatosPropietario) {
        if (endoso == null) {
            endoso = nuevosDatosPropietario;
            System.out.println("Cheque endosado correctamente a: " + nuevosDatosPropietario);
        } else {
            System.out.println("El cheque ya ha sido endosado anteriormente y no puede ser endosado nuevamente.");
        }
    }

    // Método para verificar validez del cheque
    public boolean chequeValido() {
        LocalDate fechaActual = LocalDate.now();
        return !fechaActual.isAfter(fechaVencimiento.plusDays(30));
    }

    // Métodos para obtener información del cheque
    public String obtenerTipo() {
        return tipo;
    }

    public LocalDate obtenerFechaEmision() {
        return fechaEmision;
    }

    public LocalDate obtenerFechaVencimiento() {
        return fechaVencimiento;
    }

    public String obtenerEndoso() {
        return endoso;
    }
}
