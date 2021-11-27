package ccepeda.c18s;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Reserva> listaReservas;
    private List<String> listaEstaciones;

    public Empresa() {
        this.listaReservas = new ArrayList<>();
        this.listaEstaciones = new ArrayList<>();
    }

    public void addReserva(Reserva reserva) {
        this.listaReservas.add(reserva);
    }

    public void addEstacion(String estacion) {
        this.listaEstaciones.add(estacion);
    }

    public double recaudacionTotal() {
        double total = 0;
        for (Reserva reserva : listaReservas) {
            total += reserva.getPrecio();
        }
        return total;
    }

    public int cantVecesRecorrida(String estacion) throws ClienteException {
        int cont = 0;
        for (Reserva reserva : listaReservas) {
            if (reserva.getEstacionOrigen().equals(estacion)) {
                cont++;
            }
        }
        if (cont == 0) {
            throw new ClienteException("Error: Ningun usuario paso por la estacion " + estacion);
        }
        return cont;
    }

}
