package ccepeda.cs5;

public class Practica {

    public static void main(String[] args) {

        UsuarioJuego usuario1 = new UsuarioJuego("carlos", "1234");
        System.out.println("NOmbre : " + usuario1.getNombre());
        System.out.println("Puntaje : " + usuario1.getPuntaje());
        System.out.println("Nivel : " + usuario1.getNivel());
        System.out.println("Clave : " + usuario1.getClave());

        System.out.println("-------------------");
        usuario1.aumentarPuntaje();
        usuario1.subirNivel();
        usuario1.bonus(200);

        System.out.println("NOmbre : " + usuario1.getNombre());
        System.out.println("Puntaje : " + usuario1.getPuntaje());
        System.out.println("Nivel : " + usuario1.getNivel());
        System.out.println("Clave : " + usuario1.getClave());

        System.out.println("-------------------");
        UsuarioJuego usuario2 = new UsuarioJuego("andres", "3333");
        System.out.println("NOmbre : " + usuario2.getNombre());
        System.out.println("Puntaje : " + usuario2.getPuntaje());
        System.out.println("Nivel : " + usuario2.getNivel());
        System.out.println("Clave : " + usuario2.getClave());

    }
}
