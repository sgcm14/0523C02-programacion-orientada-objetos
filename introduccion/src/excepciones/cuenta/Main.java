package excepciones.cuenta;

public class Main {
    public static void main(String[] args) {
        try{
            Cliente cliente= new Cliente("Jorgito","Pereyra","123333",100.0);
            cliente.comprar(40);
            cliente.saldarDeuda(10);


        }catch (ClienteException clienteException){
            System.out.println(clienteException.getMessage()); //solamente ver el mensaje

        }finally {
            try {
//                int y=6/0;

                System.out.println("***** Esperamos que haya disfrutado de la compra*****");
            }catch (Exception e){
                e.printStackTrace(); //mostras la trazabilidad completa.
            }
        }

    }
}
