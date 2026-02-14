import java.util.Scanner;

public class PotenciaCiclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base;
        int exponente;
        double resultado = 1;

        System.out.println("Ingrese la base: ");
        base = sc.nextDouble();

        System.out.println("Ingrese el exponente: ");
        exponente = sc.nextInt();
        
        
        for(int i = 0; i < exponente; i++){
            resultado = resultado * base;
        }

        System.out.println("El resultado de la potencia es: " + resultado);
        
        sc.close();
    }
}
