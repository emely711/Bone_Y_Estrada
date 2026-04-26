abstract class CuentaBancaria {
    private String numeroDeCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroDeCuenta, String titular, double saldo){
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto){
        if (monto>0){
            saldo += monto;
        } else {
            System.out.print(" El monto no es válido");
        }
    }

    public void retiro(double monto){
        if (monto>0 && monto<=saldo){
            saldo -= monto;
        } else {
            System.out.println("\n ** El monto no es válido **");
        }
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public abstract double calcularInteres();

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public abstract void mostrarInformacion();
}