package stringInteger;

public class ejercicio_2 {
    public static void main(String[] args) {

        //int first_number = 10, second_number = 10;
        Integer first_number = 5, second_number = 10;
        int comparar;


        /*if (first_number==second_number) {
            System.out.println("Los dos números son iguales");
        }else if(first_number>second_number){
            System.out.println("El primer número es mayor y el segundo menor");
        } else {
            System.out.println("El segundo número es mayor y el primero menor");
        }*/

        if(first_number.equals(second_number)){
            System.out.println("Los dos números son iguales");
        } else{
            comparar = first_number.compareTo(second_number);
            if(comparar>0){
                System.out.println("El primer número es mayor y el segundo menor");
            }else{
                System.out.println("El segundo número es mayor y el primero menor");
            }
        }

    }
}
