package ccepeda.c21s;

public class PresupuestoEstado extends Estado {

    public PresupuestoEstado(Reparacion reparacion) {
        super(reparacion);
    }

    @Override
    public void valorPresupuesto(Double valor) {
        this.reparacion.setPresupuesto(valor);
    }

    @Override
    public void sumaRepuesto(Double valor) throws ClienteException {
        throw new ClienteException("Accion no valida");
    }

    @Override
    public void cambiarDireccion(String direccion) throws ClienteException {
        throw new ClienteException("Accion no valida");
    }

    @Override
    public void cambiarSiguientePaso() {
        this.reparacion.setEstado(EstadoFactory.getInstance().crearEstado("reparacion", this.reparacion));
        System.out.println(this.reparacion.toString("reparacion"));
    }
}
