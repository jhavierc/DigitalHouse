package ccepeda.c12s;

public abstract class Cuenta {

    private int saldo;

    public void depositar(int valor) {
        saldo += valor;
    }

    public abstract void extraer(int valor);


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                '}';
    }
}
