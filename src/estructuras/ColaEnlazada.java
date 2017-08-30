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
public class ColaEnlazada implements Cola{
    
    Nodo cabecera; 
    Nodo fin; 
      
  
    public boolean esVacia() {   
        return cabecera==null; 
    } 
  
      
    public void vaciar() { 
        cabecera = fin = null; 
    } 

    @Override
    public void insertar(Object o) {
        if (esVacia()) fin = cabecera = new Nodo(o); 
        else { 
            //fin=fin.setSiguiente(new NodoLista(o)) 
            // Creo un nuevo nodo. 
            Nodo aux = new Nodo(o); 
            fin.setSiguiente(aux); 
            fin = fin.getSiguiente(); 
          
        }
    }

    @Override
    public Object primero() throws DesbordamientoInferior {
        if (esVacia()) throw new DesbordamientoInferior("Cola Vacia"); 
        return cabecera.getDato(); 
    }

    @Override
    public void quitarPrimero() throws DesbordamientoInferior {
        if (esVacia()) throw new DesbordamientoInferior("Cola Vacia"); 
        Object valorDevolver = cabecera.getDato(); 
        cabecera = cabecera.getSiguiente();
    }
      
  
    
}
