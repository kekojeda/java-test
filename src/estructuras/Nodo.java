/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras;

/**
 *
 * @author Alumnos
 */
public class Nodo {
    // accesibles desde otras clases del paquete
    protected Object dato;
    protected Nodo siguiente;
    protected Nodo anterior;
    //constructor
    
    public Nodo(Object dato, Nodo anterior, Nodo siguiente){
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    
    public Nodo( Object o, Nodo n ){
        dato = o;
        siguiente = n;
    }
    
    public Nodo( Object o){
        dato = o;
        siguiente = null;
    }
    
    public Nodo(){
        dato = null;
        siguiente = null;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    public Object getDato() { 
        return dato; 
    } 
  
    public Nodo getSiguiente() { 
        return siguiente; 
    } 
  
    public void setSiguiente(Nodo siguiente) { 
        this.siguiente = siguiente; 
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
}
