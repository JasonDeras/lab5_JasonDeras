package lab5_jasonderas;

import java.awt.Color;
import java.util.ArrayList;

public class Usuarios {

    private String nombre;
    private String apellido;
    private String n_usuario;
    private int edad;
    private Color c;
    private ArrayList<Mazo> mazos = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String n_usuario, int edad, Color c) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_usuario = n_usuario;
        this.edad = edad;
        this.c = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getN_usuario() {
        return n_usuario;
    }

    public void setN_usuario(String n_usuario) {
        this.n_usuario = n_usuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public ArrayList<Mazo> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<Mazo> mazos) {
        this.mazos = mazos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", n_usuario=" + n_usuario + ", edad=" + edad + ", c=" + c + ", mazos=" + mazos + '}';
    }

}
