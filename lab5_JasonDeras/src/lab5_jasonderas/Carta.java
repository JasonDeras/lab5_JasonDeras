package lab5_jasonderas;

public class Carta {

    private String nombre;
    private double daño;
    private double vida;
    private String objetivo;
    private String velocidad;
    private int coste;
    private String tipo;

    public Carta() {
    }

    public Carta(String nombre, double daño, double vida, String objetivo, String velocidad, int coste, String tipo) {
        this.nombre = nombre;
        this.daño = daño;
        this.vida = vida;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.coste = coste;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", da\u00f1o=" + daño + ", vida=" + vida + ", objetivo=" + objetivo + ", velocidad=" + velocidad + ", coste=" + coste + ", tipo=" + tipo + '}';
    }

}
