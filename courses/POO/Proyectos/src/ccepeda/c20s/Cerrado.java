package ccepeda.c20s;

public class Cerrado implements Estado {

    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No puede agregar mas productos en este estado");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No puede Cancelar porque ya se hizo el pago");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No puede volver al estado de Pagar");
    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Ha finalizado la compra!!!, no se puede regresar");

    }

    @Override
    public String toString() {
        return "Cerrado";
    }
}
