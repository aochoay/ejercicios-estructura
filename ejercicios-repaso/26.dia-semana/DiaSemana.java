import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("Ingrese el día de la semana (1-7): ");
        dia = sc.nextInt();
        
        if(dia <= 0 || dia > 7){
            System.out.println("Error. Dia inválido");
        } else{
            System.out.println(dias[dia-1]);
        }

        sc.close();
    }
}
