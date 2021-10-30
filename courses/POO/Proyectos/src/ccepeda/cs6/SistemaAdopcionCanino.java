package ccepeda.cs6;

public class SistemaAdopcionCanino {

    public static void main(String[] args) {

        Perro firulais = new Perro();
        firulais.setAdopcion(false);
        firulais.setChip(false);
        firulais.setAnioNacimiento(2019);
        firulais.setPeso(34);
        firulais.setSano(true);
        firulais.setNombre("Firulais");

        System.out.println(firulais.toString());

        System.out.println(firulais.enviarAAdopcion());

        System.out.println(firulais.sePuedePerder());


    }
}
