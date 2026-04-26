//PARA USAR LAS LISTAS DEBO IMPORTAR
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    List<CuentaBancaria> cuentas = new ArrayList<>();

    cuentas.add(new CuentaAhorros("001", "Ana Perez", 1200));
    cuentas.add(new CuentaCorriente("002", "Luis Gómez", 800));
    cuentas.add(new CuentaInversion("003", "María López", 5000));

    double totalIntereses = 0;


    for (int i = 0; i < cuentas.size(); i++){
      CuentaBancaria c = cuentas.get(i);
      c.mostrarInformacion();
      totalIntereses += c.calcularInteres();

    }

    System.out.println("\nTOTAL INTERESES DEL BANCO: " + totalIntereses);

    /*
    CuentaAhorros ahorros1 = new CuentaAhorros("001", "Ana Perez", 1200);
    ahorros1.depositar(10);
    ahorros1.mostrarInformacion();
    ahorros1.retiro(4000);

    CuentaCorriente corriente1 = new CuentaCorriente("002", "Luis Gómez", 800);
    corriente1.mostrarInformacion();
    corriente1.retiro(950);
    corriente1.mostrarInformacion();

    CuentaInversion inversion1 = new CuentaInversion("003", "María López", 5000);
    inversion1.setSaldo(10000);
    inversion1.retiro(100000);
    inversion1.mostrarInformacion();

  */


  }
}