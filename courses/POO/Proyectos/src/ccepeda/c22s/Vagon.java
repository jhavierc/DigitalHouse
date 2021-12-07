package ccepeda.c22s;

import java.util.ArrayList;
import java.util.List;

public class Vagon {

    private List<Figura> listaFiguras;

    public Vagon() {
        this.listaFiguras = new ArrayList<>();
    }

    public void addFigura(Figura figura) {
        this.listaFiguras.add(figura);
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (Figura figura : listaFiguras) {
            total += figura.calcularArea();
        }
        return total;
    }

}
