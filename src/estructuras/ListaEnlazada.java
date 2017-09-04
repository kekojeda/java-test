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
public class ListaEnlazada implements Lista{
    
    private Nodo cabecera;
    private Nodo actual;
    
    public ListaEnlazada(){
        cabecera = new Nodo(null);
    }

    public boolean esVacia() {
        return cabecera.getSiguiente() == null;
    }

    @Override
    public void vaciar() {
        cabecera.setSiguiente(null);
    }

    public Nodo getCabecera() {
        return cabecera;
    }

    public void setCabecera(Nodo cabecera) {
        this.cabecera = cabecera;
    }

    public Nodo getActual() {
        return actual;
    }

    public void setActual(Nodo actual) {
        this.actual = actual;
    }
    
    
    
}
