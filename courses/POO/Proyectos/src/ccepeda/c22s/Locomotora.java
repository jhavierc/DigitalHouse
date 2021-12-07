package ccepeda.c22s;

import java.util.List;

public class Tren {

    private List<Figura> listaFiguras;

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
