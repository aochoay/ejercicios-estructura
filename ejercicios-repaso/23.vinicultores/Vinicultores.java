import java.util.Scanner;

public class Vinicultores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precioInicial, precioAjustado, kilos, total; 
        String tipo;
        int tamaño;

        System.out.println("Ingrese el precio inicial por kilo: ");
        precioInicial = sc.nextDouble();

        System.out.println("Ingrese la cantidad de kilos: ");
        kilos = sc.nextDouble();

        System.out.println("Ingrese el tipo de uva (A o B): ");
        tipo = sc.next().toUpperCase();

        System.out.println("Ingrese el tamaño (1 o 2): ");
        tamaño = sc.nextInt();

        precioAjustado = precioInicial;

        if(tipo.equals("A") && tamaño == 1){
            precioAjustado = precioAjustado + 0.20;
        } else if (tipo.equals("A") && tamaño == 2){
            precioAjustado = precioAjustado + 0.30;
        } else if(tipo.equals("B") && tamaño == 1){
            precioAjustado = precioAjustado - 0.30;
        } else if(tipo.equals("B") && tamaño == 2){
            precioAjustado = precioAjustado - 0.50;
        }

        total = precioAjustado * kilos;

        System.out.println("Ganancia obtenida: " + total);

        sc.close();


    }
}
