package disenio_composite.departamentos;

public class App {
    public static void main(String[] args) throws Exception {
        Departamento ventas = new DepartVendas(
            1, "Departamento de Vendas");
        Departamento financiero = new DepartFinanceiro(
            2, "Departamento Financiero");
  
        DepartComposite composite = new DepartComposite(
            3, "Composite");
  
          composite.addDepart(ventas);
          composite.addDepart(financiero);
  
          composite.getName();
    }
}
