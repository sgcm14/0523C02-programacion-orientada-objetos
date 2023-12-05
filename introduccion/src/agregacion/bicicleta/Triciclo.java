package agregacion.bicicleta;

public class Triciclo {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Pedal pedales;
    private Freno frenos;
    private Chasis chasis;

    // Constructor del triciclo que recibe los componentes de la bicicleta
    public Triciclo(Rueda ruedaDelantera, Rueda ruedaTrasera, Pedal pedales, Freno frenos, Chasis chasis) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.pedales = pedales;
        this.frenos = frenos;
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Triciclo con " + ruedaDelantera + ", " + ruedaTrasera + ", " + pedales + ", " + frenos + ", " + chasis;
    }
}
