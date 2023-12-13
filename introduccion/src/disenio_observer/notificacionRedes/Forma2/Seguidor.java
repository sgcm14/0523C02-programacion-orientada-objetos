package disenio_observer.notificacionRedes.Forma2;

import java.util.Observable;
import java.util.Observer;

//implementacion de observador
public class Seguidor implements Observer {
    private String nombre;
    private String apellido;
    private int cantidadDeNotificaciones=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }



    public int getCantidadDeNotificaciones() {
        return cantidadDeNotificaciones;
    }

    @Override
    public void update(Observable o, Object arg) {
        String mensaje= (String)arg;
        System.out.println(nombre+" fue notificado con: "+mensaje);
        cantidadDeNotificaciones++;

    }
}
