package ccepeda.c16s;

public class Main {

    public static void main(String[] args) {

        Puerto puerto = new Puerto();

        Contenedor contenedor1 = new Contenedor(123, "China", false);
        Contenedor contenedor2 = new Contenedor(333, "Japon", false);
        Contenedor contenedor3 = new Contenedor(555, "EEUU", true);
        Contenedor contenedor4 = new Contenedor(444, "Desconocida", true);
        Contenedor contenedor5 = new Contenedor(777, "España", false);

        System.out.println("=== Lista de contenendores del puerto ===");
        puerto.ingresarContenedor(contenedor1);
        puerto.ingresarContenedor(contenedor2);
        puerto.ingresarContenedor(contenedor3);
        puerto.ingresarContenedor(contenedor4);
        puerto.ingresarContenedor(contenedor5);

        puerto.listarContenedores();
        System.out.println("Cantidad contenendores peligrosos = "+ puerto.cantidadContenedoresPeligrosos());




    }
}
