public class CuentaInversion extends CuentaBancaria{

    public CuentaInversion(String numeroDeCuenta, String titular, double saldo){
        super(numeroDeCuenta, titular, saldo);
    }

    @Override
    public double calcularInteres(){
        if(getSaldo()<1000){
            return (getSaldo()*0.04)/12;
        } else if (getSaldo()>=1000 && getSaldo()<5000) {
            return (getSaldo()*0.05)/12;
        } else {
            return (getSaldo()*0.06)/12;
        }
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("\n ----------------------------------------");
        System.out.println(" CUENTA DE INVERSION ");
        System.out.println(" Titular: " + getTitular());
        System.out.println(" Saldo Actual: " + getSaldo());
        System.out.println(" Interés mensual: " + calcularInteres());
        System.out.println(" ----------------------------------------");
    }
}
