/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ListaDoblementeEnlazadaCircularIter implements ListaIter {
    
    protected ListaDoblementeEnlazada laLista;
    protected Nodo actual;
    
    public ListaDoblementeEnlazadaCircularIter( ListaDoblementeEnlazada unaLista){
        laLista = unaLista;
        actual = laLista.esVacia() ? unaLista.getCabecera() : unaLista.getCabecera().getSiguiente();
    }
    
    public ListaDoblementeEnlazadaCircularIter(Lista unaLista) throws ClassCastException{
        this((ListaDoblementeEnlazada) unaLista);
    }
    
    public void insertar(Object x){
        if(actual == null){
            try {
                throw new MiExcepcion("Error de inserción");
            } catch (MiExcepcion ex) {
                Logger.getLogger(ListaEnlazadaIter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Nodo nuevo = new Nodo(x, actual, laLista.getCabecera().getSiguiente());
        nuevo.getAnterior().setSiguiente(nuevo);
        nuevo.getSiguiente().setAnterior(nuevo);
        actual = nuevo;
        //laLista.getFin().getAnterior().setSiguiente(actual);
        //actual.setSiguiente(laLista.getCabecera().getSiguiente());
    }

    
    public boolean buscar(Object x) {
        Nodo itr = laLista.getCabecera().getSiguiente();
        while(itr != laLista.getFin() && !itr.getDato().equals(x)){
            itr = itr.getSiguiente();
        }
        if(itr == laLista.getFin()){
            return false;
        }
        actual = itr;
        return true;
    }

    
    public void eliminar(Object x) {
        Nodo itr = laLista.getCabecera();
        while(itr.getSiguiente() != null && !itr.getSiguiente().getDato().equals(x)){
            itr = itr.getSiguiente();
        }
        
        if(itr.getSiguiente() == null){
            try {
                throw new MiExcepcion("Error en eliminación");
            } catch (MiExcepcion ex) {
                Logger.getLogger(ListaEnlazadaIter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        itr.setSiguiente(itr.getSiguiente().getSiguiente());
        actual.getAnterior().setSiguiente(actual.getSiguiente());
        actual.getSiguiente().setAnterior(actual.getAnterior());
        actual = laLista.getCabecera();
        laLista.getFin().getAnterior().setSiguiente(laLista.getCabecera().getSiguiente());
    }

    
    public boolean estaAdentro() {
        return actual != null && actual != laLista.getCabecera();
    }

    
    public Object recuperar() {
        return estaAdentro() ? actual.getDato() : null;
    }

    
    public void cero() {
        actual = laLista.getCabecera();
    }

    
    public void primero() {
        actual = laLista.getCabecera().getSiguiente();
    }

    
    public void avanzar() {
        if(actual != null)
            actual = actual.getSiguiente();
    }
    
    public void retroceder() {
        if(actual != null)
            actual = actual.getAnterior();
    }
    
}
