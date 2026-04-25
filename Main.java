package ec.gob.subsidio.main;

import ec.gob.subsidio.modelo.SoliSubcidio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SoliSubcidio.mostrarReglasSubsidio();

        System.out.print("\nIngrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese la cantidad de vehículos registrados: ");
        int vehiculos = sc.nextInt();

        System.out.print("¿Vive en Ecuador? (si/no): ");
        String respuesta = sc.next().toLowerCase();
        boolean vive = respuesta.equals("si");

        SoliSubcidio s = new SoliSubcidio(nombre, cedula, ingresos, vehiculos, vive);

        System.out.println("\n===== Datos del solicitante =====");
        System.out.println(s);

        s.generarResultado();

        System.out.println("\n===== Cálculo de consumo mensual =====");

        double c1 = s.calcularConsumoMensual();
        double c2 = s.calcularConsumoMensual(80);

        System.out.println("Consumo mensual estimado (sin km extra): " + c1 + " galones");
        System.out.println("Consumo con kilómetros extra (80 km adicionales): " + c2 + " galones");

        sc.close();
    }
}