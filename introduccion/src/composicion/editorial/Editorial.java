package composicion.editorial;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String nombre;

    public Editorial(String nombre) {
        this.nombre = nombre;
    }

    // Otros atributos y métodos relacionados con la editorial

    // Relación con Revista
    private List<Revista> revistas = new ArrayList<>();

    public void agregarRevista(Revista revista) {
        revistas.add(revista);
    }
}
