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
public class ListaDoblementeEnlazadaIterOrd extends ListaDoblementeEnlazadaIter {
    
    ListaDoblementeEnlazada lista;
    
    public ListaDoblementeEnlazadaIterOrd(ListaDoblementeEnlazada lista) {
        super(lista);
        this.lista=lista;
    }
    

   
    public void insertar(Object obj)  {
		if (!Comparable.class.isInstance(obj))
			try {
                            throw new ComparableNoImplementadaException("Interfaz comparable no implementada");
                } catch (ComparableNoImplementadaException ex) {
                    Logger.getLogger(ListaDoblementeEnlazadaIterOrd.class.getName()).log(Level.SEVERE, null, ex);
                }
                else insertar(obj);
    }
    
  
    public void insertar( Comparable x )
    {
        ListaDoblementeEnlazadaIter prev = new ListaDoblementeEnlazadaIter(lista);
	ListaDoblementeEnlazadaIter curr = new ListaDoblementeEnlazadaIter(lista);
        
        prev.cero();
        curr.primero();

        while( (curr.isValid( )) && (curr.recuperar()!=null) && (x.compareTo( curr.recuperar()) ) > 0 )
        {
            prev.avanzar();
            curr.avanzar();
        }

        prev.insertar(x);
    }
    
             
        
    
}
   
   
    
    

    

