package clases;

public class Cliente {
    private int numeroCliente;
    private String nombre;
    private double deuda;

    public Cliente(int numero, String nombre) {
        this.numeroCliente = numero;
        this.nombre = nombre;
        this.deuda = 0.0;
    }

    public void incrementarDeuda(double valor) {
        if (valor > 0) {
            this.deuda += valor;
        }
    }

    public void pagarDeuda() {
        this.deuda = 0.0;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public static void main(String[] args) {
        // Crear un objeto Cliente
        Cliente cliente = new Cliente(1, "EjemploCliente");

        // Mostrar el estado inicial del cliente
        System.out.println("Número de Cliente: " + cliente.getNumeroCliente());
        System.out.println("Nombre del Cliente: " + cliente.getNombre());
        System.out.println("Deuda inicial: " + cliente.getDeuda());

        // Realizar acciones con el cliente
        cliente.incrementarDeuda(100.0);
        cliente.incrementarDeuda(50.0);
        cliente.pagarDeuda();

        // Mostrar el estado actual del cliente
        System.out.println("Deuda actual: " + cliente.getDeuda());
    }
}

