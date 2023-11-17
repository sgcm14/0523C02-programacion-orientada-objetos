package colecciones.puerto;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        puerto.ingresarContenedor(new Contenedor(6, PaisProcedencia.CHINA, false));
        puerto.ingresarContenedor(new Contenedor(1, PaisProcedencia.EEUU, true));
        puerto.ingresarContenedor(new Contenedor(4, PaisProcedencia.BRASIL, false));
        puerto.ingresarContenedor(new Contenedor(3, PaisProcedencia.DESCONOCIDA, true));
        puerto.ingresarContenedor(new Contenedor(2, PaisProcedencia.DESCONOCIDA, true));
        puerto.ingresarContenedor(new Contenedor(5, PaisProcedencia.CANADA, true));


        System.out.println("Contenedores Ordenados:");
        puerto.mostrarContenedoresOrdenados();

        int contadoresPeligrososDesconocidos = puerto.calcularContenedoresPeligrososDesconocidos();
        System.out.println("Cantidad de Contenedores Peligrosos de Procedencia Desconocida: " + contadoresPeligrososDesconocidos);
    }
}

