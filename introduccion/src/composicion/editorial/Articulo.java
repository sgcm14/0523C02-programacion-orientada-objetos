package composicion.editorial;

import java.util.Date;

public class Articulo {
    private String titulo;
    private String tema;
    private String autor;
    private Date fechaArticulo;

    public Articulo(String titulo, String tema, String autor, Date fechaArticulo) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fechaArticulo = fechaArticulo;
    }

    // Otros atributos y métodos relacionados con el artículo

    // Relación con Edición
    private Edicion edicion;

    public void setEdicion(Edicion edicion) {
        this.edicion = edicion;
    }
}
