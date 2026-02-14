import java.util.Scanner;

public class MayoresMenores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int mayores = 0; 
        int menores = 0; 
        int iguales = 0;
        double numero;

        System.out.println("Ingrese la cantidad de numeros a introducir: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Ingrese un numero: ");
            numero = sc.nextDouble();

            if(numero == 0){
                iguales += 1;
            } else if(numero < 0){
                menores += 1;
            } else{
                mayores += 1;
            }
        }

        System.out.println("Cantidad de numeros mayores a cero: " + mayores);
        System.out.println("Cantidad de numeros iguales a cero: " + iguales);
        System.out.println("Cantidad de numeros menores a cero: " + menores);

        sc.close();
    }
}
