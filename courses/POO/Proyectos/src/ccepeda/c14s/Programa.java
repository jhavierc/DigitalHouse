package ccepeda.c14s;

public class Programa {

    public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        Capitan capitan = new Capitan("Oscar", "as", "AAAA");
        Capitan capitan2 = new Capitan("ANDRES", "aaa", "ccccc");

        Velero velero = new Velero(222, 3333, 1900,100, capitan, 3);
        Velero velero2 = new Velero(333, 4444, 2001,150, capitan, 20);


        System.out.println("El velero 1 es grande ? "+ velero.validarSiEsGrande());
        System.out.println("El velero 2 es grande ? "+ velero2.validarSiEsGrande());
        System.out.println(velero.toString());
        System.out.println(velero2.toString());

        System.out.println("---------------------------------------------");
        Yate yate1 = new Yate(11,222,2000,111, capitan2, 100);
        Yate yate2 = new Yate(11,222,2010,111, capitan2, 400);
        System.out.println(yate1.toString());
        System.out.println(yate2.toString());
        int resultado = yate1.compareTo(yate2);
        if(resultado==1){
            System.out.println("El yate1 es mas lujoso que el segundo yate");
        } else {
            System.out.println("El yate1 NO es mas lujoso que el yate dos");
        }




    }
}
