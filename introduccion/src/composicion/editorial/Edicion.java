package composicion.editorial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Edicion {
    private int numeroEdicion;
    private Date fechaEdicion;
    private double precio;

    public Edicion(int numeroEdicion, Date fechaEdicion, double precio) {
        this.numeroEdicion = numeroEdicion;
        this.fechaEdicion = fechaEdicion;
        this.precio = precio;
    }

    // Otros atributos y métodos relacionados con la edición

    // Relación con Revista
    private Revista revista;

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    // Relación con Artículo
    private List<Articulo> articulos = new ArrayList<>();

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }
}
