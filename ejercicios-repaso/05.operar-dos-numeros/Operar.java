import java.util.Scanner;

public class Operar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("La suma de ambos numero es: " + (numero1+numero2));
        System.out.println("La resta de ambos numero es: " + (numero1-numero2));
        System.out.println("La multipliación de ambos numero es: " + (numero1*numero2));
        System.out.println("La división de ambos numero es: " + (numero1/numero2));

        sc.close();
    }



}
