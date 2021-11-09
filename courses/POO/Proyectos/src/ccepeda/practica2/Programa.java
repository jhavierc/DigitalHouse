package ccepeda.practica2;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto();
        proyecto1.setNombre("Proyecto 1");
        proyecto1.setDuracionProyecto(20);


        ContratoEstandar contratoEstandar = new ContratoEstandar();
        contratoEstandar.setPrecioFijo(500);
        Empleado empleado1 = new Empleado("Juan", 123, contratoEstandar);
        Empleado empleado3 = new Empleado("Pepipa", 432, contratoEstandar);

        ContratoHoras contratoHoras = new ContratoHoras(12, 200);
        contratoHoras.setPrecio(500);
        Empleado empleado2 = new Empleado("Andres", 555, contratoHoras);

        proyecto1.getListaEmpleados().add(empleado1);
        proyecto1.getListaEmpleados().add(empleado2);
        proyecto1.getListaEmpleados().add(empleado3);


        System.out.println("Costo proyecto empleado 1 :" + empleado1.getContrato().calcularCosto());
        System.out.println("Costo proyecto empleado 2 :" + empleado3.getContrato().calcularCosto());
        System.out.println("Costo proyecto empleado 3 :" + empleado2.getContrato().calcularCosto());

        System.out.println("Horas hombre proyecto :" + proyecto1.calcularHorasHombre());


        for (int i = 0; i < proyecto1.getListaEmpleados().size(); i++) {

            System.out.println(proyecto1.getListaEmpleados().get(i).toString());
        }

        System.out.println("Costo total del proyecto :"+ proyecto1.calcularCostoTotalProyecto());

    }
}
