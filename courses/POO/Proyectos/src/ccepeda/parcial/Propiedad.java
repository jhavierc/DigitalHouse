package ccepeda.parcial;

public class Propiedad {

    private Propietario propietario;
    private double precio;
    private String direccion;
    private boolean hipotecada;

    public Propiedad(Propietario propietario, double precio, String direccion, boolean hipotecada) {
        this.propietario = propietario;
        this.precio = precio;
        this.direccion = direccion;
        this.hipotecada = hipotecada;
    }

    public boolean sePuedeVender(){
        return hipotecada;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "propietario=" + propietario +
                ", precio=" + precio +
                ", direccion='" + direccion + '\'' +
                ", hipotecada=" + hipotecada +
                '}';
    }
}
