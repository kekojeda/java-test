/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.App;
import estructuras.MiExcepcion;
import java.util.Scanner;

/**
 *
 * @author sergio.ojeda
 */
public class Menu {
    
    static Scanner scan = new Scanner(System.in);
    
    
    public static void menu() throws MiExcepcion{
        int opcion;
        boolean flag = true;
        
        do {
            imprimirMenu();
            opcion = scan.nextInt();
            
            switch (opcion){
                case 1:App.cargarCsv();
                break;
                case 2:App.vaciasActividades();
                break;
                case 3: App.ingresarActividad();
                break;
                case 4: App.listaActividades();
                break;
                case 5:// App.();
                break;
                case 9: flag=false;
            }
        } while (flag);
    }

    
    
    
    private static void imprimirMenu() {
        System.out.println("\nMenu ");
			System.out.println("1) Inicializar y Cargar archivo de entradade tabla de actividades   \n");
			System.out.println("2) Vaciar Tabla de Actividades  \n");
			System.out.println("3) Cargar Actividad manual \n");
                        System.out.println("4) Listar Actividades  \n");
			System.out.println("4) Generar Grafo y mostrar Matriz de Adyacencia  \n");
                        System.out.println("5) Mostrar camino critico  \n");
			System.out.println("9) Salir  \n");
    }
    
}
