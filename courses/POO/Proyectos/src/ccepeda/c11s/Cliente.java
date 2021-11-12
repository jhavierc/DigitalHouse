package ccepeda.c11s;

public class Cliente {

    private int numero;
    private String apellido;
    private String nombre;
    private int dni;
    private int ciut;

    private Cuenta cuenta;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCiut() {
        return ciut;
    }

    public void setCiut(int ciut) {
        this.ciut = ciut;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", ciut=" + ciut +
                ", cuenta=" + cuenta +
                '}';
    }
}
