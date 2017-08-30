package estructuras;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ListaDoblementeEnlazadaIter implements ListaIter {
    
    protected ListaDoblementeEnlazada laLista;
    protected Nodo actual;
    protected int tamano;
    
    public ListaDoblementeEnlazadaIter( ListaDoblementeEnlazada unaLista){
        laLista = unaLista;
        actual = laLista.esVacia() ? unaLista.getCabecera() : unaLista.getCabecera().getSiguiente();
    }
    
    public ListaDoblementeEnlazadaIter(Lista unaLista) throws ClassCastException{
        this((ListaDoblementeEnlazada) unaLista);
    }
    
    
    public void insertar(Object x){
        if(actual == null){
            try {
                throw new MiExcepcion("Error de inserción");
            } catch (MiExcepcion ex) {
                Logger.getLogger(ListaDoblementeEnlazadaIter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Nodo nuevo = new Nodo(x, actual, actual.getSiguiente());
        nuevo.getAnterior().setSiguiente(nuevo);
        nuevo.getSiguiente().setAnterior(nuevo);
        actual = nuevo;
        tamano++;
    }
    
    /*public void insertarOrd(Object x){
        ListaDoblementeEnlazadaIter ant = new ListaDoblementeEnlazadaIter(laLista);
        ListaDoblementeEnlazadaIter act = new ListaDoblementeEnlazadaIter(laLista);
        
        ant.cero();
        act.primero();
        while(act.estaAdentro() && ((Comparable)(act.recuperar().toString())).compareTo(x.toString())){
            act.avanzar();
            ant.avanzar();
        }
        ant.insertar(x);
        actual = ant.actual;
    }*/
    
    public void insertarAsc(Object x){
        ListaDoblementeEnlazadaIter ant = new ListaDoblementeEnlazadaIter(laLista);
        ListaDoblementeEnlazadaIter act = new ListaDoblementeEnlazadaIter(laLista);
        
        ant.cero();
        act.primero();
        while(act.estaAdentro() && act.recuperar().toString().compareToIgnoreCase(x.toString()) < 0){
            act.avanzar();
            ant.avanzar();
        }
        ant.insertar(x);
        actual = ant.actual;
    }
    
    public void insertarDesc(Object x){
        ListaDoblementeEnlazadaIter ant = new ListaDoblementeEnlazadaIter(laLista);
        ListaDoblementeEnlazadaIter act = new ListaDoblementeEnlazadaIter(laLista);
        
        ant.cero();
        act.primero();
        while(act.estaAdentro() && act.recuperar().toString().compareToIgnoreCase(x.toString()) > 0){
            act.avanzar();
            ant.avanzar();
        }
        ant.insertar(x);
        actual = ant.actual;
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
                throw new MiExcepcion("Error de inserción");
            } catch (MiExcepcion ex) {
                Logger.getLogger(ListaDoblementeEnlazadaIter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        itr.setSiguiente(itr.getSiguiente().getSiguiente());
        actual.getAnterior().setSiguiente(actual.getSiguiente());
        actual.getSiguiente().setAnterior(actual.getAnterior());
        actual = laLista.getCabecera();
        tamano--;
    }
    
        
    //metodo simple de impresion
    public void imprimir(ListaDoblementeEnlazada unaLista){
        if(laLista.esVacia())
            System.out.print("Lista Vacia");
        else{
            ListaDoblementeEnlazadaIter itr = new ListaDoblementeEnlazadaIter(laLista);
            for( ; itr.estaAdentro(); itr.avanzar()){
                System.out.print(itr.recuperar()+ "");
            }
        }
        System.out.println("FIN DEL CLIENTE");
    }

    public boolean isValid( )
    {
        return actual != null;
    }

    
    public boolean estaAdentro() {
        return actual != null && actual != laLista.getCabecera() && actual != laLista.getFin();
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
