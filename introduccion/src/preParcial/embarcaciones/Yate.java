package preParcial.embarcaciones;

public class Yate extends Embarcacion{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean esLujoso(Yate otroYate){
    return this.cantidadCamarotes>otroYate.cantidadCamarotes;
    }

}
