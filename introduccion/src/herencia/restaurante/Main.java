package herencia.restaurante;

public class Main {
    public static void main(String[] args) {
        // Crear un empleado de limpieza general
        EmpleadoLimpieza empleadoGeneral = new EmpleadoLimpieza("Juan", "Pérez", 25, 100);
        empleadoGeneral.calcularSueldoMensual();

        // Crear un lavador de vajilla
        LavadorVajilla lavador = new LavadorVajilla("María", "Gómez", 22, 120, 3);
        lavador.calcularSueldoMensual();
    }
}
