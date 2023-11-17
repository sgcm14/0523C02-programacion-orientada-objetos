package colecciones.puerto;

public class Contenedor implements Comparable<Contenedor> {
    private int numero;
    private String paisProcedencia;
    private boolean transportaMaterialesPeligrosos;

    public Contenedor(int numero, PaisProcedencia paisProcedencia, boolean transportaMaterialesPeligrosos) {
        this.numero = numero;
        this.paisProcedencia = paisProcedencia.toString();
        this.transportaMaterialesPeligrosos = transportaMaterialesPeligrosos;
    }

    public int getNumero() {
        return numero;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public boolean isTransportaMaterialesPeligrosos() {
        return transportaMaterialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedor otroContenedor) {
        return Integer.compare(this.numero, otroContenedor.numero);
    }
}
