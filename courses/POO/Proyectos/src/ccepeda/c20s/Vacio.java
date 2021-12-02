package ccepeda.c20s;

public class Vacio implements Estado {
    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {

    }

    @Override
    public void cancelarCarrito() {

    }

    @Override
    public void volverPuntoAnterior() {

    }

    @Override
    public void pasarSiguienteEstado() {
        this.carrito.setEstado(new Cargado(this.carrito));
    }

    @Override
    public String toString() {
        return "Vacio";
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
