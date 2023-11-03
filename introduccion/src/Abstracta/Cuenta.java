package Abstracta;

public abstract class Cuenta {
    private Cliente cliente;
    protected double saldo;

    public Cuenta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public abstract void depositar(double monto);
    public abstract void extraer(double monto);
    public double informarSaldo(){
        return saldo;
    }

}


