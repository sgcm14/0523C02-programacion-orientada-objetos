package herencia.futbol;

public class EquipoFutbol {
    public static void main(String[] args) {
        // Crear instancias de futbolistas
        Futbolista delantero = new Futbolista("Delantero", "Titular");
        Futbolista defensa = new Futbolista("Defensa", "Suplente");

        // Crear instancias de presidente, entrenadores y fisioterapeutas
        Presidente presidente = new Presidente();
        Entrenador entrenadorPrincipal = new Entrenador("Principal");
        Entrenador entrenadorAsistente = new Entrenador("Asistente");
        Fisioterapeuta fisioterapeuta = new Fisioterapeuta();

        // Mostrar información
        System.out.println("Información del equipo de fútbol:");
        System.out.println(delantero);
        System.out.println(defensa);
        System.out.println(presidente);
        System.out.println(entrenadorPrincipal);
        System.out.println(entrenadorAsistente);
        System.out.println(fisioterapeuta);
    }
}
