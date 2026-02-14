import java.util.Scanner;

public class Velocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia entre los vehiculos");
        double distancia = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehiculo que va adelante");
        double velocAdelante = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehiculo que va atras");
        double velocAtras = sc.nextDouble();

        double tiempoHoras = distancia/(velocAtras - velocAdelante);
        double tiempoMinutos = tiempoHoras * 60;

        System.out.println("El vehiculo más rapido alcanzará al otro  en: " + tiempoMinutos + " minutos");

        sc.close();
    }
}
