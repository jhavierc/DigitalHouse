package ccepeda.c19s;

public class Pelota extends Producto {

    private double radio;

    public Pelota(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return 4/3 * Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "radio=" + radio +
                '}';
    }
}
