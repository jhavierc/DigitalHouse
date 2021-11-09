package ccepeda.practica2;

public class ContratoHoras extends Contrato {

    private int hora;
    private float precio;

    public ContratoHoras(int hora, float precio) {
        this.hora = hora;
        this.precio = precio;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public float calcularCosto() {
        float calculo = this.precio * this.hora;
        float total = getPrecioFijo() + calculo;
        return total;
    }

    @Override
    public String toString() {
        return "ContratoHoras{" +
                "precioFijo=" + this.getPrecioFijo() +
                ", hora=" + hora +
                ", precio=" + precio +
                '}';
    }
}
