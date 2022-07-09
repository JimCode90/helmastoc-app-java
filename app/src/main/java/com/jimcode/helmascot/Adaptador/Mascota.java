package com.jimcode.helmascot.Adaptador;

public class Mascota {
    private String nombre;
    private int foto;
    private String raza;
    private String descripcion;
    private String fecha;


    public Mascota(String nombre, int foto, String raza, String descripcion, String fecha) {
        this.nombre = nombre;
        this.foto = foto;
        this.raza = raza;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
