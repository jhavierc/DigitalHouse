package ccepeda.cs5;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private double puntaje;
    private int nivel;

    public UsuarioJuego(){
        this.nombre="";
    }

    /**
     * 
     * @param nombre
     * @param clave
     */
    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void aumentarPuntaje() {
        this.puntaje += 1;
    }

    public void subirNivel() {
        this.nivel += 1;
    }

    public void bonus(double valor) {
        this.puntaje += valor;
    }


}
