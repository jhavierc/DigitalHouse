package ccepeda.factory;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa(){
        empleados = new ArrayList<>();

        EmpleadoRelacionDependencia emp1 = (EmpleadoRelacionDependencia) EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Juan");
        emp1.setApellido("Rodriguez");
        emp1.setSueldoMensual(100000);

        EmpleadoContratado emp2 = (EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        emp2.setNombre("Juan");
        emp2.setApellido("Rodriguez");
        emp2.setImportePorHora(2500);

        empleados.add(emp1);
        empleados.add(emp2);
    }



    public double calcularSueldoTotal(int dias){
        double total = 0;
        for(Empleado emp: empleados)
            total+=emp.calcularSueldo(dias);

        return total;
    }
}
