package disenio_state.tamagotchi;
public class Feliz implements EstadoTamagotchi{

    public Feliz() {
        System.out.println("mi estado actual es Feliz");
    }

    @Override
    public void recibirComida() {
        System.out.println("Se pone sediento");

    }

    @Override
    public void recibirBebida() {
        System.out.println("Se pone hambriento");

    }

    @Override
    public void recibirMimos() {
        //sin cambios
        System.out.println("sin cambios siendo feliz");

    }
}
