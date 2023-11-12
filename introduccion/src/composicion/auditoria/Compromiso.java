package composicion.auditoria;

import java.util.Date;

public class Compromiso {
    private String descripcion;
    private String responsable;
    private Date fechaCompromiso;

    public Compromiso(String descripcion, String responsable, Date fechaCompromiso) {
        this.descripcion = descripcion;
        this.responsable = responsable;
        this.fechaCompromiso = fechaCompromiso;
    }

    public void realizarAccionCorrectiva() {
        // Lógica para realizar la acción correctiva
    }
}
