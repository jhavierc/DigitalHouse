package ccepeda.factory;

public class EmpleadoFactory {
    private static EmpleadoFactory instance;

    private EmpleadoFactory()
    {
    }

    public static EmpleadoFactory getInstance()
    {
        if(instance == null)
            instance = new EmpleadoFactory();

        return instance;
    }

    public Empleado crearEmpleado(String cod)
    {

        Empleado resultado = null;

        switch (cod) {
            case "EMP-INT":
                resultado = new EmpleadoRelacionDependencia();
                break;
            case "EMP-EXT":
                resultado =  new EmpleadoContratado();
                break;
        }

        return resultado;
    }
}

