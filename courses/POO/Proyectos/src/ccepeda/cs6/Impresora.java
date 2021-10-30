package ccepeda.cs6;

import java.util.Date;

public class Impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public boolean tienePPapel() {
        return this.hojasDisponibles > 0;
    }

    public String imprimir(String texto) {
        return texto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "modelo='" + modelo + '\'' +
                ", tipoConexion='" + tipoConexion + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", hojasDisponibles=" + hojasDisponibles +
                '}';
    }
}
