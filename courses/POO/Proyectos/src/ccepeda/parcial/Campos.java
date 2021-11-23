package ccepeda.parcial;

public class Campos extends Propiedad{

    private boolean tieneCasco;
    private int numeroHectareas;

    public Campos(Propietario propietario, double precio, String direccion, boolean hipotecada, boolean tieneCasco, int numeroHectareas) {
        super(propietario, precio, direccion, hipotecada);
        this.tieneCasco = tieneCasco;
        this.numeroHectareas = numeroHectareas;
    }

    @Override
    public String toString() {
        return "Campos{" +
                "tieneCasco=" + tieneCasco +
                ", numeroHectareas=" + numeroHectareas + "},"+super.toString();
    }

    public boolean aptoParaCultivo(){
        return this.numeroHectareas>10;
    }
}
