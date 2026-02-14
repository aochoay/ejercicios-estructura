import java.util.Scanner;

public class Perimetro {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();

        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = (2 * base) + (2*altura);

        System.out.println("El area del rectangulo es: " + area + "\nEl perimetro del rectangulo es: " + perimetro);

        sc.close();
    }
}
