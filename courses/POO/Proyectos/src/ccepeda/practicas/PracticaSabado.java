package ccepeda.practicas;


import java.util.Scanner;

public class PracticaSabado {

    public static void main(String[] args) {
        System.out.println("Practica sabado");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre del usuario");
        String nombreUsuario = entrada.next();
        System.out.println("Bievenido "+nombreUsuario);
        boolean salir = false;
        while (!salir) {
            System.out.println("-----MENU-----");
            System.out.println("[1] Sumar");
            System.out.println("[2] Restar");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("[5] Salir");
            System.out.println("Ingrese la operacion:");
            int opcion = entrada.nextInt();
            if (opcion < 1 || opcion > 4) {
                salir = true;
            } else {
                System.out.println("Ingrese el numero 1");
                int num1 = entrada.nextInt();
                System.out.println("Ingrese el numero 2");
                int num2 = entrada.nextInt();
                int resultado;
                switch (opcion) {
                    case 1:
                        resultado = sumar(num1, num2);
                        break;
                    case 2:
                        resultado = restar(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        break;
                    default:
                        resultado = 0;
                }
                System.out.println("El resultado es :" + resultado);
            }

        }



        /*System.out.println("Ingrese el nombre del primer perro: ");
        String perro1Nombre= entrada.next();
        System.out.println("Ingresar la raza");
        String perro1Raza= entrada.next();
        System.out.println("Ingresar la edad");
        int perro1Edad= entrada.nextInt();

        String perro2Nombre="Otro";
        String perro2Raza="Husky";
        int perro2Edad=4;

        System.out.println("Datos del primer perro");
        System.out.println(perro1Nombre);
        System.out.println(perro1Edad);
        System.out.println(perro1Raza);

        System.out.println("Datos del segundo perro");
        System.out.println(perro2Nombre);
        System.out.println(perro2Edad);
        System.out.println(perro2Raza);

         */


    }

    public static int sumar(int num1, int num2) {

        return num1 + num2;
    }

    public static int restar(int num1, int num2) {

        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {

        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {

        return num1 / num2;
    }
}
