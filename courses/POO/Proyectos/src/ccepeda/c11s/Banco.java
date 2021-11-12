package ccepeda.c11s;

public class Banco {

    public static void main(String[] args) {

        System.out.println("Simacion cuenta bancaria de dos clientes");

        System.out.println(">>>>>Cliente 1 <<<<<");
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos");
        cliente.setApellido("Cepeda");
        cliente.setDni(11111);
        cliente.setNumero(1);

        Cuenta cuenta = new CajaAhorro();
        cuenta.setSaldo(10000);
        cliente.setCuenta(cuenta);

        System.out.println(cliente.toString());

        cliente.getCuenta().extraer(50);

        System.out.println(cliente.toString());

        cliente.getCuenta().depositar(500);

        System.out.println(cliente.toString());

        System.out.println(">>>>>Cliente 1 <<<<<");
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Matth");
        cliente2.setApellido("Cepeda");
        cliente2.setDni(23433);
        cliente2.setNumero(2);


        Cuenta cuenta2 = new CajaCorriente(5000);
        cliente2.setCuenta(cuenta2);

        System.out.println(cliente2.toString());

        cliente2.getCuenta().extraer(50);

        System.out.println(cliente2.toString());

        cliente2.getCuenta().depositar(500);

        System.out.println(cliente2.toString());

        cliente2.getCuenta().extraer(100);

        System.out.println(cliente2.toString());

    }
}
