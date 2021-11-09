package ccepeda.practica2;

public class ContratoEstandar extends Contrato {

    public ContratoEstandar() {
        super();
    }

    @Override
    public float calcularCosto() {
        return getPrecioFijo();
    }

}
