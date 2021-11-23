package ccepeda.parcial;

public class SistemaZamora {

    public static void main(String[] args) {

        System.out.println("Parcial: Carlos Javier Cepeda");

        Propietario propietario = new Propietario("Carlos", "cepeda", "1234");
        Propietario propietario2 = new Propietario("Matth", "cepeda", "3456");

        Propiedad casa1 = new Casa(propietario, 23444, "Calle 1 #1-1", false, 3, 100);
        Propiedad casa2 = new Casa(propietario, 55444, "Calle 2 #10-132", true, 5, 250);

        Propiedad campo = new Campos(propietario2, 234555, "Finca 21", true, true, 2000);

        System.out.println("\n\n=== Informacion propiedad 1===");
        System.out.println(casa1);
        System.out.println("La Casa1 se puede vender ? " + (casa1.sePuedeVender() ? "SI" : "NO"));
        System.out.println("La Casa2 se puede vender ? " + (casa2.sePuedeVender() ? "SI" : "NO"));
        int resultado = ((Casa) casa1).compareTo((Casa) casa2);
        if (resultado == 0) {
            System.out.println("Las dos casas son iguales, tienen el mismo numero de ambientes");
        } else if (resultado > 0) {
            System.out.println("La casa1 es mayor que la casa 2 porque tiene mas ambientes");
        } else {
            System.out.println("La casa2 es mayor que la primera porque tiene mas ambientes");
        }

        System.out.println("\n\n=== Informacion propiedad 2===");
        System.out.println(campo.toString());
        System.out.println("El Campo1 se puede vender ? " + (campo.sePuedeVender() ? "SI" : "NO"));
        System.out.println("El Campo1 es apto para cultivo ? " + (((Campos) campo).aptoParaCultivo() ? "SI" : "NO"));


    }
}
