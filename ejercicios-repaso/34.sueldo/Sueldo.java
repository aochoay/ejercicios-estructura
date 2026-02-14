import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double horas, pagoHora;
        double sueldo;
        double totalEmpresa = 0;

        System.out.println("Ingrese el numero de trabajadores: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            System.out.println("\nTrabajador " + i);

            System.out.println("Ingrese las horas trabajadas: ");
            horas = sc.nextDouble();

            System.out.println("Ingrese el pago por hora: ");
            pagoHora = sc.nextDouble();

            sueldo = horas * pagoHora;

            System.out.println("Sueldo semanal del trabajador " + i + ": $" + sueldo);

            totalEmpresa += sueldo;
        }

        System.out.println("\nTotal pagado por la empresa: $" + totalEmpresa);

        sc.close();
    }
}
