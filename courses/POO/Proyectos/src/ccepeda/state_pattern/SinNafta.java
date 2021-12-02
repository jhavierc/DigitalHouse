package ccepeda.state_pattern;

public class SinNafta implements StateAuto{
    // Referencia a la clase de contexto
    private Auto v;

    // Constructor que inyecta la dependencia en la clase actual
    public SinNafta(Auto v)
    {
        this.v = v;
    }

    @Override
    public void acelerar() {
        System.out.println("ERROR: El vehiculo se encuentra sin combustible");
    }

    @Override
    public void frenar() {
        System.out.println("ERROR: El vehiculo se encuentra sin combustible");
    }

    @Override
    public void contacto() {
        System.out.println("ERROR: El vehiculo se encuentra sin combustible");
    }
}
