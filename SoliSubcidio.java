package ec.gob.subsidio.modelo;

public class SoliSubcidio {

    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SoliSubcidio(String nombreCompleto, String cedula, double ingresosMensuales,
                        int cantidadVehiculos, boolean viveEnEcuador) {

        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Ingreso inválido (mínimo 470)");
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Cantidad inválida");
        }
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    public boolean subsidioAprobado() {
        return ingresosMensuales <= 1200 &&
                cantidadVehiculos <= 1 &&
                viveEnEcuador;
    }

    public void generarResultado() {
        System.out.println("\n===== Resultado de la evaluación =====");

        if (subsidioAprobado()) {
            System.out.println("Subsidio aprobado: Cumple con todos los requisitos establecidos por el Gobierno del Ecuador.");
        } else {
            System.out.println("Subsidio rechazado:");

            if (ingresosMensuales > 1200) {
                System.out.println("- Supera el límite de ingresos.");
            }
            if (cantidadVehiculos > 1) {
                System.out.println("- Tiene más de un vehículo.");
            }
            if (!viveEnEcuador) {
                System.out.println("- No reside en Ecuador.");
            }
        }
    }
    public static void mostrarReglasSubsidio() {
        System.out.println("===== Reglas para obtener el subsidio =====");
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2. No poseer más de un vehículo registrado.");
        System.out.println("3. Tener residencia en Ecuador.");
        System.out.println("===========================================");
    }
    public double calcularConsumoMensual() {
        double km = 1000;
        return km / 40;
    }

    public double calcularConsumoMensual(double kmExtra) {
        double km = 1000 + kmExtra;
        return km / 40;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nIngresos mensuales: $" + ingresosMensuales +
                "\nCantidad de vehículos: " + cantidadVehiculos +
                "\nVive en Ecuador: " + (viveEnEcuador ? "Sí" : "No");
    }
}