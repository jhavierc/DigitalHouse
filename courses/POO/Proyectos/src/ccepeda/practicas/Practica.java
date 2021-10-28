package ccepeda.practicas;

import java.util.Arrays;
import java.util.Scanner;

public class Practica {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer valor:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese segundo valor:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el coeficiente:");
        float coeficiente = scanner.nextFloat();
        System.out.println("Ingrese su nombre:");
        String name = scanner.next();

        System.out.println(name.charAt(0));

        System.out.println("La suma de los primeros valores es : " + suma(num1, num2));
        Object[] miarray = new Object[4];
        miarray[0] = 1;
        miarray[1] = 100;
        miarray[2] = 4.5;
        miarray[3] = "javier";

        for (int i = 0; i < miarray.length; i++) {
            System.out.println(miarray[i]);
        }

        String [] nombres= new String[] { "pedro", "angel", "oscar","ana","maria"};
        Arrays.stream(nombres).forEach(System.out::println);

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
