package ccepeda.practica4;

public class Programa {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Andres", 22, 12345);
        Cliente cliente2 = new Cliente("Paco", 33);

        Empleado empleado1 = new Empleado("Oscr¿ar",19,2000);
        Empleado empleado2 = new Empleado("Matth",23,777);
        Empleado empleado3 = new Empleado("Pachito",44,4555);
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        Directivo gerente = new Directivo("Eaaa", 56, 7000, "Gerente");
        gerente.getLista()[0]= empleado1;
        gerente.getLista()[1]= empleado2;
        gerente.getLista()[2]= empleado3;
        System.out.println(gerente.toString());


        Directivo operarario = new Directivo("AAAA", 44, 5555, "Operario");
        System.out.println(operarario.toString());

        int resultadoComparacion =gerente.compareTo(operarario);
        if(resultadoComparacion>0){
            System.out.println("EL gerente es mayor que el operario");
        } else {
            System.out.println("El operario es mayor que el gerente");
        }





    }
}
