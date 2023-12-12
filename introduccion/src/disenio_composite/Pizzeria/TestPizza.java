package disenio_composite.Pizzeria;

public class TestPizza {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*--");
        System.out.println("Pizzeria DH");
        System.out.println("--*--*--*--*--*--*--*--*--*--*--*--*--");

        PizzaSimple muzzarella = new PizzaSimple("Muzzarella","Pizza con muzarella",700,false );
        PizzaSimple margarita = new PizzaSimple("Margarita","Pizza con margarita",850,true );
        PizzaSimple anana = new PizzaSimple("Anana","Pizza con anana",950,false );

        PizzaCombinada loca = new PizzaCombinada("Loca","Pizza loca");
        loca.agregarPizza(margarita);
        loca.agregarPizza(anana);


        pizzeria.agregarMenu(muzzarella);
        pizzeria.agregarMenu(margarita);
        pizzeria.agregarMenu(anana);
        pizzeria.agregarMenu(loca);

        System.out.println(pizzeria.mostrar());
    }
}
