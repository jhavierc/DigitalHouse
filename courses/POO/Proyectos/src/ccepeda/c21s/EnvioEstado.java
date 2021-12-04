package ccepeda.c21s;

public class EnvioEstado extends Estado {

    public EnvioEstado(Reparacion reparacion) {
        super(reparacion);
    }

    @Override
    public void valorPresupuesto(Double valor) throws ClienteException {
        throw new ClienteException("Accion no valida");
    }

    @Override
    public void sumaRepuesto(Double valor) throws ClienteException {
        throw new ClienteException("Accion no valida");
    }

    @Override
    public void cambiarDireccion(String direccion) {
        this.reparacion.setDireccion(direccion);
    }

    @Override
    public void cambiarSiguientePaso() {
        this.reparacion.setEstado(EstadoFactory.getInstance().crearEstado("finalizado", this.reparacion));
        System.out.println(this.reparacion.toString("finalizado"));
    }
}
