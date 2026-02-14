import java.util.Scanner;

public class Telefonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos;
        String dia;
        String turno;
        double costo = 0;
        double impuesto = 0;
        double total;

        System.out.println("Ingrese la duración de la llamada: ");
        minutos = sc.nextInt();
        sc.nextLine();

        if (minutos <= 5) {
            costo = minutos;
        }
        else if(minutos <= 8){
            costo = 5 + ((minutos - 5) * 0.80);
        }
        else if (minutos <= 10) {
            costo = 5 + (3*0.80) + ((minutos - 8) * 0.70);
        } else{
            costo = 5 + (3*0.80) + (2*0.70) + ((minutos - 10) * 0.50);
        }

        System.out.println("Ingrese el día: ");
        dia = sc.nextLine().toLowerCase();

        if(dia.equals("domingo")){
            impuesto = costo * 0.03;
        } 
        else{
            System.out.println("Ingrese el turno (mañana o tarde): ");
            turno = sc.nextLine().toLowerCase();

            if(turno.equals("mañana")){
                impuesto = costo * 0.15;
            } else{
                impuesto = costo * 0.10;
            }
        }

        total = costo + impuesto;

        System.out.println("Costo base " + costo);
        System.out.println("Impuesto " + impuesto);
        System.out.println("Total a pagar: " + total);

        sc.close();
    }
}
