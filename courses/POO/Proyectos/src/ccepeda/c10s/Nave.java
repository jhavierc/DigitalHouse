package ccepeda.c10s;

public class Nave extends Objeto {

    private Double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, Double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
    }

    public void girar(char direccion) {
        super.setDireccion(direccion);
    }

    public void restaVida(int valor) {
        if (this.vida > valor) {
            this.vida -= valor;
        }
    }
}
