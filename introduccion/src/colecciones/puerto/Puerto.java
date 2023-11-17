package colecciones.puerto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores;

    public Puerto() {
        this.contenedores = new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void mostrarContenedoresOrdenados() {
//        Collections.sort(contenedores);
//        for (Contenedor contenedor : contenedores) {
//            System.out.println("Número: " + contenedor.getNumero() +
//                    ", País de Procedencia: " + contenedor.getPaisProcedencia() +
//                    ", Transporta Materiales Peligrosos: " + contenedor.isTransportaMaterialesPeligrosos());
//        }

        contenedores.stream()
                .sorted()
                .forEach(contenedor -> System.out.println("Número: " + contenedor.getNumero() +
                        ", País de Procedencia: " + contenedor.getPaisProcedencia() +
                        ", Transporta Materiales Peligrosos: " + contenedor.isTransportaMaterialesPeligrosos()));
    }

    public int calcularContenedoresPeligrososDesconocidos() {
//        int contador = 0;
//        for (Contenedor contenedor : contenedores) {
//            if (contenedor.isTransportaMaterialesPeligrosos() && contenedor.getPaisProcedencia().equals(PaisProcedencia.DESCONOCIDA.name())) {
//                contador++;
//            }
//        }
//        return contador;

        return (int) contenedores.stream()
                .filter(contenedor -> contenedor.isTransportaMaterialesPeligrosos() && contenedor.getPaisProcedencia().equals(PaisProcedencia.DESCONOCIDA.name()))
                .count();
    }

}

