package clases;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private int puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;
    }

    public void aumentarPuntaje() {
        this.puntaje++;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void bonus(int valor) {
        this.puntaje += valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public static void main(String[] args) {
        // Crear un objeto UsuarioJuego
        UsuarioJuego usuario = new UsuarioJuego("EjemploUsuario", "clave123");

        // Mostrar el estado inicial del usuario
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Puntaje inicial: " + usuario.getPuntaje());
        System.out.println("Nivel inicial: " + usuario.getNivel());

        // Realizar acciones en el juego
        usuario.aumentarPuntaje();
        usuario.subirNivel();
        usuario.bonus(10);

        // Mostrar el estado actual del usuario
        System.out.println("Puntaje actual: " + usuario.getPuntaje());
        System.out.println("Nivel actual: " + usuario.getNivel());
    }
}

