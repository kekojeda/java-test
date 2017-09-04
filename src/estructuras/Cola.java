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
public interface Cola {
    
    public boolean esVacia(); 
    public void vaciar(); 
    public void insertar(Object o) throws DesbordamientoInferior; 
    public Object primero() throws DesbordamientoInferior; 
    public void quitarPrimero() throws DesbordamientoInferior; 

    
}
