package ccepeda.practica2;

import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private int codigo;
    private float horasEstimadas;
    private int duracionProyecto;
    private ArrayList<Empleado> listaEmpleados;

    public Proyecto() {
        this.listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public void setHorasEstimadas(float horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int getDuracionProyecto() {
        return duracionProyecto;
    }

    public void setDuracionProyecto(int duracionProyecto) {
        this.duracionProyecto = duracionProyecto;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public float calcularHorasHombre() {
        return this.duracionProyecto / this.getListaEmpleados().size();
    }

    public float calcularCostoTotalProyecto() {
        float totalProyecto = 0;
        for (int i = 0; i < this.getListaEmpleados().size(); i++) {
            if (this.getListaEmpleados().get(i).getContrato() != null) {
                totalProyecto += this.getListaEmpleados().get(i).getContrato().calcularCosto();
            }
        }
        return totalProyecto;
    }
}
