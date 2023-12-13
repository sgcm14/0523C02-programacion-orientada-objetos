package disenio_observer.museo;

import java.util.Observable;

public class Subasta extends Observable {
    private double monto;
    private String descripcion;

    public Subasta(double montoInicial, String descripcion) {
        this.monto = montoInicial;
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
        setChanged();
        notifyObservers(monto);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
