import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        double numero = sc.nextDouble();

        if(numero == 0){
            System.out.println("El numero es cero.");
        } 
        else if(numero < 0){
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es positivo");
        }


        sc.close();
    }
}
