package ccepeda.state_pattern;

public class Auto {
    private StateAuto estado;                 // Estado actual del vehiculo (apagado, parado, en marcha, sin combustible)
    private int velocidadActual = 0;      // Velocidad actual del vehiculo
    private int combustibleActual = 0;    // Cantidad de combustible restante

    public Auto(int combustible)
    {
        this.setCombustibleActual(combustible);
        //TODO:
         //Indicar un estado inicial (Apagado)
        this.setEstado(new Apagado(this));
    }
    public void acelerar()
    {
        getEstado().acelerar();
        System.out.println("Velocidad actual: " + getVelocidadActual() + ". Combustible restante: " + getCombustibleActual());
    }

    public void frenar()
    {
        getEstado().frenar();
    }

    public void contacto()
    {
        getEstado().contacto();
    }

    public void modificarVelocidad(int kmh)
    {
        setVelocidadActual(getVelocidadActual() + kmh);
    }

    public void modificarCombustible(int decilitros)
    {
        setCombustibleActual(getCombustibleActual() + decilitros);
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getCombustibleActual() {
        return combustibleActual;
    }

    public void setCombustibleActual(int combustibleActual) {
        this.combustibleActual = combustibleActual;
    }

    public StateAuto getEstado() {
        return estado;
    }

    public void setEstado(StateAuto estado) {
        this.estado = estado;
    }
}
