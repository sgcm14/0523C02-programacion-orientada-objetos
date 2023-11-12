package herencia.colegio;

public class Colegio {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Estudiante1", 16, 1001);
        Profesor profesor1 = new Profesor("Profesor1", 35, 2001, "Licenciado en Educación", 5);
        PersonalAdministrativo admin1 = new PersonalAdministrativo("Admin1", 30, 3001, "Secretario");

        estudiante1.estudiar();
        profesor1.darClases();
        admin1.realizarActividadesAdministrativas();
    }
}
