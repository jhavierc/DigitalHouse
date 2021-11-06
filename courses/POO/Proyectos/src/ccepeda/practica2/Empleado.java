package ccepeda.practica2;

public class Empleado {

    private String nombre;
    private int documento;
    private ContratoEstandar contratoEstandar;
    private ContratoHoras contratoHoras;

    public Empleado(String nombre, int documento, ContratoEstandar contratoEstandar) {
        this.nombre = nombre;
        this.documento = documento;
        this.contratoEstandar = contratoEstandar;
    }

    public Empleado(String nombre, int documento, ContratoHoras contratoHoras) {
        this.nombre = nombre;
        this.documento = documento;
        this.contratoHoras = contratoHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public ContratoEstandar getContratoEstandar() {
        return contratoEstandar;
    }

    public void setContratoEstandar(ContratoEstandar contratoEstandar) {
        this.contratoEstandar = contratoEstandar;
    }

    public ContratoHoras getContratoHoras() {
        return contratoHoras;
    }

    public void setContratoHoras(ContratoHoras contratoHoras) {
        this.contratoHoras = contratoHoras;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", contratoEstandar=" + contratoEstandar +
                ", contratoHoras=" + contratoHoras +
                '}';
    }
}
