import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A,B,C;

        System.out.println("Ingrese el lado A:");
        A = sc.nextDouble();

        System.out.println("Ingrese el lado B:");
        B = sc.nextDouble();

        System.out.println("Ingrese el lado C:");
        C = sc.nextDouble();

        if((A*A + B*B == C*C) || (A*A + C*C == B*B) || B*B + C*C == A*A){
            System.out.println("El triangulo es rectangulo");
        }
        else if(A==B && B == C){
            System.out.println("El triangulo es equilatero");
        }
        else if(A == B || A == C || B == C){
            System.out.println("Es un triangulo isosceles");
        }
        else{
            System.out.println("Es un triangulo escaleno");
        }
        
        sc.close();
    }
}
