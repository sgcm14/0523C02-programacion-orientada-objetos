package composicion.auditoria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Auditoria {
    private List<Hallazgo> hallazgos;

    public Auditoria() {
        this.hallazgos = new ArrayList<>();
    }

    public void levantarHallazgo(String area, Date fechaHallazgo) {
        Hallazgo hallazgo = new Hallazgo(area, fechaHallazgo);
        hallazgos.add(hallazgo);
    }
}
