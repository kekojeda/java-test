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
public interface ListaIter {
    
    void insertar(Object x);
    boolean buscar(Object x);
    void eliminar(Object x);
    boolean estaAdentro();
    Object recuperar();
    void cero();
    void primero();
    void avanzar();
    
}
