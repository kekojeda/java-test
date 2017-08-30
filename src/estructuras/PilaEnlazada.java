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
public class PilaEnlazada implements Pila{
    
    private Nodo cima;
    private int tamanyo;
    
    public PilaEnlazada(){
        cima = null;
        tamanyo = 0;
    }
    
    public int tamanyo(){
        return tamanyo;
    }
    
    public boolean esVacia(){
        return ( cima == null );
    }
    
    public void apilar(Object o){
        Nodo n = new Nodo(o, cima);
        cima = n;
        tamanyo++;
    }
    
    public Object cima() throws DesbordamientoInferior{
        if( esVacia() ){
            throw new DesbordamientoInferior("Pila vacía");
        }
        return cima.dato;
    }
    
    public void desapilar() throws DesbordamientoInferior{
        if( esVacia() )
            throw new DesbordamientoInferior("Pila vacía");
        Object temp = cima.dato;
        cima = cima.siguiente;
        tamanyo--;
    }

    
}
