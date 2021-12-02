package ccepeda.c20s;

public class Cargado implements Estado {

    private Carrito carrito;

    public Cargado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        this.carrito.getListaProductos().add(producto);

    }

    @Override
    public void cancelarCarrito() {
        this.carrito.setEstado(new Vacio(this.carrito));
    }

    @Override
    public void volverPuntoAnterior() {
        this.carrito.setEstado(new Vacio(this.carrito));
    }

    @Override
    public void pasarSiguienteEstado() {
        this.carrito.setEstado(new Pagado(this.carrito));
    }

    @Override
    public String toString() {
        return "Cargado";
    }
}
