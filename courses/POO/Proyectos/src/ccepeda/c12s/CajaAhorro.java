package ccepeda.c12s;

public class CajaAhorro extends Cuenta {

    private static final float INTERES=1.2F;

    @Override
    public void extraer(int valor) {
        if (valor < super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
        }
    }

    public float getInteres() {
        return super.getSaldo()*  INTERES;
    }

    @Override
    public String toString() {
        return "CajaAhorro{" +
                "interes=" + INTERES +
                ", saldo=" + super.getSaldo() +
                ", interesCalculado =" + getInteres() +
                '}';
    }
}
