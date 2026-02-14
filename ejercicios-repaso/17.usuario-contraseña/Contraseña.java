import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "Juan123";
        String contraseña = "123321";

        System.out.println("===== Iniciar sesión =====");

        System.out.println("Ingrese su usuario: ");
        String usuarioIntento = sc.nextLine();

        System.out.println("Ingrese su contraseña: ");
        String contraseñaIntento = sc.nextLine();

        if((usuarioIntento.equals(usuario)) && (contraseñaIntento.equals(contraseña)))
            System.out.println("Has ingresado al sistema.");
        else
            System.out.println("Credenciales erróneas. Verifique su información");

        sc.close();
    }
}
