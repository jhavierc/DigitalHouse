package ccepeda.c21s;

public class Main {

    public static void main(String[] args) {

        try {
            Articulo articulo = new Articulo("Batidora");
            Reparacion reparacion = new Reparacion(articulo);
            reparacion.getEstado().valorPresupuesto(5000.0);
            reparacion.getEstado().cambiarSiguientePaso();
            reparacion.getEstado().sumaRepuesto(1000D);
            reparacion.getEstado().sumaRepuesto(2000D);
            reparacion.getEstado().sumaRepuesto(3000D);
            reparacion.getEstado().cambiarSiguientePaso();
            reparacion.getEstado().cambiarDireccion("Buenos aires Arg");
            reparacion.getEstado().cambiarSiguientePaso();


        } catch (ClienteException e) {
            System.out.println(e.getCause());
        }


    }
}
