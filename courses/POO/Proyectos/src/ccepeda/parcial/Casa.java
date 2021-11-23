package ccepeda.parcial;

public class Casa extends Propiedad implements Comparable {

    private int cantidadAmbientes;
    private float metrosCuadrados;

    public Casa(Propietario propietario, double precio, String direccion, boolean hipotecada, int cantidadAmbientes, float metrosCuadrados) {
        super(propietario, precio, direccion, hipotecada);
        this.cantidadAmbientes = cantidadAmbientes;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int compareTo(Object o) {
        Casa casa = (Casa) o;
        return this.cantidadAmbientes - casa.cantidadAmbientes;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "cantidadAmbientes=" + cantidadAmbientes +
                ", metrosCuadrados=" + metrosCuadrados + "}, "+ super.toString();
    }
}
