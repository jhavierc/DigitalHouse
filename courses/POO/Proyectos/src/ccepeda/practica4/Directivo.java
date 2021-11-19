package ccepeda.practica4;

import java.util.Arrays;

public class Directivo extends Empleado implements Comparable {

    private String categoria;
    private Empleado[] lista;


    public Directivo(String nombre, int edad, int sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
        lista = new Empleado[5];
    }


    //0=>A==B
    //-1=> A<B
    //1 => A>B
    @Override
    public int compareTo(Object o) {
        Directivo directivo = (Directivo) o;
        return this.getEdad() - directivo.getEdad();
    }

    public Empleado[] getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                ", lista=" + Arrays.toString(lista) +
                '}';
    }
}
