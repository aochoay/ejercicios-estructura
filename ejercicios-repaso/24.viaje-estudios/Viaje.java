import java.util.Scanner;

public class Viaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alumnos;
        double costoAlumno = 0;
        double totalPagar;
        double pagoAlumno;

        System.out.println("Ingrese el numero de alumnos: ");
        alumnos = sc.nextInt();
        
        if(alumnos >= 100){
            costoAlumno = 65;
            totalPagar = alumnos * costoAlumno;
            pagoAlumno = costoAlumno;
        } 
        else if(alumnos >= 50){
            costoAlumno = 70;
            totalPagar = alumnos * costoAlumno;
            pagoAlumno = costoAlumno;
        }
        else if(alumnos >= 30){
            costoAlumno = 95;
            totalPagar = alumnos * costoAlumno;
            pagoAlumno = costoAlumno;
        }
        else{
            totalPagar = 4000;
            pagoAlumno = totalPagar/alumnos;
        }

        System.out.println("Total a pagar a la compañia de buses " + totalPagar + " euros");
        System.out.println("Cada alumno debe pagar: " + pagoAlumno + " euros");

        sc.close();
    }
}
