package agregacion.bicicleta;

public class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Pedales pedales;
    private Frenos frenos;
    private Chasis chasis;

    // Constructor de la bicicleta que inicializa sus componentes
    public Bicicleta(int diametroRuedas, String tipoPedales, String tipoFrenos, String materialChasis) {
        this.ruedaDelantera = new Rueda(diametroRuedas);
        this.ruedaTrasera = new Rueda(diametroRuedas);
        this.pedales = new Pedales(tipoPedales);
        this.frenos = new Frenos(tipoFrenos);
        this.chasis = new Chasis(materialChasis);
    }

    // Métodos y funcionalidades de la bicicleta

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public Pedales getPedales() {
        return pedales;
    }

    public Frenos getFrenos() {
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
