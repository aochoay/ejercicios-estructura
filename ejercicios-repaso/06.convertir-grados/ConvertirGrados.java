import java.util.Scanner;

public class ConvertirGrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los grados Fahrenheit a convertir: ");
        double gradosFahrenheit = sc.nextDouble();

        double gradosCelsius = (gradosFahrenheit - 32)/1.8;

        System.out.println("Son " + gradosCelsius + " grados Celsius.");

        sc.close();
    }
}
