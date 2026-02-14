import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("Ingrese el tercer numero: ");
        double numero3 = sc.nextDouble();

        double media = (numero1+numero2+numero3)/3;

        System.out.println("La media de los tres números es: " + media);

        sc.close();
    }
}
