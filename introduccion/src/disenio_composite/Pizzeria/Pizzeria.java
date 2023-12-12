package disenio_composite.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> listaPizzas = new ArrayList<>();

    public Pizzeria() {
    }

    public void agregarMenu(Pizza pizza) {
        listaPizzas.add(pizza);
    }

    public String mostrar() {
        StringBuilder mensaje = new StringBuilder("****************Menú******************\n");
        for(Pizza pizza : listaPizzas) {
            mensaje.append(pizza.toString());
        }
        return mensaje.toString();
    }

}
