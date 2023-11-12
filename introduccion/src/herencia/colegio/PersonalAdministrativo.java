package herencia.colegio;

public class PersonalAdministrativo extends Persona {
    private int numeroLegajo;
    private String cargo;

    public PersonalAdministrativo(String nombre, int edad, int numeroLegajo, String cargo) {
        super(nombre, edad);
        this.numeroLegajo = numeroLegajo;
        this.cargo = cargo;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void realizarActividadesAdministrativas() {
        System.out.println(getNombre() + " está realizando actividades administrativas.");
    }
}
