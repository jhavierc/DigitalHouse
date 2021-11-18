package ccepeda.c14s;

public class Barco {

    private double precioBase;
    private double valorAdicional;
    private int anio;
    private int logitud;
    private Capitan capitan;


    public Barco(double precioBase, double valorAdiciona, int anio, int logitud, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdiciona;
        this.anio = anio;
        this.logitud = logitud;
        this.capitan = capitan;
    }

    public double calcularMonto() {
        if (this.anio > 2020) {
            return this.precioBase + this.valorAdicional;
        } else {
            return this.precioBase;
        }
    }

    @Override
    public String toString() {
        return "Barco{" +
                "precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anio=" + anio +
                ", logitud=" + logitud +
                ", capitan=" + capitan +
                '}';
    }
}
