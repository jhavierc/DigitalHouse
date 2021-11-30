package ccepeda.c19s;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> listaProductos;

    public Almacen() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(String tipo) {
        this.listaProductos.add(FabricaProducto.obtenerInstancia().crearProducto(tipo));
    }

    public void agregarCaja(int altura, int ancho) {
        Caja caja = (Caja) FabricaProducto.obtenerInstancia().crearProducto("CAJA10X10");
        caja.setAltura(altura);
        caja.setAncho(ancho);
        this.listaProductos.add(caja);
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double calcularEspacioNecesario() {
        double totalEspacio = 0;
        for (Producto producto : listaProductos) {
            totalEspacio += producto.calcularEspacio();
        }
        return totalEspacio;
    }
}
