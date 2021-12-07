package ccepeda.c22s;

public class Cuadrado implements Figura {

    private double alto;
    private double largo;

    public Cuadrado(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        double total =alto * largo;
        System.out.println("Area cuadrado :" + total);
        return total;
    }
}
