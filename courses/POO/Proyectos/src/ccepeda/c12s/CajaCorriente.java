package ccepeda.c12s;

public class CajaCorriente extends Cuenta {

    private int montoAutorizado;

    public CajaCorriente(int montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    public int getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(int montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(int valor) {
        if (super.getSaldo() < valor) {
            this.montoAutorizado -= valor;
        } else {
            super.setSaldo(super.getSaldo() - valor);
        }
    }

    @Override
    public String toString() {
        return "CajaCorriente{" +
                "montoAutorizado=" + montoAutorizado +
                ", saldo=" + super.getSaldo() +
                '}';
    }
}
