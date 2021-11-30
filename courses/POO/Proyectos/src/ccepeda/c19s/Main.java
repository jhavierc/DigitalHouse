package ccepeda.c19s;

public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        almacen.agregarProducto("PELOTAFULTBOL");
        almacen.agregarProducto("PELOTATENIS");
        almacen.agregarCaja(20,20);

        System.out.println(almacen.getListaProductos());
        System.out.println("Total espacio : "+ almacen.calcularEspacioNecesario());

    }
}
