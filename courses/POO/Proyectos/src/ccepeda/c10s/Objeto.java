package ccepeda.c10s;

import java.util.Objects;

public class Objeto {

    private Integer posx;
    private Integer posy;
    private char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion) {
        this.posx=x;
        this.posy=y;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public Integer getPosx() {
        return posx;
    }

    public void setPosx(Integer posx) {
        this.posx = posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public void setPosy(Integer posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("heredado.....");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto objeto = (Objeto) o;
        return posx == objeto.posx && posy == objeto.posy && direccion == objeto.direccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posx, posy, direccion);
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }
}
