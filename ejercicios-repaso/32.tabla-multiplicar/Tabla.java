import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para conocer su tabla de multiplicar: ");
        numero = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }

        sc.close();
    }
}
