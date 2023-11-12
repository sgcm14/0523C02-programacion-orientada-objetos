package composicion.auditoria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hallazgo {
    private String area;
    private Date fechaHallazgo;
    private List<Compromiso> compromisos;
    private String estado;

    public Hallazgo(String area, Date fechaHallazgo) {
        this.area = area;
        this.fechaHallazgo = fechaHallazgo;
        this.compromisos = new ArrayList<>();
        this.estado = "Normal";
    }

    public void agregarCompromiso(String descripcion, String responsable, Date fechaCompromiso) {
        Compromiso compromiso = new Compromiso(descripcion, responsable, fechaCompromiso);
        compromisos.add(compromiso);
    }

    public void calcularEstado() {
        // Lógica para determinar si el hallazgo está en estado crítico
    }
}
