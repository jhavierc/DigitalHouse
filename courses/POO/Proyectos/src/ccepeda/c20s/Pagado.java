package ccepeda.c20s;

public class Pagado implements Estado {

    private Carrito carrito;

    public Pagado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No puede agregar más productos!!!");
    }

    @Override
    public void cancelarCarrito() {
        this.carrito.setEstado(new Vacio(this.carrito));
    }

    @Override
    public void volverPuntoAnterior() {
        this.carrito.setEstado(new Cargado(this.carrito));
    }

    @Override
    public void pasarSiguienteEstado() {
        this.carrito.setEstado(new Cerrado(this.carrito));
    }

    @Override
    public String toString() {
        return "Pagado";
    }
}
