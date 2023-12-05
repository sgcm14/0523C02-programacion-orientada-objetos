package agregacion.bicicleta;

public class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Pedal pedales;
    private Freno frenos;
    private Chasis chasis;

    // Constructor de la bicicleta que inicializa sus componentes
    public Bicicleta(int diametroRuedas, String tipoPedales, String tipoFrenos, String materialChasis) {
        this.ruedaDelantera = new Rueda(diametroRuedas);
        this.ruedaTrasera = new Rueda(diametroRuedas);
        this.pedales = new Pedal(tipoPedales);
        this.frenos = new Freno(tipoFrenos);
        this.chasis = new Chasis(materialChasis);
    }

    // Métodos y funcionalidades de la bicicleta

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public Pedal getPedales() {
        return pedales;
    }

    public Freno getFrenos() {
        return frenos;
    }

    public Chasis getChasis() {
        return chasis;
    }

    @Override
    public String toString() {
        return "Bicicleta con " + ruedaDelantera + ", " + ruedaTrasera + ", " + pedales + ", " + frenos + ", " + chasis;
    }
}
