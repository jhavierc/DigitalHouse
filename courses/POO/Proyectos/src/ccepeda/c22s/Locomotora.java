package ccepeda.c22s;

import java.util.ArrayList;
import java.util.List;

public class Locomotora {

    private List<Figura> listaFiguras;

    public Locomotora() {
        this.listaFiguras = new ArrayList<>();
    }

    public void addFigura(Figura figura){
        this.listaFiguras.add(figura);
    }

    public double calcularAreaTotal(){
        double total=0;
        for (Figura figura : listaFiguras) {
            total+=figura.calcularArea();
        }
        return  total;
    }

}
