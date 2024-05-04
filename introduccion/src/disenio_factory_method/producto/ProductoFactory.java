package disenio_factory_method.producto;

public abstract class ProductoFactory {
    public static Producto calcularEspacio(String tipo) throws RuntimeException{
        if("PELOTAFUTBOL".equalsIgnoreCase(tipo)){
            return new ProductoPelota(11); //cms
        } else if ("CAJA10X10".equalsIgnoreCase(tipo)) {
            return new ProductoCaja(10,10,10); //cms
        } else if ("PELOTATENIS".equalsIgnoreCase(tipo)) {
            return new ProductoPelota(0.32); // cms
        }  else {
            throw new IllegalArgumentException("Tipo de producto no válido:  "+tipo);
        }
    }
}
