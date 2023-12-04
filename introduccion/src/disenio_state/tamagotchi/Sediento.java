package disenio_state.tamagotchi;

public class Sediento implements EstadoTamagotchi {

    public Sediento() {
        System.out.println("Mi estado Actual es Sediento");
    }

    @Override
    public void recibirComida() {
        System.out.println(" se pone triste");
    }

    @Override
    public void recibirBebida() {
        System.out.println(" se pone feliz");

    }

    @Override
    public void recibirMimos() {
        System.out.println(" sin cambios");

    }
}
