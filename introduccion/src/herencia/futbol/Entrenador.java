package herencia.futbol;

public class Entrenador {
    private String tipo;

    public Entrenador(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Entrenador - Tipo: " + tipo;
    }
}
