package disenio_state.tamagotchi;

public class Triste implements EstadoTamagotchi{


    public Triste() {
        System.out.println("Mi estado actual es Triste");
    }

    @Override
    public void recibirComida() {
        System.out.println("hace 2 beep y vomita");

    }

    @Override
    public void recibirBebida() {
        System.out.println("hace 3 beep y titila el display");

    }

    @Override
    public void recibirMimos() {
        System.out.println("se pone feliz");
    }
}
