package herencia.futbol;

public class Futbolista {
    private String posicion;
    private String estatus;

    public Futbolista(String posicion, String estatus) {
        this.posicion = posicion;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Futbolista - Posición: " + posicion + ", Estatus: " + estatus;
    }
}
