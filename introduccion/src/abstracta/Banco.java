package abstracta;

public class Banco {
    public static void main(String[] args) {
        // Crear un objeto Cliente
        Cliente cliente1 = new Cliente(12345, "ApellidoCliente", "12345678", "CUIT12345");

        // Crear una Caja de Ahorro para el cliente1
        CajaDeAhorro cajaDeAhorroCliente1 = new CajaDeAhorro(cliente1, 1000.0, 0.03);

        // Realizar operaciones en la Caja de Ahorro
        cajaDeAhorroCliente1.depositar(500.0);
        cajaDeAhorroCliente1.extraer(200.0);
        cajaDeAhorroCliente1.cobrarInteres();

        // Obtener el saldo de la Caja de Ahorro
        double saldoCajaDeAhorroCliente1 = cajaDeAhorroCliente1.informarSaldo();
        System.out.println("Saldo de la Caja de Ahorro del cliente1: $" + saldoCajaDeAhorroCliente1);

        // Crear una Cuenta Corriente para el cliente1
        CuentaCorriente cuentaCorrienteCliente1 = new CuentaCorriente(cliente1, 2000.0, 1000.0);

        // Realizar operaciones en la Cuenta Corriente
        cuentaCorrienteCliente1.depositar(800.0);
        cuentaCorrienteCliente1.extraer(2500.0);

        // Obtener el saldo de la Cuenta Corriente
        double saldoCuentaCorrienteCliente1 = cuentaCorrienteCliente1.informarSaldo();
        System.out.println("Saldo de la Cuenta Corriente del cliente1: $" + saldoCuentaCorrienteCliente1);
    }
}
