package disenio_singleton.baseDeDatos;

public class Main {
    public static void main(String[] args) {
        // Intentamos crear varias instancias de BaseDeDatos
        BaseDeDatos db1 = BaseDeDatos.getInstance();
        BaseDeDatos db2 = BaseDeDatos.getInstance();
        BaseDeDatos db3 = BaseDeDatos.getInstance();

        // Comprobamos si las instancias son iguales
        System.out.println("¿db1 es igual a db2?: " + (db1 == db2));
        System.out.println("¿db1 es igual a db3?: " + (db1 == db3));
        System.out.println("¿db2 es igual a db3?: " + (db2 == db3));
    }
}

