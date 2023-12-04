package disenio_state.tamagotchi;

public class Hambriento implements EstadoTamagotchi{

    public Hambriento() {
        System.out.println("Mi estado actual es Hambriento");
    }

    @Override
    public void recibirComida() {
        System.out.println("Se pone feliz");

    }

    @Override
    public void recibirBebida() {
        System.out.println(" se pone triste");

    }

    @Override
    public void recibirMimos() {
        System.out.println("sin cambios en hambriento");

    }
}
