package composicion.editorial;

import java.util.ArrayList;
import java.util.List;

public class Revista {
    private String nombre;
    private String codigo;
    private Periodicidad periodicidad;

    public Revista(String nombre, String codigo, Periodicidad periodicidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
    }

    // Otros atributos y métodos relacionados con la revista

    // Relación con Editorial
    private Editorial editorial;

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    // Relación con Edición
    private List<Edicion> ediciones = new ArrayList<>();

    public void agregarEdicion(Edicion edicion) {
        ediciones.add(edicion);
    }
}
