package ccepeda.factory;

public class EmpleadoRelacionDependencia extends Empleado{


    private double sueldoMensual;


    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return dias * sueldoMensual / 30;
    }
}
