package modelado.cuentasBancarias;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private TarjetaDeDebito tarjetaDeDebito;
    private TarjetaDeCredito tarjetaDeCredito;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void asociarTarjetaDeDebito(TarjetaDeDebito tarjeta) {
        this.tarjetaDeDebito = tarjeta;
    }

    public void asociarTarjetaDeCredito(TarjetaDeCredito tarjeta) {
        this.tarjetaDeCredito = tarjeta;
    }

    public boolean realizarPagoConDebito(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean realizarPagoConCredito(double monto, int cuotas) {
        if (tarjetaDeCredito != null && tarjetaDeCredito.realizarCompra(monto, cuotas)) {
            return true;
        } else {
            return false;
        }
    }
}
