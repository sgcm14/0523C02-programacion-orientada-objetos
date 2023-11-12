package preParcial.examenes;

public class Main {
    public static void main(String[] args) {
        // Crear un alumno
        Alumno alumno1 = new Alumno("Juan", "Perez", 12345);

        // Crear un parcial para el alumno
        Parcial parcial1 = new Parcial(alumno1, "Parcial de Matemáticas", "Resolver problemas", 7, 2);

        // Realizar recuperación del parcial
        if (parcial1.esPosibleRecuperar()) {
            // Realizar la recuperación
            // ...
            // Actualizar el contador de intentos de recuperación
            parcial1.incrementarIntentosRecuperacion();
        }

        // Verificar si el parcial está aprobado
        if (parcial1.estaAprobado()) {
            System.out.println("El parcial está aprobado.");
        } else {
            System.out.println("El parcial no está aprobado.");
        }

        // Crear un examen final para el alumno
        ExamenFinal final1 = new ExamenFinal(alumno1, "Examen Final de Física", "Resolver problemas", 8, 9, "Presentación oral sobre Leyes de Newton");

        // Crear otro examen final para comparación
        ExamenFinal final2 = new ExamenFinal(alumno1, "Otro Examen Final de Física", "Resolver problemas", 7, 8, "Presentación oral sobre Termodinámica");

        // Comparar los exámenes finales
        if (final1.esMayor(final2)) {
            System.out.println("El primer examen final es mayor que el segundo.");
        } else {
            System.out.println("El segundo examen final es mayor que el primero.");
        }
    }
}
