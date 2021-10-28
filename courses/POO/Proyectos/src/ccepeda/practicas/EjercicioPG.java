package ccepeda.practicas;

public class EjercicioPG {

    public static void main(String[] args) {
        String cadena1 = "Hola mundo";
        String cadena2 ="hola";

        System.out.println("Son iguales?"+ cadena1.equals(cadena2));

        String dato = "corrre@gmail.com";
        int datoServidor = Integer.parseInt( "23");

        int[] arrayNUmeros = new int[]{1,2,44,55,44};

        Object[] mirray = new Object[]{1, "3", 4.4};
        int suma=0;
        for (int i = 0; i < mirray.length; i++) {
            suma +=  Integer.parseInt(mirray[i].toString());
        }
        System.out.println(suma);



/*
        int num1=23;
        int num2=7;
        int num3=19;
        if(num1> num2 && num1 >num3){
            System.out.println("El mayor es num1 :"+num1);
        }else if(num2> num1 && num2 >num3){
            System.out.println("El mayor es num2 :"+num2);
        } else {
            System.out.println("El mayor es num3 :"+num3);

        }
 */
    }
}
