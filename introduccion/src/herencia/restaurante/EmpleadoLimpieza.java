package herencia.restaurante;

public class EmpleadoLimpieza {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;  // Sueldo en frijoles mágicos

    // Constructor
    public EmpleadoLimpieza(String nombre, String apellido, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    // Método para calcular el sueldo mensual
    public void calcularSueldoMensual() {
        // Implementar lógica para calcular el sueldo base
    }
}
