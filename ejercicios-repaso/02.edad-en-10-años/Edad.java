import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuál es tu edad?");
        int edad = sc.nextInt();
        edad = edad + 10;

        System.out.println("Tu edad en 10 años será: " + edad);

        sc.close();
    }
}
