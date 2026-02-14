import java.util.Scanner;

public class Comisiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el sueldo base del vendedor: ");
        double salario = sc.nextDouble();
        
        System.out.println("Ingrese la primera venta del vendedor: ");
        double venta1 = sc.nextDouble();

        System.out.println("Ingrese la segunda venta del vendedor: ");
        double venta2 = sc.nextDouble();

        System.out.println("Ingrese la tercera venta del vendedor: ");
        double venta3 = sc.nextDouble();

        double comision = (venta1+venta2+venta3)*0.10;

        double totalSalario = salario + comision;

        System.out.println("Total de comisiones: " + comision + "$");
        System.out.println("Total a recibir " + totalSalario + "$");


        sc.close();
    }
}
