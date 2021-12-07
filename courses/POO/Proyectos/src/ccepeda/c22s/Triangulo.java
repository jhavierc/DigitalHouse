package ccepeda.c22s;

public class Triangulo implements Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double total= (this.base * this.altura) / 2;
        System.out.println("Area triangulo :" + total);
        return total;
    }
}
