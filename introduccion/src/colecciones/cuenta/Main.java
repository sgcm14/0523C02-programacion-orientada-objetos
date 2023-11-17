package colecciones.cuenta;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan Pérez", 50);

        Cuenta cuenta1 = new Cuenta(123456, 1000);
        Cuenta cuenta2 = new Cuenta(234567, 2000);
        Cuenta cuenta3 = new Cuenta(345678, 3000);

        persona.addCuenta(cuenta1);
        persona.addCuenta(cuenta2);
        persona.addCuenta(cuenta3);

        System.out.println("La persona es mayor de edad: " + persona.esMayorDeEdad());
        System.out.println("El saldo total de la persona es: " + persona.getSaldoTotal());

        persona.mostrarCuentas();
    }
}
