import java.util.Scanner;

public class Numeros {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double mayor, medio, menor, aux;

        System.out.println("Ingrese el primer numero: ");
        mayor = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        medio = sc.nextDouble();

        System.out.println("Ingrese el tercer numero: ");
        menor = sc.nextDouble();

        if(mayor < medio){
            aux = mayor;
            mayor = medio;
            medio = aux;
        }

        if(mayor < menor){
            aux = mayor;
            mayor = menor;
            menor = aux;
        }

        if(medio < menor){
            aux = medio;
            medio = menor;
            menor = aux;
        }

        System.out.println("Numeros ordenados de mayor a menor " + mayor + " " + medio + " " + menor);
        sc.close();
    }
}
