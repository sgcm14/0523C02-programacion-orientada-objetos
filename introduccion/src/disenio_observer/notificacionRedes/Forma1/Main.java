package disenio_observer.notificacionRedes.Forma1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario= new Usuario("Jorgito","Pereyra");


        Seguidor seguidor1= new Seguidor("Sammy");
        Seguidor seguidor2= new Seguidor("Victor");
        Seguidor seguidor3= new Seguidor("Pool Petter");


        usuario.agregarSeguidor(seguidor1);
        usuario.agregarSeguidor(seguidor2);
        usuario.agregarSeguidor(seguidor3);

        usuario.subirFoto();
        System.out.println("Sammy tuvo "+seguidor1.getCantidadDeNotificaciones()+" notificaciones");
    }
}
