public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void calcularArea(){
        double area = this.ancho * this.alto;

        System.out.println("El area del rectangulo es " + area);
    }

    public void calcularPerimetro(){
        double perimetro = 2*alto + 2*ancho;

        System.out.println("El perimetro del rectangulo es " + perimetro);
    }

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(2, 4);
        Rectangulo rec2 = new Rectangulo(8, 5);

        rec1.calcularArea();
        rec1.calcularPerimetro();
        System.out.println();
        rec2.calcularArea();
        rec2.calcularPerimetro();
    }
    
}
