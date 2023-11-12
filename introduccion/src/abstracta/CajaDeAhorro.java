package abstracta;

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(Cliente cliente, double saldo, double tasaDeInteres) {
        super(cliente, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    @Override
    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    public void cobrarInteres() {
        double interes = saldo * tasaDeInteres;
        saldo += interes;
    }

}

