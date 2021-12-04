package ccepeda.c21s;

public class ReparacionEstado extends Estado {

    public ReparacionEstado(Reparacion reparacion) {
        super(reparacion);
    }

    @Override
    public void valorPresupuesto(Double valor) throws ClienteException {
        throw new ClienteException("Accion no valida");
    }

    @Override
    public void sumaRepuesto(Double valor) {
        this.reparacion.setPresupuesto(this.reparacion.getPresupuesto() + valor);
    }

    @Override
    public void cambiarDireccion(String direccion) throws ClienteException {
        throw new ClienteException("Accion no valida");
    }

    @Override
    public void cambiarSiguientePaso() {
        this.reparacion.setEstado(EstadoFactory.getInstance().crearEstado("envio", this.reparacion));
        System.out.println(this.reparacion.toString("envio"));
    }
}
