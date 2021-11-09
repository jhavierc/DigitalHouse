package ccepeda.practica3;

public abstract class Perro {

    private String nombre;

    public Perro(){

    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public abstract String ladrar();

    public String ahullar() {
        return "auuuu";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
