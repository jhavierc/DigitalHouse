package ccepeda.factory;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        double totalSueldo = empresa.calcularSueldoTotal(25);

        System.out.println("Total de Sueldos abonados: ");
        System.out.println(totalSueldo);

    }

}
