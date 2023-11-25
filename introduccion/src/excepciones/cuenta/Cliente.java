package excepciones.cuenta;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni; //cedula
    private double saldoDeudor;
    private double limiteDeCompra;
    private double deudaTotal;

    public Cliente(String nombre, String apellido, String dni, double limiteDeCompra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limiteDeCompra = limiteDeCompra;
        this.deudaTotal=0;
        this.saldoDeudor=0;

    }
    public void comprar(double importe) throws ClienteException{
        if(saldoDeudor+importe<limiteDeCompra){
            System.out.println("Compra realiza con exito por un monto de : "+importe);
            saldoDeudor+=importe;
            deudaTotal= deudaTotal+saldoDeudor;
            System.out.println("**************************");
            System.out.println("deuda acumulada: "+saldoDeudor);
        }else{
            throw new ClienteException("No se puede realizar dicha compra, debido a que supera el importe establecido como limite de compra");
        }
        }
    public  void saldarDeuda(double importe) throws ClienteException{
        System.out.println("*************************Bienvenidos al sistema de pagos online*************************");
        System.out.println("Usted esta abonando con $: "+importe);
        System.out.println("Su deuda total con nosotros es: "+deudaTotal);
       if(importe>deudaTotal){
         double cancelacion=importe-deudaTotal;
          throw new ClienteException("saldo a favor: "+cancelacion);
               }else{
           if(importe>0){
               double cancelacionParcial= deudaTotal-importe;
               throw new ClienteException("deuda parcial cancelada en: "+cancelacionParcial);
           }else{
               throw new ClienteException("No se puede abonar sin dinero");
           }
       }
    }
    }

