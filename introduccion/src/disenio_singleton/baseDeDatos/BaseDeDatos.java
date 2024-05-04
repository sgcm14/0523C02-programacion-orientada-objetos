package disenio_singleton.baseDeDatos;

public class BaseDeDatos {
    //Atributo con el mismo nombre de la clase
    private static BaseDeDatos instance = new BaseDeDatos();

    //Construtor privado
    private BaseDeDatos(){
        /*Inicializaciones*/
        System.out.println("Se ha creado una instancia de la base de datos.");
    }

    //Método getInstance() estático
    public static BaseDeDatos getInstance(){
        return instance;
    }

}
