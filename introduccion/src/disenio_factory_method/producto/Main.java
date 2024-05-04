package disenio_factory_method.producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        try{
            System.out.println("***********Bienvenidos al almacen************");
            Scanner scanner= new Scanner(System.in);

            boolean siDeseaAgregarMasProductos = true;
            Almacen almacen = new Almacen();

            while(siDeseaAgregarMasProductos){
                System.out.println("Ingrese el tipo de producto: 1: CAJA10X10, 2: PELOTAFUTBOL, 3: PELOTATENIS");
                String entrada= scanner.nextLine();
                String tipoProducto = "";
                if(entrada.equals("1")){
                    tipoProducto = "CAJA10X10";
                }else if(entrada.equals("2")){
                    tipoProducto = "PELOTAFUTBOL";
                }else if(entrada.equals("3")){
                    tipoProducto = "PELOTATENIS";
                }
                Producto producto = ProductoFactory.calcularEspacio(tipoProducto);
                almacen.agregarProducto(producto);

                // Si desea continuar agregando productos
                System.out.println("Si desea continuar agregando productos, digite SI");
                entrada = scanner.nextLine();
                if(!entrada.equalsIgnoreCase("si")){
                    siDeseaAgregarMasProductos = false;
                }
            }
            System.out.println("Cálculo espacio necesario para el almacén: " + almacen.calcularEspacioNecesario() + " cms");
            scanner.close();
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
    }
}
