package colecciones.jugador;

public class Jugador implements Comparable<Jugador> {
    private int numeroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private  Boolean titular;

    public Jugador(int numeroCamiseta, String nombre, Boolean estaLesionado, Boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.titular = titular;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public Boolean getTitular() {
        return titular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        // -1 el objeto actual es menor
        // 0 el objeto actual es igual
        //1 el objeto actual es mayor
        return Integer.compare(numeroCamiseta, otroJugador.getNumeroCamiseta());
    }
}
