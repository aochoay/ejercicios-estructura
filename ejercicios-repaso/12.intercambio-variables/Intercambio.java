import java.util.Scanner;

public class Intercambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        double var1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double var2 = sc.nextDouble();

        double aux = var1;
        var1 = var2;
        var2 = aux;

        System.out.println("El valor en la variable 1 es: " + var1 +"\nEl valor en la variable 2 es: " + var2);

        sc.close();
    }
}
