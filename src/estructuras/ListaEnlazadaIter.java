/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumnos
 */
public class ListaEnlazadaIter implements ListaIter {
    
    protected ListaEnlazada laLista;
    protected Nodo actual;
    
    public ListaEnlazadaIter( ListaEnlazada unaLista){
        laLista = unaLista;
        actual = laLista.esVacia() ? unaLista.getCabecera() : unaLista.getCabecera().getSiguiente();
    }
    
    public ListaEnlazadaIter(Lista unaLista) throws ClassCastException{
        this((ListaEnlazada) unaLista);
    }
    
    public void insertar(Object x){
        if(actual == null){
            try {
                throw new MiExcepcion("Error de inserción");
            } catch (MiExcepcion ex) {
                Logger.getLogger(ListaEnlazadaIter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Nodo nuevo = new Nodo(x, actual.getSiguiente());
        actual.setSiguiente(nuevo);
        actual = nuevo;
    }

    
    public boolean buscar(Object x) {
        Nodo itr = laLista.getCabecera().getSiguiente();
        while(itr != null && !itr.getDato().equals(x)){
            itr = itr.getSiguiente();
        }
        if(itr == null){
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
        actual = laLista.getCabecera();
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
    
    public boolean isValid( )
    {
        return actual != null;
    }
    
      //metodo simple de impresion
    public void imprimir(ListaEnlazada unaLista){
        if(laLista.esVacia())
            System.out.print("Lista Vacia");
        else{
            ListaEnlazadaIter itr = new ListaEnlazadaIter(laLista);
            for( ; itr.estaAdentro(); itr.avanzar()){
                System.out.println(itr.recuperar()+ "");
            }
        }
        System.out.println("FIN Impresion Lista");
    }
    
}
