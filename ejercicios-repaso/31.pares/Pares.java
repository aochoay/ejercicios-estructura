import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio;
        int fin;

        System.out.println("Ingrese el numero inicial: ");
        inicio = sc.nextInt();

        System.out.println("Ingrese el numero final: ");
        fin = sc.nextInt();

        System.out.println("Los numeros pares entre ambos numeron son: ");
        for(int i = inicio; i <= fin; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
