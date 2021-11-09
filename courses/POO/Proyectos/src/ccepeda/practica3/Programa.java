package ccepeda.practica3;

public class Programa {

    public static void main(String[] args) {

        Husky akira = new Husky();
        akira.setNombre("Akira");

        Husky akira2 = new Husky();
        akira.setNombre("Akira");

        akira.setNombre("asdasd");

        System.out.println("igual ?"+akira2.equals(akira));
        System.out.println("igual ?"+akira.equals(akira));

        System.out.println(akira.ladrar());
        System.out.println(akira.ahullar());

        System.out.println("-------------------------------");
        Perro perro1 = new Husky();
        perro1.setNombre("Pato");
        System.out.println(perro1.getNombre());
        System.out.println(perro1.ahullar());
        System.out.println(perro1.ladrar());

        System.out.println("-------------------------------");
        Perro perro2 = new Picher();
        perro2.setNombre("Pincher");
        System.out.println(perro2.getNombre());
        System.out.println(perro2.ahullar());
        System.out.println(perro2.ladrar());

    }
}
