import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero: ");
        int num1 = sc.nextInt();

        if((num1 % 2) == 0)
            System.out.println("El numero es par");
        else{
            System.out.println("El numero es impar");
        }


        sc.close();
    }
}
