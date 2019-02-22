package lab5_jasonderas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Usuarios {

    private String contraseña;
    private String nombre;
    private String apellido;
    private String n_usuario;
    private int edad;
    private Color c;
    private ArrayList<Mazo> mazos1 = new ArrayList();
    private ArrayList<Mazo> mazos2 = new ArrayList();
    private ArrayList<Mazo> mazos3 = new ArrayList();
    private Date Fecha;

    public Usuarios() {
    }

    public Usuarios(String contraseña, String nombre, String apellido, String n_usuario, int edad, Color c, Date Fecha) {
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_usuario = n_usuario;
        this.edad = edad;
        this.c = c;
        this.Fecha = Fecha;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    public ArrayList<Mazo> getMazos1() {
        return mazos1;
    }

    public void setMazos1(ArrayList<Mazo> mazos1) {
        this.mazos1 = mazos1;
    }

    public ArrayList<Mazo> getMazos2() {
        return mazos2;
    }

    public void setMazos2(ArrayList<Mazo> mazos2) {
        this.mazos2 = mazos2;
    }

    public ArrayList<Mazo> getMazos3() {
        return mazos3;
    }

    public void setMazos3(ArrayList<Mazo> mazos3) {
        this.mazos3 = mazos3;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", n_usuario=" + n_usuario + ", edad=" + edad + ", c=" + c + ", mazos1=" + mazos1 + ", mazos2=" + mazos2 + ", mazos3=" + mazos3 + ", Fecha=" + Fecha + '}';
    }

}
