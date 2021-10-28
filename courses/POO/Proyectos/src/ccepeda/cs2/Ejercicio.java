package ccepeda.cs2;

public class Ejercicio {

    public static void main(String[] args) {
        System.out.println("-------- Grupo 5 -------");
        System.out.println("2 " + (numeroPrimo(2) ? "Es primo" : "No es primo"));
        System.out.println("5 " + (numeroPrimo(5) ? "Es primo" : "No es primo"));
        System.out.println("10 " + (numeroPrimo(10) ? "Es primo" : "No es primo"));
        System.out.println("17 " + (numeroPrimo(17) ? "Es primo" : "No es primo"));
        System.out.println("23 " + (numeroPrimo(23) ? "Es primo" : "No es primo"));
        System.out.println("15 " + (numeroPrimo(15) ? "Es primo" : "No es primo"));
        System.out.println("30 " + (numeroPrimo(30) ? "Es primo" : "No es primo"));

        System.out.println("El numero mayor es :" + maximoEntreTresNumeros(23, 191, 3));

        System.out.println("Las cadenas son iguales ?:" + cadenasDeTextoDistintas("hola mundo", "hola mundo"));
        System.out.println("Las cadenas son iguales ?:" + cadenasDeTextoDistintas("hola mundo", "hola equipo"));
    }

    public static boolean numeroPrimo(int numero) {
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

    public static Integer maximoEntreTresNumeros(Integer num1, Integer num2, Integer num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        return num3;
    }

    public static boolean cadenasDeTextoDistintas(String cadena1, String cadena2) {
        return cadena1.equals(cadena2);
    }
}
