package modelado.cuentasBancarias;

public class TarjetaDeDebito {
    private String numero;
    private String titular;
    private String vencimiento;

    public TarjetaDeDebito(String numero, String titular, String vencimiento) {
        this.numero = numero;
        this.titular = titular;
        this.vencimiento = vencimiento;
    }
}
