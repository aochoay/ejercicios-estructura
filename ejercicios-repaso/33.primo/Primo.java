import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int divisores = 0;

        System.out.println("Ingrese el numero para verificar si es primo: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if (num % i == 0) {
                divisores += 1;
            }
        }

        if (divisores == 2) {
            System.out.println("El numero es primo");
        } else{
            System.out.println("El numero no es primo");
        }

        sc.close();
    }
}
