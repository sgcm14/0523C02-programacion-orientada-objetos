package disenio_state.tamagotchi;

public class Tamagotchi {
    private EstadoTamagotchi estado;


    public Tamagotchi(){
        estado= new Triste();//inicializamos el estado de la mascota
    }
    //los metodos de tamagotchi

    public void recibirComida(){
        estado.recibirComida();
        if(estado instanceof Hambriento){
            estado= new Feliz();
        } else if (estado instanceof Triste) {
            System.out.println("la mascota dice: ");
            estado.recibirComida();
                    } else if (estado instanceof  Sediento) {
            estado= new Triste();
        } else if (estado instanceof Feliz) {
            estado= new Sediento();
        }
    };
    public void recibirBebida(){
        estado.recibirBebida();
        if(estado instanceof Feliz){
            estado= new Hambriento();
            estado.recibirBebida();
        } else if (estado instanceof Triste) {
            System.out.println("la mascota dice: ");
                estado.recibirBebida();
        } else if (estado instanceof  Hambriento) {
            estado= new Triste();
                    } else if (estado instanceof  Sediento) {
            estado= new Feliz();

        }
    };
    public void recibirMimos(){
        estado.recibirMimos();
        if(estado instanceof  Triste){
            estado= new Feliz();
        } else if (estado instanceof  Feliz) {
            estado.recibirMimos();
                    } else if (estado instanceof  Sediento) {
            estado.recibirMimos();
                    } else if (estado instanceof  Hambriento) {
            estado.recibirMimos();

        }

    };
}
