public class CuentaCorriente extends CuentaBancaria{

    public CuentaCorriente(String numeroDeCuenta, String titular, double saldo){
        super(numeroDeCuenta, titular, saldo);
    }

    @Override
    public void retiro(double monto){
        if(monto>0 && getSaldo()-monto>=-500){
            setSaldo(getSaldo()-monto);
        } else {
            System.out.println(" ** Monto NO valido o excede el sobregiro permitido ** ");
        }
    }

    @Override
    public double calcularInteres(){
        return 0;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("\n ----------------------------------------");
        System.out.println(" CUENTA CORRIENTE ");
        System.out.println(" Titular: " + getTitular());
        System.out.println(" Saldo Actual: " + getSaldo());
        System.out.println(" ----------------------------------------");
    }

}
