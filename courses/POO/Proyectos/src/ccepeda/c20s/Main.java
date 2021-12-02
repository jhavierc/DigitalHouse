package ccepeda.c20s;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();
        carrito.setEstado(new Vacio(carrito));
        System.out.println(carrito.getEstado());
        carrito.getEstado().pasarSiguienteEstado();
        System.out.println(carrito.getEstado());
        carrito.getEstado().agregarProducto(new Producto("reloj", 333));
        carrito.getEstado().agregarProducto(new Producto("balon", 555));
        System.out.println(carrito.getListaProductos());
        carrito.getEstado().pasarSiguienteEstado();
        System.out.println(carrito.getEstado());
        carrito.getEstado().agregarProducto(new Producto("reloj", 333));
        carrito.getEstado().pasarSiguienteEstado();
        System.out.println(carrito.getEstado());
        carrito.getEstado().agregarProducto(new Producto("reloj", 333));
        carrito.getEstado().volverPuntoAnterior();
    }
}
