package disenio_composite.trencito;

import java.util.ArrayList;
import java.util.List;

public class Vagon extends Figura{
    private List<Figura> lstFiguras = new ArrayList<>();

    public void agregarFigura(Figura figura){
        lstFiguras.add(figura);
    }
    @Override
    public Double calcularArea() {
        double areaTotal = 0;
        for (Figura figura : lstFiguras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}
