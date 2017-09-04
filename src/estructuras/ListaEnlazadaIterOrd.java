/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.ComparableNoImplementadaException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ncalumno01
 */
public class ListaEnlazadaIterOrd extends ListaEnlazadaIter {
    
    ListaEnlazada lista;
    
    public ListaEnlazadaIterOrd(ListaEnlazada lista) {
        super(lista);
        this.lista=lista;
    }
    
    
    
    public void insertar(Object obj) {
		if (!Comparable.class.isInstance(obj))
			try {
                            throw new estructuras.ComparableNoImplementadaException("Interfaz comparable no implementada");
                } catch (ComparableNoImplementadaException ex) {
                    Logger.getLogger(ListaEnlazadaIterOrd.class.getName()).log(Level.SEVERE, null, ex);
                }
                else insertar(obj);
    }
    
  
    public void insertar( Comparable x )
    {
        ListaEnlazadaIter prev = new ListaEnlazadaIter(lista);
	ListaEnlazadaIter curr = new ListaEnlazadaIter(lista);
        
        prev.cero();
        curr.primero();

        while( curr.isValid( ) && x.compareTo( curr.recuperar() ) > 0 )
        {
            prev.avanzar();
            curr.avanzar();
        }

        prev.insertar(x);
    }
    
   
           
        
    }
   
   
    
    

    

