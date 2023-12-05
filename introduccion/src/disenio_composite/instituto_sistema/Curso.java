package disenio_composite.instituto_sistema;

public abstract class Curso {
    private String nombre;
    private String descripcion;

    private int cargaHorariaMensual;
    private int mesesDuracion;
    private int valorHora;

    public Curso(String nombre, String descripcion, int cargaHorariaMensual, int mesesDuracion, int valorHora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.mesesDuracion = mesesDuracion;
        this.valorHora = valorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double calcularPrecio() {
        return cargaHorariaMensual * mesesDuracion * valorHora;
    }
}
