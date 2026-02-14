import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();

        if(numero1 > numero2) 
            System.out.println("El primer numero es mayor que el segundo");
        else{
            System.out.println("El primer numero NO es mayor que el segundo");
        } 

        sc.close();
    }
}
