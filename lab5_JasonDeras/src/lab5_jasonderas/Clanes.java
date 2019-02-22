package lab5_jasonderas;

import java.util.ArrayList;
import java.util.Date;

public class Clanes {

    private String nombre;
    private ArrayList<Usuarios> miembros = new ArrayList();
    private Date Fecha;
    private String lider;
    private String tipo;

    public Clanes() {
    }

    public Clanes(String nombre, Date Fecha, String lider, String tipo) {
        this.nombre = nombre;
        this.Fecha = Fecha;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuarios> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuarios> miembros) {
        this.miembros = miembros;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Clanes{" + "nombre=" + nombre + ", miembros=" + miembros + ", Fecha=" + Fecha + ", lider=" + lider + ", tipo=" + tipo + '}';
    }

}
