package colecciones.jugador;

public class Main {
    public static void main(String[] args) {
        Equipo equipo= new Equipo("Equipo A");
        Jugador jugador= new Jugador(20,"Axel",false,true);
        Jugador jugador2= new Jugador(10,"Gloria",false,true);
        Jugador jugador3= new Jugador(1,"victor",true,false);

        equipo.agregarJugador(jugador);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        equipo.mostrarJugadoresTitulares();
        System.out.println("esta es la cantidad de lesionados titulares :::"+equipo.getCantidadDeJugadoresLesionados());

    }
}
