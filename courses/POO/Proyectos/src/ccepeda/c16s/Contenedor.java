package ccepeda.c16s;

public class Contenedor implements Comparable<Contenedor> {

    private int identificacion;
    private String nombrePaisProcedencia;
    private boolean peligroso;

    public Contenedor(int identifacion, String nombrePaisProcedencia, boolean peligroso) {
        this.identificacion = identifacion;
        this.nombrePaisProcedencia = nombrePaisProcedencia;
        this.peligroso = peligroso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "identifacion=" + identificacion +
                ", nombrePaisProcedencia='" + nombrePaisProcedencia + '\'' +
                ", peligroso=" + peligroso +
                '}';
    }


    @Override
    public int compareTo(Contenedor o) {
        return this.identificacion - o.identificacion;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public boolean procedenciaDesconocida() {
        return nombrePaisProcedencia == "Desconocida";
    }
}
