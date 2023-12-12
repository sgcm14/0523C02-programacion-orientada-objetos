package disenio_composite.Pizzeria;

public class PizzaSimple extends Pizza{
    private double precioBase;
    private boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion, double precioBase, boolean esEspecial) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;
    }

    @Override
    public double calcularPrecio() {
        double precioTotal=0.0;
        if(esEspecial){
            precioTotal= this.precioBase*1.7;
        } else{
            precioTotal=this.precioBase;
        }
        return precioTotal;
    }


    public int compareTo(PizzaSimple otraPizza) {
        return Double.compare(this.calcularPrecio(), otraPizza.calcularPrecio());
    }


}
