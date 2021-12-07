package ccepeda.c22s;

public class Circulo implements Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double total = Math.PI * this.radio * this.radio;
        System.out.println("Area circulo :" + total);
        return total;
    }
}
