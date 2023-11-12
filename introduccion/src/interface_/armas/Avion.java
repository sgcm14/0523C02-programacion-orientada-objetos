package interface_.armas;

public class Avion implements SistemaArmas, VehiculoVolador {
    // Implementaciones de las operaciones
    @Override
    public void atacar() {
        // Lógica de ataque para el avión
    }

    @Override
    public void defender() {
        // Lógica de defensa para el avión
    }

    @Override
    public void mostrarse() {
        // Lógica para mostrar los datos del avión en pantalla
    }

    // Implementación de la operación de volar
    @Override
    public void volar() {
        // Lógica para volar
    }
}
