import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra: ");
        double compra = sc.nextDouble();

        double totalPagar = compra - (compra*0.15);

        System.out.println("El total a pagar con el descuento aplicado es de : " + totalPagar + "$");

        sc.close();
    }
}
