package disenio_composite.Pizzeria;

public abstract class  Pizza {
    private String nombre;
    private String descripcion;

    public abstract double  calcularPrecio();

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String toString() {
        return  "***************************************\n"
                + "Nombre de Pizza: " + this.getNombre() + "\n"
                + "Descripcion: " + this.getDescripcion() + "\n"
                + "Precio: $" + this.calcularPrecio() + "\n";
    }

}
