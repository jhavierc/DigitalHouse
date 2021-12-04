package ccepeda.c21s;

public class Reparacion {

    private Estado estado;
    private Articulo articulo;
    private double presupuesto;
    private String direccion;

    public Reparacion(Articulo articulo) {
        this.estado = new PresupuestoEstado(this);
        this.articulo = articulo;
        System.out.println(this.toString("presupuesto"));
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString(String estado) {
        return "Reparacion{" +
                "estado=" + estado +
                ", articulo=" + articulo.toString() +
                ", presupuesto=" + presupuesto +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
