package colecciones.jugador;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;

    private List<Jugador> listaJugadores=new ArrayList<>(); //asociando 1 equipo a muchos jugadores
    //int contador=0;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador jugador){
        listaJugadores.add(jugador);

    }
    public void mostrarJugadoresTitulares(){
        System.out.println("Estos son los jugadores titulares:");
      listaJugadores.stream().filter(Jugador::getTitular).sorted().forEach(jugador -> System.out.println("Nombre: "+jugador.getNombre()+" numero de Camiseta: "+jugador.getNumeroCamiseta()));

    }
    public int getCantidadDeJugadoresLesionados(){
        /*for (Jugador jugador : listaJugadores) {
            if(jugador.getEstaLesionado()&& jugador.getTitular()){

                contador++;
            }
            
        }*/
        return (int)listaJugadores.stream().filter(jugador -> jugador.getTitular()&& jugador.getEstaLesionado()).count();
    }
}
