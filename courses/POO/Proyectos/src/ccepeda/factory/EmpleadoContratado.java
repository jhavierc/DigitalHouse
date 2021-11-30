package ccepeda.factory;

public class EmpleadoContratado extends Empleado{

    private double importePorHora;

    public double getImportePorHora() {
        return importePorHora;
    }

    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    @Override
    public double calcularSueldo(int dias) {
        return importePorHora * 8 * dias;
    }
}
