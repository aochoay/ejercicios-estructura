import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        int exponente;
        double resultado;

        System.out.println("Ingrese la base: ");
        base = sc.nextDouble();

        System.out.println("Ingrese el exponente: ");
        exponente = sc.nextInt();

        if(exponente > 0){
            resultado = Math.pow(base, exponente);
        } else if(exponente == 0){
            resultado = 1;
        } else{
            resultado = 1 / Math.pow(base, -exponente);
        }


        System.out.println("El resultado es: " + resultado);

        sc.close();
    }
}
