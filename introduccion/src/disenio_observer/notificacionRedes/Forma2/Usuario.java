package disenio_observer.notificacionRedes.Forma2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

//sujeto observable
public class Usuario extends Observable {
    private String nombre;
    private String apellido;


    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void subirFoto(){
        String mensaje= nombre+".- Subio una foto";
        setChanged();
        notifyObservers(mensaje);

    };


}
