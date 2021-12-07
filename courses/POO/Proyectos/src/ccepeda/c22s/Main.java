package ccepeda.c22s;

public class Main {

    public static void main(String[] args) {

        FiguraGrande figuraGrande = new FiguraGrande();

        Cuadrado cuadrado = new Cuadrado(6, 4);
        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(1);
        Triangulo triangulo = new Triangulo(2, 2);
        figuraGrande.getLocomotora().addFigura(cuadrado);
        figuraGrande.getLocomotora().addFigura(circulo1);
        figuraGrande.getLocomotora().addFigura(circulo2);
        figuraGrande.getLocomotora().addFigura(triangulo);
        
        Vagon vagon = new Vagon();
        Cuadrado cuadrado2 = new Cuadrado(5, 4);
        Circulo circulo3 = new Circulo(1);
        Circulo circulo4 = new Circulo(1);
        Circulo circulo5 = new Circulo(1);
        vagon.addFigura(cuadrado2);
        vagon.addFigura(circulo3);
        vagon.addFigura(circulo4);
        vagon.addFigura(circulo5);
        figuraGrande.addVagon(vagon);

        System.out.println("------------------------------");
        System.out.println("Total area Locomotora :" + figuraGrande.getLocomotora().calcularAreaTotal());
        System.out.println("Total area Vagon :" + vagon.calcularAreaTotal());
        System.out.println("Total area Figura Grande :" + figuraGrande.calcularArea());
        System.out.println("------------------------------");

    }
}
