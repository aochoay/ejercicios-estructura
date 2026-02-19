public class Persona {
    private String nombre;
    private String apellido;
    private String documento;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, String apellido, String documento, int anioNacimiento, String paisNacimiento,
            char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public void imprimirInfo(){
        System.out.println("\nEl nombre de la persona es: " + this.nombre);
        System.out.println("El apellido de la persona es: " + this.apellido);
        System.out.println("El documento de la persona es: " + this.documento);
        System.out.println("El año de nacimiento de la persona es: " + this.anioNacimiento);
        System.out.println("El pais de nacimiento de la persona es: " + this.paisNacimiento);
        System.out.println("El genero de la persona es: " + this.genero);
    }



    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez", "102010", 2000, "Colombia", 'H');
        Persona persona2 = new Persona("Pedro", "Sanchez", "322078", 1995, "Venezuela", 'H');

        persona.imprimirInfo();
        persona2.imprimirInfo();

    }
        
}
