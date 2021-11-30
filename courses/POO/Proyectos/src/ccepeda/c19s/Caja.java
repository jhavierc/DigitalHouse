package ccepeda.c19s;

public class Caja extends Producto {

    private double logintud;
    private double ancho;
    private double altura;


    @Override
    public double calcularEspacio() {
        this.logintud = ancho * altura;
        return this.logintud;
    }

    public void setLogintud(double logintud) {
        this.logintud = logintud;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "logintud=" + logintud +
                ", ancho=" + ancho +
                ", altura=" + altura +
                '}';
    }
}
