package ccepeda.c21s;

public abstract class Estado {

    Reparacion reparacion;

    public Estado(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    public abstract void valorPresupuesto(Double valor) throws ClienteException;

    public abstract void sumaRepuesto(Double valor) throws ClienteException;

    public abstract void cambiarDireccion(String direccion) throws ClienteException;

    public abstract void cambiarSiguientePaso() throws ClienteException;

}
