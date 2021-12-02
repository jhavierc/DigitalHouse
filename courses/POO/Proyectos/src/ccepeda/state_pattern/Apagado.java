package ccepeda.state_pattern;

public class Apagado implements StateAuto{

    // Referencia a la clase de contexto
    private Auto v;

    // Constructor que inyecta la dependencia en la clase actual
    public Apagado(Auto v)
    {
        this.v = v;
    }

    @Override
    public void acelerar() {
        // Acelerar con el vehiculo apagado no sirve de mucho <img draggable="false" role="img" class="emoji" alt="🙂" src="https://s0.wp.com/wp-content/mu-plugins/wpcom-smileys/twemoji/2/svg/1f642.svg">
        System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");

    }

    @Override
    public void frenar() {
        // Frenar con el vehiculo parado tampoco sirve de mucho...
        System.out.println("ERROR: El vehiculo esta apagado. Efectue el contacto para iniciar");

    }

    @Override
    public void contacto() {
        // Comprobamos que el vehiculo disponga de combustible
        if (v.getCombustibleActual() > 0)
        {
            // El vehiculo arranca -> Cambio de estado
            //estado = PARADO;
            v.setEstado(new Parado(v));
            System.out.println("El vehiculo se encuentra ahora PARADO");
            v.setVelocidadActual(0);
        }
        else
        {
            // El vehiculo no arranca -> Sin combustible
            //estado = SIN COMBUSTIBLE
            v.setEstado(new SinNafta(v));
            System.out.println("El vehiculo se encuentra sin combustible");
        }

    }
}
