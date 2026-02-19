public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo(){
        System.out.println("\nTitulo del libro: " + this.titulo);
        System.out.println("Autor del libro: " + this.autor);
        System.out.println("Año de publicación del libro: " + this.anioPublicacion);
    }

    public void cambiarAnioPublicacion(int anio){
        this.anioPublicacion = anio;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "J.K Rowling", 1990);

        libro1.mostrarInfo();
        libro1.cambiarAnioPublicacion(1991);
        libro1.mostrarInfo();
    }

    
}
