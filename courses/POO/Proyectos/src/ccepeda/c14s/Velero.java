package ccepeda.c14s;

public class Velero extends Barco implements Comparable {

    private int cantidadMastiles;

    public Velero(double precioBase, double valorAdiciona, int anio, int logitud, Capitan capitan) {
        super(precioBase, valorAdiciona, anio, logitud, capitan);
    }

    public Velero(double precioBase, double valorAdiciona, int anio, int logitud, Capitan capitan, int cantidadMastiles) {
        super(precioBase, valorAdiciona, anio, logitud, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean validarSiEsGrande(){
        return this.cantidadMastiles>4;
    }


    @Override
    public int compareTo(Object o) {
        Velero velero = (Velero) o;
        if (this.cantidadMastiles > velero.cantidadMastiles) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "cantidadMastiles=" + cantidadMastiles +
                ", barco=" + super.toString() +
                '}';
    }
}
