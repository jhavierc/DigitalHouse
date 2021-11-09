package ccepeda.practica2;

import java.util.Date;

public abstract class Contrato {

    private Date fechaInicio;
    private Date fechaFin;
    private float precioFijo;

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPrecioFijo() {
        return precioFijo;
    }

    public void setPrecioFijo(float precioFijo) {
        this.precioFijo = precioFijo;
    }

    public abstract float calcularCosto();

    @Override
    public String toString() {
        return "Contrato{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precioFijo=" + precioFijo +
                '}';
    }
}
