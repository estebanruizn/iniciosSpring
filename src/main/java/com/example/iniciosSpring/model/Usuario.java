package com.example.iniciosSpring.model;

public class Usuario {

    private String nombre;
    private String codigo;
    private String apellido;

    public Usuario() {
    }

    public Usuario(String nombre, String codigo, String apellido) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
