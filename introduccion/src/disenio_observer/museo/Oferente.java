package disenio_observer.museo;

import java.util.Observable;
import java.util.Observer;

public class Oferente implements Observer {
    private String nombre;
    private String apellido;
    private int dni;
    private double montoTope;

    public Oferente(String nombre, String apellido, int dni, double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }

    @Override
    public void update(Observable o, Object arg) {
        double montoSubasta = (Double) arg;
        if (montoSubasta < montoTope) {
            System.out.println(nombre + " " + apellido + " está dispuesto a ofertar " + montoSubasta + " en la subasta.");
        }
    }

    // Getters y Setters
}

