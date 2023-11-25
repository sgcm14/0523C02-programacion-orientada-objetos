package disenio_factory.empleado.Forma1;

public class EmpleadoContratado extends Empleado {
    private double importePorHora;
    private double retencionImpuesto;

    public EmpleadoContratado(double importePorHora, double retencionImpuesto) {
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        System.out.println("Se le va a aplicar una retencion de : "+(retencionImpuesto)+" %");
        return (8*importePorHora*dias)*(1-retencionImpuesto/100);
    }
}
