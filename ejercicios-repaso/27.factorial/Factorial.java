import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int factorial = 1;

        System.out.println("Ingrese el numero para calcular su factorial: ");
        numero = sc.nextInt();

        for(int i = 1; i <= numero; i++){
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);

        sc.close();
    }
}
