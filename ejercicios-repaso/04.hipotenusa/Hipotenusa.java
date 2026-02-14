import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la medida del cateto A: ");
        double catetoA = sc.nextDouble();

        System.out.println("Ingrese la medida del cateto B: ");
        double catetoB = sc.nextDouble();

        double hipotenusa = Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoB, 2)));

        System.out.println("La hipotenusa del triangulo es: " + hipotenusa);

        sc.close();


    }
}
