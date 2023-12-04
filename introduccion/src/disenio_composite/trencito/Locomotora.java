package disenio_composite.trencito;

import java.util.ArrayList;
import java.util.List;

public class Locomotora extends Figura{
    private List<Vagon> lstVagones = new ArrayList<>();

    public void agregarVagon(Vagon vagon){
        lstVagones.add(vagon);
    }

    @Override
    public Double calcularArea() {
        double areaTotal = 0;
        for (Vagon vagon : lstVagones) {
            areaTotal += vagon.calcularArea();
        }
        return areaTotal;
    }
}
