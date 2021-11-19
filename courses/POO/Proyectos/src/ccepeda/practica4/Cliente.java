package ccepeda.practica4;

public class Cliente extends Persona{

    private int telefono;

    public Cliente(String nombre, int edad) {
        super(nombre, edad);
    }

    public Cliente(String nombre, int edad, int telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }
}
