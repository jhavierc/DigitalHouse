package ccepeda.parcial;

public class Propietario {

    private String nombre;
    private String apellido;
    private String cuil;

    public Propietario(String nombre, String apellido, String cuil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuil='" + cuil + '\'' +
                '}';
    }
}
