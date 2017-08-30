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
public class PilaVector implements Pila{
    
    private static final int N = 1000; 
    private int capacidad; 
    private Object[] pila; 
    private int cima = -1; 
    
    public PilaVector(){ 
        this(N);
    } 
    
    public PilaVector( int cap ){
       capacidad = cap; 
       pila = new Object[capacidad];  
    } 
    
    public int tamanyo() { 
        return cima + 1;
    } 
 
    public boolean esVacia() { 
        return cima < 0;
    } 

    public Object cima() throws DesbordamientoInferior { 
       if( esVacia() ){
           throw new DesbordamientoInferior("Pila vacía"); 
       } 
       return pila[ cima ];  
    }
    
    public void desapilar(){
        pila[cima] = null;
        cima--;
    } 

    public void apilar(Object o) {
        pila[cima+1] = o;
        cima++;
    }
    
    public Object getElement(int i){
        return pila[i];
    }
    
    
    
}
