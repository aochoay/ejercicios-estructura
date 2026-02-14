import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numero;

        int numRandom = rand.nextInt(100) + 1;
        boolean ganador = false;

        System.out.println(numRandom);

        for(int i = 1; i <= 10; i++){
            System.out.println("\nIntenta adivinar el numero aleatorio: " );
            System.out.println("Te quedan " + (11-i) + " intentos");
            numero = sc.nextInt();

            if (numero == numRandom) {
                System.out.println("Has acertado en " + i + " intento(s)");
                ganador = true;
                break;
            }
            else if(numero < numRandom){
                System.out.println("El numero a adivinar es mayor");
            } else{
                System.out.println("El numero a adivinar es menor");
            }
        }

        if (ganador == false) {
            System.out.println("Has perdido. El numero aleatorio era: " + numRandom);
        }

        sc.close();
    }
}
