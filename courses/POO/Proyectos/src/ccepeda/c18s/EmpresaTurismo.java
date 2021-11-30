package ccepeda.c18s;

public class EmpresaTurismo {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        System.out.println("Total recuadado : " + empresa.recaudacionTotal());
        try {
            System.out.println("Cantidad usuarios que pasaron por la estacion de Buenos Aires :"
                    + empresa.cantVecesRecorrida("Buenos Aires"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------");
        Reserva reserva1 = new Reserva("AKDS", 2, "Buenos Aires", "Bragado");
        Reserva reserva2 = new Reserva("AKKSK", 2, "Buenos Aires", "Chivilcoy");
        Reserva reserva3 = new Reserva("IIEKKK", 2, "Mercedes", "Chivilcoy");
        empresa.addReserva(reserva1);
        empresa.addReserva(reserva2);
        empresa.addReserva(reserva3);


        System.out.println("Total recuadado : " + empresa.recaudacionTotal());
        try {
            System.out.println("Cantidad usuarios que pasaron por la estacion de Buenos Aires :"
                    + empresa.cantVecesRecorrida("Buenos Aires"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
