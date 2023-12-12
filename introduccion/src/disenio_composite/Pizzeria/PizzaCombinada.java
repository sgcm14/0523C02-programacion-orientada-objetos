package disenio_composite.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<PizzaSimple> pizzas= new ArrayList<>();

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    void agregarPizza(PizzaSimple pizza){
        pizzas.add(pizza);
    }

    @Override
    public double calcularPrecio() {
       double precioTotal=0;
        if (!pizzas.isEmpty()) {
            PizzaSimple pizzaMasCara = pizzas.stream()
                    .max((pizza1, pizza2) -> pizza1.compareTo(pizza2))
                    .orElse(null);

            if (pizzaMasCara != null) {
                precioTotal = pizzaMasCara.calcularPrecio();
            }
        }

        return precioTotal;
    }
}
