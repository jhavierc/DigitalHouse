package ccepeda.state_pattern;

public class EnMarcha implements StateAuto{
    private final int VELOCIDAD_MAXIMA = 200;

    // Referencia a la clase de contexto
    private Auto v;

    // Constructor que inyecta la dependencia en la clase actual
    public EnMarcha(Auto v)
    {
        this.v = v;
    }

    @Override
    public void acelerar() {
        if (v.getCombustibleActual() > 0)
        {
            // Aumentamos la velocidad, permaneciendo en el mismo estado
            if (v.getVelocidadActual() >= VELOCIDAD_MAXIMA)
            {
                System.out.println("ERROR: El coche ha alcanzado su velocidad maxima");
                v.modificarCombustible(-10);
            }
            else
            {
                v.modificarVelocidad(10);
                v.modificarCombustible(-10);
            }
        }
        else
        {
            //estado = SIN COMBUSTIBLE
            v.setEstado(new SinNafta(v));
            System.out.println("El vehiculo se ha quedado sin combustible");
        }

    }

    @Override
    public void frenar() {
        // Reducimos la velocidad. Si esta llega a 0, cambiaremos a estado "PARADO"
        v.modificarVelocidad(-10);
        if (v.getVelocidadActual() <= 0)
        {
            //estado = PARADO;
            v.setEstado(new Parado(v));
            System.out.println("El vehiculo se encuentra ahora PARADO");
        }

    }

    @Override
    public void contacto() {
        // No se puede detener el vehiculo en marcha!
        System.out.println("ERROR: No se puede cortar el contacto en marcha!");

    }
}
