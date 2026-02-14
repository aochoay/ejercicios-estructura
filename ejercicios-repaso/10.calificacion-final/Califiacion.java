import java.util.Scanner;

public class Califiacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificación de la primera nota parcial:");
        double notaParcial1 = sc.nextDouble();

        System.out.println("Ingrese la calificación de la segunda nota parcial:");
        double notaParcial2 = sc.nextDouble();

        System.out.println("Ingrese la calificación de la tercera nota parcial:");
        double notaParcial3 = sc.nextDouble();

        double promedioParciales = (notaParcial1+notaParcial2+notaParcial3)/3;

        System.out.println("Ingrese la calificación del examen final: ");
        double notaExamen = sc.nextDouble();

        System.out.println("Ingrese la calificación del trabajo final: ");
        double notaTrabajo = sc.nextDouble();

        double notaFinal = (promedioParciales * 0.55) + (notaExamen * 0.30) + (notaTrabajo * 0.15);

        System.out.println("La nota final del curso de Estructura de Datos es: " + notaFinal);

        sc.close();

    }
}
