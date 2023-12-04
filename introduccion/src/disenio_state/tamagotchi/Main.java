package disenio_state.tamagotchi;

public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi= new Tamagotchi();
        System.out.println("***************************COMIDA***************************");
        tamagotchi.recibirComida();
        System.out.println("***************************BEBIDA***************************");
        tamagotchi.recibirBebida();
        System.out.println("***************************MIMOS***************************");

        tamagotchi.recibirMimos();
    }
}
