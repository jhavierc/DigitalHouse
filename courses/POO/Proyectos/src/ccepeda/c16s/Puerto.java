package ccepeda.c16s;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private List<Contenedor> listaContendores;

    public Puerto() {
        this.listaContendores = new ArrayList<>();
    }

    public void listarContenedores(){
        this.listaContendores.sort(null);
        for (Contenedor contenedor : listaContendores) {
            System.out.println(contenedor);
        }
    }

    public void ingresarContenedor(Contenedor contenedor){
        this.listaContendores.add(contenedor);
    }

    public int cantidadContenedoresPeligrosos(){
        int contador=0;
        for (Contenedor contenedor : listaContendores) {
            if(contenedor.isPeligroso()){
                contador++;
            }
        }
        return contador;
    }


}
