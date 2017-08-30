/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author Usuario
 */
public class ListaDoblementeEnlazada implements Lista {
    
    private Nodo cabecera;
    private Nodo fin;
    private Nodo actual;
    
    public ListaDoblementeEnlazada(){
        cabecera = new Nodo(null);
        fin = new Nodo(null);
        cabecera.setSiguiente(fin);
    }

    public boolean esVacia() {
        return cabecera.getSiguiente() == fin;
    }

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

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    
    
}
