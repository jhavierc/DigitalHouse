package ccepeda.c18s;

public class Reserva {
    private String codigo;
    private int cantidadViajeros;
    private String estacionOrigen;
    private String estacionDestino;
    private static final double PRECIO_BOLETO = 50;

    public Reserva(String codigo, int cantidadViajeros, String estacionOrigen, String estacionDestino) {
        this.codigo = codigo;
        this.cantidadViajeros = cantidadViajeros;
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
    }

    public double getPrecio() {
        double total = cantidadViajeros * PRECIO_BOLETO;
        if ((estacionOrigen.equals("Buenos Aires") || estacionOrigen.equals("Bragado "))
                || (estacionDestino.equals("Buenos Aires") || estacionDestino.equals("Bragado "))) {
            return total - (0.2 * total);
        }
        return total;
    }

    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
}
