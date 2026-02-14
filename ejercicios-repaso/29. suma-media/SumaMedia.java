import java.util.Scanner;

public class SumaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero = 0;
        double suma = 0;
        double contador = -1;
        double promedio;


        do {
            suma += numero;
            contador += 1;

            System.out.println("Ingrese un numero: (Ingrese 0 para finalizar el programa)");
            numero = sc.nextDouble();

        } while (numero != 0);

        promedio = suma/(contador);
        
        System.out.println("La suma total es " + suma);
        System.out.println("El promedio de todos los numeros ingresados es: " + promedio);

        sc.close();
    }
}
