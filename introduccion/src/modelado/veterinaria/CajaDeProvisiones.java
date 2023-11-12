package modelado.veterinaria;

public class CajaDeProvisiones {
    // Atributos
    private double pesoTotal;
    private String origen;
    private String nombreProveedor;
    private String descripcionContenido;
    private boolean cuidadoFragil;

    // Constructor
    public CajaDeProvisiones(double pesoTotal, String origen, String nombreProveedor,
                             String descripcionContenido, boolean cuidadoFragil) {
        this.pesoTotal = pesoTotal;
        this.origen = origen;
        this.nombreProveedor = nombreProveedor;
        this.descripcionContenido = descripcionContenido;
        this.cuidadoFragil = cuidadoFragil;
    }

    // Métodos getters y setters
    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDescripcionContenido() {
        return descripcionContenido;
    }

    public void setDescripcionContenido(String descripcionContenido) {
        this.descripcionContenido = descripcionContenido;
    }

    public boolean isCuidadoFragil() {
        return cuidadoFragil;
    }

    public void setCuidadoFragil(boolean cuidadoFragil) {
        this.cuidadoFragil = cuidadoFragil;
    }

}
