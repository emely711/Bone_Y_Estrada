public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numeroDeCuenta, String titular, double saldo) {
        super(numeroDeCuenta, titular, saldo);
    }

    @Override
    public double calcularInteres(){
        return (getSaldo()*0.03)/12;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("\n ----------------------------------------");
        System.out.println(" CUENTA DE AHORROS ");
        System.out.println(" Titular: " + getTitular());
        System.out.println(" Saldo Actual: " + getSaldo());
        System.out.println(" Interes mensual: " + calcularInteres());
        System.out.println(" ----------------------------------------");
    }

}
