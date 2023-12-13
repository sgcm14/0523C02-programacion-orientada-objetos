package disenio_observer.notificacionRedes.Forma1;

import java.util.ArrayList;
import java.util.List;

//sujeto observable
public class Usuario {
    private String nombre;
    private String apellido;

    private List<Observador> seguidores= new ArrayList<>();

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void subirFoto(){
        String mensaje= nombre+"Subio una foto";
        notificarSeguidores(mensaje);
    };
    public  void agregarSeguidor(Observador seguidor){
        seguidores.add(seguidor);
    }
    public void eliminarSeguidor(Observador seguidor){
        seguidores.remove(seguidor);
    }
    public void notificarSeguidores(String mensaje){
        //como leo la lista para notificar?
        for (Observador seguidor : seguidores) {
            seguidor.notificar(mensaje);

        }
    }

}
