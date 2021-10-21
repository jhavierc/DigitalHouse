package ccepeda.test;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        System.out.println(esPrimo(17));
    }

    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }




   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer valor:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese segundo valor:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el coeficiente:");
        float coeficiente = scanner.nextFloat();
        System.out.println("Ingrese su nombre:");
        String name = scanner.next();

        System.out.println("La suma de los primeros valores es : " + suma(num1, num2));
        Object[] miarray = new Object[4];
        miarray[0]=1;
        miarray[1]=100;
        miarray[2]=4.5;
        miarray[3]="javier";

        for (int i=0; i<miarray.length; i++){
            System.out.println(miarray[i]);
        }

    }*/

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
