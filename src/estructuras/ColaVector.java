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
public class ColaVector implements Cola{
    
    private static final int N = 100;
    private int capacidad;
    private Object[] object;
    private int cabeza = 0;
    private int fin = -1;
    private int tamanyoActual = 0;
    
    public ColaVector(){
        this(N);
    }
    
    public ColaVector(int capacidad){
        this.capacidad = capacidad;
        object = new Object[capacidad];
    }
    
    public boolean esVacia(){
        return ( tamanyoActual == 0 );
    }
    
    public void insertar(Object o) throws DesbordamientoInferior{
        if(tamanyoActual == capacidad){
            throw new DesbordamientoInferior("Cola llena");
        }
        fin++;
        object[fin] = o;
        tamanyoActual++;
    }
    
    public void quitarPrimero() throws DesbordamientoInferior{
        if( esVacia() )
            throw new DesbordamientoInferior("Cola vacía");
        tamanyoActual--;
        cabeza++;
    }
    
    public Object primero() throws DesbordamientoInferior{
        if( esVacia() )
            throw new DesbordamientoInferior("Cola vacía");
        //tamanyoActual--;
        return object[cabeza];
    }

    @Override
    public void vaciar() {
        while(!esVacia())
            try {
                this.quitarPrimero();
            } catch (DesbordamientoInferior ex) {
                Logger.getLogger(ColaVector.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    
}
