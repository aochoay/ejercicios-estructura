import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese x1: ");
        double x1 = sc.nextDouble();

        System.out.println("Ingrese y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Ingrese x2: ");
        double x2 = sc.nextDouble();

        System.out.println("Ingrese y2: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));

        System.out.println("La distancia entre los puntos es: " + distancia);




        sc.close();
    }
}
