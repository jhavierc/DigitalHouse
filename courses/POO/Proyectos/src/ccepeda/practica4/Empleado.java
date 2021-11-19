package ccepeda.practica4;

public class Empleado extends Persona {
    private int sueldoBruto;

    public Empleado(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                ", persona=" + super.toString() +", "+ super.toString()+
                '}';
    }
}
