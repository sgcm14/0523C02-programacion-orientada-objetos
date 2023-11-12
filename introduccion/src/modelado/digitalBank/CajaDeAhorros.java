package modelado.digitalBank;

public class CajaDeAhorros {
    private String titular;
    private double saldo;
    private int numeroCuenta;
    private String alias;
    private String cbu;

    // Constructor
    public CajaDeAhorros(String titular, double saldoInicial, int numeroCuenta, String alias, String cbu) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;
        this.cbu = cbu;
    }

    // Métodos para operaciones bancarias
    public double consultarSaldo() {
        return saldo;
    }

    public void realizarDeposito(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
    }

    public void realizarRetiro(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void recibirTransferencia(double monto) {
        saldo += monto;
        System.out.println("Transferencia recibida. Nuevo saldo: " + saldo);
    }

    // Métodos para obtener información de la cuenta
    public String obtenerTitular() {
        return titular;
    }

    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public String obtenerAlias() {
        return alias;
    }

    public String obtenerCBU() {
        return cbu;
    }
}
