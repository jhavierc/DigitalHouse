package ccepeda.practica2;

public class Empleado {

    private String nombre;
    private int documento;
    private Contrato contrato;

    public Empleado(String nombre, int documento, ContratoEstandar contratoEstandar) {
        this.nombre = nombre;
        this.documento = documento;
        this.contrato = contratoEstandar;
    }

    public Empleado(String nombre, int documento, ContratoHoras contratoHoras) {
        this.nombre = nombre;
        this.documento = documento;
        this.contrato = contratoHoras;
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

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", contrato=" + contrato +
                '}';
    }
}
