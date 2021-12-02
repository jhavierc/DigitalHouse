package ccepeda.c20s;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private Estado estado;

    public Carrito() {
        this.listaProductos = new ArrayList<>();
    }

    private List<Producto> listaProductos;

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
