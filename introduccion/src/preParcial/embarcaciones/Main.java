package preParcial.embarcaciones;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Jack","Sparrow","123");
        Yate yate1 = new Yate(capitan1,50.0,25.0,2021,150.20,20);
        Yate yate2 = new Yate(capitan1,30.0,5.0,2020,100.20,10);

        Velero velero = new Velero(capitan1,30.0,10.00,2019,5.0,2);

        System.out.println("El yate1 es mas lujoso que el yate2: "+ yate1.esLujoso(yate2));
        System.out.println("El velero es grande: "+ velero.esGrande());
        System.out.println("El monto de alquiler del yate1: "+ yate1.calcularMontoAlquiler());
        System.out.println("El monto de alquiler del yate2: "+ yate2.calcularMontoAlquiler());
        System.out.println("El monto de alquiler del valero: "+ velero.calcularMontoAlquiler());
    }
}
