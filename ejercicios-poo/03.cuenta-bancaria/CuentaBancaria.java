public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void consignarDinero(double dinero){
        this.saldo = this.saldo + dinero;
        
        System.out.println("Dinero consignado exitosamente.");
    }

    public void retirarDinero(double dinero){
        if (dinero > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }

        this.saldo = this.saldo - dinero;
        
        System.out.println("Dinero consignado exitosamente.");
    }

    public void consultarSaldo(){
        System.out.println("El saldo de la cuenta es de: " + this.saldo + "$");
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(234323132, "Anderson", 120000);

        cuenta.consultarSaldo();
        cuenta.consignarDinero(40000);
        cuenta.retirarDinero(500000000);
        cuenta.retirarDinero(70000);
        cuenta.consultarSaldo();
    }

    
}
