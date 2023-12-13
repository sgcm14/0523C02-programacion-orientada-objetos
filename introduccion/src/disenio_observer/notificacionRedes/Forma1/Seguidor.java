package disenio_observer.notificacionRedes.Forma1;

//implementacion de observador
public class Seguidor implements Observador {
    private String nombre;
    private String apellido;
    private int cantidadDeNotificaciones=0;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre+" fue notificado con  : "+mensaje);
        cantidadDeNotificaciones++;

    }

    public int getCantidadDeNotificaciones() {
        return cantidadDeNotificaciones;
    }
}
