package ccepeda.c20s;

public interface Estado {

    public void agregarProducto(Producto producto);

    public void cancelarCarrito();

    public void volverPuntoAnterior();

    public void pasarSiguienteEstado();


}
