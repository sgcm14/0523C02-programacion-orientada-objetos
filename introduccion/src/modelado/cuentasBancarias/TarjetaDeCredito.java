package modelado.cuentasBancarias;

public class TarjetaDeCredito {
    private String numero;
    private String titular;
    private String vencimiento;
    private double limite;
    private double interes;
    private int cuotas;

    public TarjetaDeCredito(String numero, String titular, String vencimiento, double limite, double interes, int cuotas) {
        this.numero = numero;
        this.titular = titular;
        this.vencimiento = vencimiento;
        this.limite = limite;
        this.interes = interes;
        this.cuotas = cuotas;
    }

    public double getLimiteDisponible() {
        // Calcular el límite disponible restando el monto utilizado del límite total
        // Implementar lógica según tus necesidades
        return limite;
    }

    public boolean realizarCompra(double monto, int cuotas) {
        // Implementar lógica para realizar la compra con tarjeta de crédito
        // Considerar límite disponible, cantidad de cuotas, etc.
        return true; // Devolver true si la transacción es exitosa, false si falla
    }
}
