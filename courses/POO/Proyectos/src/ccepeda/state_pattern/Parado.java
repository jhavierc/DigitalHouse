package ccepeda.state_pattern;

public class Parado implements StateAuto{
    private Auto v;

    // Constructor que inyecta la dependencia en la clase actual
    public Parado(Auto v)
    {
        this.v = v;
    }


    @Override
    public void frenar()
    {
        // No ocurre nada. Si el vehiculo ya se encuentra detenido, no habra efecto alguno
        System.out.println("ERROR: El vehiculo ya se encuentra detenido");
    }

    @Override
    public void contacto()
    {
        // El vehiculo se apaga
        // estado = APAGADO;
        v.setEstado(new Apagado(v));
        System.out.println("El vehiculo se encuentra ahora APAGADO");
    }

    @Override
    public void acelerar() {
        // Comprobamos que el vehiculo disponga de combustible
        if (v.getCombustibleActual() > 0)
        {
            // El vehiculo se pone en marcha. Aumenta la velocidad y cambiamos de estado
            //estado = EN_MARCHA;
            v.setEstado(new EnMarcha(v));
            System.out.println("El vehiculo se encuentra ahora EN MARCHA");
            v.modificarVelocidad(10);
            v.modificarCombustible(-10);
        }
        else
        {
            //estado = SIN COMBUSTIBLE
            v.setEstado(new SinNafta(v));
            System.out.println("El vehiculo se encuentra ahora SIN COMBUSTIBLE");
        }

    }

}
