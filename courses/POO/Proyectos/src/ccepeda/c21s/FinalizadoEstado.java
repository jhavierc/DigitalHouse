package ccepeda.c21s;

public class FinalizadoEstado extends Estado {

    public FinalizadoEstado(Reparacion reparacion) {
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
    public void cambiarDireccion(String direccion) throws ClienteException {
        throw new ClienteException("Accion no valida");
    }

    @Override
    public void cambiarSiguientePaso() throws ClienteException {
        System.out.println(this.reparacion.toString("Finalizado"));
        throw new ClienteException("Accion no valida");
    }

}
