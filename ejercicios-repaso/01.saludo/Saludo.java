import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuál es tu nombre?");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre + "!");

        sc.close();
    }
}
