package disenio_composite.hamburgueseria;

public class Cliente {
    public static void main(String[] args) {
        Producto producto1= new Hamburguesa("BigMacDH",10.0);
        Producto producto2= new Acompanamiento("Papa Cheddar",5.0);


        Combo comboDH= new Combo("ComboDH");
        comboDH.agregarProducto(producto1);
        comboDH.agregarProducto(producto2);

        CarritoDeCompras carritoDeCompras= new CarritoDeCompras();
        carritoDeCompras.agregarProducto(producto1);
        carritoDeCompras.agregarProducto(producto2);
        System.out.println("Precio Total sin Combo: "+carritoDeCompras.calcularTotalCompra());
        System.out.println("**** lipiando el carrito****");
        carritoDeCompras.cancelarCarrito();

        System.out.println("**************************PRECIO COMBO**************************");
        carritoDeCompras.agregarProducto(comboDH);
        System.out.println("Precio llevando los productos en Combo: $"+carritoDeCompras.calcularTotalCompra());

    }
}
