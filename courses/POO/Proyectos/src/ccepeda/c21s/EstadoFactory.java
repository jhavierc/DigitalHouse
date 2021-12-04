package ccepeda.c21s;

import ccepeda.factory.EmpleadoFactory;

public final class EstadoFactory {

    private static EstadoFactory estadoFactory;

    private EstadoFactory() {
    }

    public static EstadoFactory getInstance() {
        if (estadoFactory == null)
            estadoFactory = new EstadoFactory();
        return estadoFactory;
    }

    public Estado crearEstado(String codigo, Reparacion reparacion) {
        Estado estado = null;
        switch (codigo) {
            case "presupuesto":
                estado = new PresupuestoEstado(reparacion);
                break;
            case "reparacion":
                estado = new ReparacionEstado(reparacion);
                break;
            case "envio":
                estado = new EnvioEstado(reparacion);
                break;
            case "finalizado":
                estado = new FinalizadoEstado(reparacion);
                break;
        }
        return estado;
    }
}
