package colecciones.cuenta;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private ArrayList<Cuenta> cuentas;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void addCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    public boolean esMayorDeEdad() {
        return edad >= 60;
    }

    public double getSaldoTotal() {
        double saldoTotal = 0;
        for (Cuenta cuenta : cuentas) {
            saldoTotal += cuenta.getSaldo();
        }
        return saldoTotal;
    }

    public void mostrarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta() + ", saldo: " + cuenta.getSaldo());
        }
    }
}
