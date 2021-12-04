package ccepeda.c21s;

public class Articulo {

    private String nombre;

    public Articulo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
