package Abstracta;

public class CuentaCorriente extends Cuenta {
    private double montoAutorizado;

    public CuentaCorriente(Cliente cliente, double saldo, double montoAutorizado) {
        super(cliente, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    @Override
    public void extraer(double monto) {
        if (monto > 0 && (saldo + montoAutorizado) >= monto) {
            saldo -= monto;
        }
    }

}

