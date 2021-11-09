package ccepeda.c10s;

public class Juego {

    public static void main(String[] args) {

        Nave nave = new Nave(2, 3, 'O', 20.0, 100);
        System.out.println("Nave :" + nave.toString());


        Asteroide asteroide = new Asteroide(2, 3, 'O', 20);
        System.out.println("Asteroide :" + asteroide.toString());

        System.out.println("Aqui..." + String.valueOf(nave.getDireccion()));

        if (nave.getPosx().equals(asteroide.getPosx()) && nave.getPosy().equals(asteroide.getPosy()) &&
                String.valueOf(nave.getDireccion()).equals(String.valueOf(asteroide.getDireccion()))
        ) {
            nave.girar('N');
            nave.irA(2, 5, 'N');
            nave.restaVida(asteroide.getLesion());
        }

        System.out.println("Nave :" + nave.toString());
        System.out.println("Asteroide :" + asteroide.toString());


    }


}
