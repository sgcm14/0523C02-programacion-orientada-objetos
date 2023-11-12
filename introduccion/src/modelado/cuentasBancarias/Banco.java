package modelado.cuentasBancarias;

public class Banco {
    public static void main(String[] args) {
        // Crear una cuenta para un titular
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez");

        // Crear una tarjeta de débito asociada a la cuenta
        TarjetaDeDebito tarjetaDeDebito = new TarjetaDeDebito("1234567890123456", "Juan Pérez", "12/25");
        cuenta.asociarTarjetaDeDebito(tarjetaDeDebito);

        // Realizar una transacción con la tarjeta de débito
        double montoDebito = 50.0;
        if (cuenta.realizarPagoConDebito(montoDebito)) {
            System.out.println("Transacción exitosa. Nuevo saldo: " + cuenta.getSaldo());
        } else {
            System.out.println("Fondos insuficientes para la transacción.");
        }

        // Crear una tarjeta de crédito asociada a la cuenta
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("9876543210987654", "Juan Pérez", "06/23", 1000.0, 0.2, 12);
        cuenta.asociarTarjetaDeCredito(tarjetaDeCredito);

        // Realizar una transacción con la tarjeta de crédito
        double montoCredito = 200.0;
        if (cuenta.realizarPagoConCredito(montoCredito, 3)) {
            System.out.println("Transacción exitosa. Nuevo límite: " + tarjetaDeCredito.getLimiteDisponible());
        } else {
            System.out.println("Monto excede el límite de financiación o número de cuotas no válido.");
        }
    }
}
