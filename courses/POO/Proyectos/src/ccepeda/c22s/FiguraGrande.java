package ccepeda.c22s;

import java.util.ArrayList;
import java.util.List;

public class FiguraGrande {

    private Locomotora locomotora;
    private List<Vagon> listaVagones;

    public FiguraGrande() {
        this.locomotora = new Locomotora();
        this.listaVagones = new ArrayList<>();
    }

    public void addVagon(Vagon vagon){
        this.listaVagones.add(vagon);
    }

    public double calcularArea(){
        double total =0;
        for (Vagon vagon : listaVagones) {
            total+= vagon.calcularAreaTotal();
        }
        total += this.locomotora.calcularAreaTotal();
        return total;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }
}
