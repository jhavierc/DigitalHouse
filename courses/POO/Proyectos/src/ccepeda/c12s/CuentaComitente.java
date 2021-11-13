package ccepeda.c12s;

public class CuentaComitente extends Cuenta {

    private String claveValidacion;
    private int comision;
    private static final float PORCENTAJE_COMISION = 0.1F;

    @Override
    public void depositar(int valor) {
        float valorDeposito = valor - valor * PORCENTAJE_COMISION;
        super.depositar(Integer.parseInt(String.valueOf(valorDeposito)));
    }

    @Override
    public void extraer(int valor) {
        if (valor < super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
        }
    }


    public void extraer(int valor, String clave) {
        if (clave != null && clave.length() > 0) {
            this.extraer(valor);
        } else {
            this.extraer(valor / 2);
        }
    }
}
