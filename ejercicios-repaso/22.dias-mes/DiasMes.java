import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes;

        System.out.println("Ingrese el número del mes(1-12): ");
        mes = sc.nextInt();
        
        if(mes < 1 || mes > 12){
            System.out.println("Mes invalido");
        } 
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            System.out.println("El mes tiene 30 dias.");
        }
        else if(mes==2){
            System.out.println("El mes tiene 28 días");
        }
        else{
            System.out.println("El mes tiene 31 dias");
        }

        sc.close();
    }
}
