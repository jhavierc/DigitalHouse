package ccepeda.practica_coleciones;

import java.util.*;

/*Implemantamos la interface Comparable para ordenar la lista*/
public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private Date fechaIncorporacion;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private int edad;

    public int calcularAntiguedad()
    {
        Date fechaActual = new Date();
        return fechaActual.getYear() - fechaIncorporacion.getYear();
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*Utilizaremos la edad para ordenar*/
    @Override
    public int compareTo(Empleado e2) {

        /*el método debe devolver
        * mayor a 1 si este objeto es mayor al que viene por parametro
        * menor a 1 si el objeto que viene por parametro es mayor
        * cero si ambos son iguales*/

        return this.getEdad() - e2.getEdad();

    }
}
