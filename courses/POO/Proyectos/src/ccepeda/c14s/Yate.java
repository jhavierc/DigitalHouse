package ccepeda.c14s;

public class Yate extends Barco implements Comparable{

    private int cantidadCamarotes;

    public Yate(double precioBase, double valorAdiciona, int anio, int logitud, Capitan capitan) {
        super(precioBase, valorAdiciona, anio, logitud, capitan);
    }

    public Yate(double precioBase, double valorAdiciona, int anio, int logitud, Capitan capitan, int cantidadCamarotes) {
        super(precioBase, valorAdiciona, anio, logitud, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }



    /**
     * Validar si es mas lujoso
     *  // A >B >>1
     *     // B<A O A==B >>>>0
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Yate yate = (Yate)o;
        if(this.cantidadCamarotes> yate.cantidadCamarotes){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "cantidadCamarotes=" + cantidadCamarotes +
                ", barco=" + super.toString() +
                '}';
    }
}
