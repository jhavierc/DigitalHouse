package ccepeda.cs6;

import java.util.Date;

public class Perro {

    private boolean adopcion;
    private String raza;
    private int anioNacimiento;
    private boolean chip;
    private boolean sano;
    private String nombre;
    private int peso;


    public Perro() {

    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public boolean isAdopcion() {
        return adopcion;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int edad() {
        Date fechaHoy = new Date();
        return fechaHoy.getYear() - this.anioNacimiento;
    }

    public String enviarAAdopcion() {
        return "Es adoptanle ?" + ((sano && peso > 5)?"SI":"NO");
    }

    public String sePuedePerder() {
        return "Se puede adoptar? " + (this.chip?"NO":"SI");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "adopcion=" + adopcion +
                ", raza='" + raza + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", chip=" + chip +
                ", sano=" + sano +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
