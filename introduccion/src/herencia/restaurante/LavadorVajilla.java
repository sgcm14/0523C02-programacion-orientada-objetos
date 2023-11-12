package herencia.restaurante;

public class LavadorVajilla extends EmpleadoLimpieza {
    // Atributo adicional
    private int utensiliosRotos;

    // Constructor
    public LavadorVajilla(String nombre, String apellido, int edad, double sueldo, int utensiliosRotos) {
        super(nombre, apellido, edad, sueldo);
        this.utensiliosRotos = utensiliosRotos;
    }

    // Método para obtener la cantidad de utensilios rotos
    public int getUtensiliosRotos() {
        return utensiliosRotos;
    }

    // Método para calcular el sueldo mensual (override)
    @Override
    public void calcularSueldoMensual() {
        // Implementar lógica para calcular el sueldo descontando frijoles por utensilios rotos
        double sueldoFinal = getSueldo() - (5 * utensiliosRotos);
        System.out.println("Sueldo mensual de " + getNombre() + " " + getApellido() + ": " + sueldoFinal + " frijoles mágicos");
    }
}
