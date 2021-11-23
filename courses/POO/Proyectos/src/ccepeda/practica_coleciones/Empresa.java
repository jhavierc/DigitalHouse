package ccepeda.practica_coleciones;

import java.util.*;

public class Empresa {
    private String razonSocial;
    /*utilizamos una colección ArrayList y solo almacena <Empleados>*/
    private List<Empleado> empleados = new ArrayList<>();

    /*el metodo incorporarEmpleado agrega un empleado a la colección*/
    public void incorporarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public int cantidadEmpleados()
    {
        return empleados.size();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void mostrarEmpleados(){
        /*recorremos la lista de empleados. Como usamos Generics directamente recorremos
        * empledos y no object*/
        for(Empleado empleado : empleados)
            System.out.println(empleado.getNombre());
    }

    public void mostrarEmpleadosOrdenadosPorEdad()
    {
        empleados.sort(null);
        mostrarEmpleados();
    }
}
