/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sergio.ojeda
 */
public class Actividad {
    private String codigo;
    private String nombre;
    private String dependencias;
    private int duracionDias;

    public Actividad(String codigo, String nombre, String dependencias, int duracionDias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dependencias = dependencias;
        this.duracionDias = duracionDias;
    }

    @Override
    public String toString() {
        return "Actividad{" + "codigo=" + codigo + ", nombre=" + nombre + ", dependencias=" + dependencias + ", duracionDias=" + duracionDias + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDependencias() {
        return dependencias;
    }

    public void setDependencias(String dependencias) {
        this.dependencias = dependencias;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }
    
    
    
}
