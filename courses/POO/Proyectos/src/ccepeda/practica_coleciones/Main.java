package ccepeda.practica_coleciones;

import java.util.*;
public class Main {

    public static void main(String[] args) {


        /*Creamos un empledo llamado Rodolfo que comenzo a trabajar el 2 de mayo de 1989*/
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Rodolfo");
        empleado1.setEdad(33);
        empleado1.setFechaIncorporacion(new Date(89,5,2));

        /*Creamos un empledo llamado Nicolas que comenzo a trabajar el 2 de mayo de 1990*/
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Nicolas");
        empleado2.setEdad(28);
        empleado2.setFechaIncorporacion(new Date(90,5,2));

        /*Creamos un empledo llamado Javier que comenzo a trabajar el 2 de mayo de 1995*/
        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Javier");
        empleado3.setEdad(39);
        empleado3.setFechaIncorporacion(new Date(95,5,2));


        /*Creamos un objeto Empresa y le incorporamos a los empleados*/
        Empresa digitalHouse = new Empresa();
        digitalHouse.setRazonSocial("Digital House S.A.");
        digitalHouse.incorporarEmpleado(empleado1);
        digitalHouse.incorporarEmpleado(empleado2);
        digitalHouse.incorporarEmpleado(empleado3);

        System.out.println("Mostramos los empleados incorporados a Digital House: ");
        digitalHouse.mostrarEmpleados();

        System.out.println("Mostramos los empleados incorporados a Digital House ordenados por edad: ");
        digitalHouse.mostrarEmpleadosOrdenadosPorEdad();

    }
}
