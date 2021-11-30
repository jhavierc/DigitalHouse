package ccepeda.c19s;

public class FabricaProducto {

    private static FabricaProducto fabricaProducto;

    private FabricaProducto() {
    }

    public static FabricaProducto obtenerInstancia() {
        if (fabricaProducto == null)
            fabricaProducto = new FabricaProducto();
        return fabricaProducto;
    }

    public Producto crearProducto(String tipo) {
        Producto producto = null;
        switch (tipo) {
            case "CAJA10X10":
                producto = new Caja();
                break;
            case "PELOTAFULTBOL":
                producto = new Pelota(11);
                break;
            case "PELOTATENIS":
                producto = new Pelota(0.32);
                break;
        }
        return producto;
    }
}
