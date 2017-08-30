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
public interface Pila {
    
    public int tamanyo(); 
    public boolean esVacia(); 
    public void apilar( Object o ); 
    public void desapilar() throws DesbordamientoInferior; 
    public Object cima() throws DesbordamientoInferior; 
    
}
