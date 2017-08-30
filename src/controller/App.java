package controller;

import estructuras.ListaDoblementeEnlazada;
import estructuras.ListaDoblementeEnlazadaIterOrd;
import estructuras.ListaEnlazada;
import estructuras.ListaEnlazadaIter;
import estructuras.ListaEnlazadaIterOrd;
import estructuras.MiExcepcion;
import Estructuras.Validacion;
import View.Menu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import model.Actividad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sergio.ojeda
 */
public class App {

    
    
//    ListaEnlazada lista = new ListaEnlazada();
//    ListaEnlazadaIter listaIter = new ListaEnlazadaIter(lista); 
//    ListaEnlazadaIterOrd listaOrd = new ListaEnlazadaIterOrd(lista);
//    
//    public static void setActividades(Actividad al){
//        listaIter.insertar(al);
//    }
    
    static Vector<Actividad> arrayActividades = new Vector<Actividad>();
        
    static Scanner scanNum = new Scanner(System.in);
    static Scanner scanString = new Scanner(System.in);
    
        public static void setActividades(Actividad al){
        arrayActividades.add(al);
        }
        
        public static void listaActividades(){
         for(int i=0; i<arrayActividades.size();i++){
             System.out.println(arrayActividades.get(i));
         }
     }
        public static void vaciasActividades(){
            arrayActividades.clear();
        }
    
        public static void ingresarActividad() throws MiExcepcion{
         
       try {  
       System.out.print("Ingrese Codigo de la Actividad: \n");
       String codigo = scanString.nextLine();  
           
       System.out.print("Ingrese NOMBRE e la Actividad: \n");
       String nombre = scanString.nextLine();
       
       System.out.print("Ingrese dependencias de la Actividad: \n");
       String dependencias = scanString.nextLine();
       
       int duracionDias=Validacion.validarEntero("Ingrese Duracion en dias: ");
       
       Actividad act = new Actividad(codigo, nombre, dependencias, duracionDias);
             
       App.setActividades(act);
       }
       catch(Exception e){
			
			System.out.println("Error en el ingreso de la Actividad, ingresela nuevamente");
		}
     }

    public static void cargarCsv(){
        String csvFile = "C:\\Users\\sergio.ojeda\\Desktop\\csv\\CPM-CableadoEstructurado.csv";
        BufferedReader br = null;
        String line = "";
       
        //Se define separador ","
        String cvsSplitBy = ";";
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();//para que saltee la 1 linea de los titulos
            while ((line = br.readLine()) != null){
                String[] datos = line.split(cvsSplitBy);
                //crea la actividad
                String codigo = datos[0];
                String nombre = datos[1];
                String dependencias = datos[2];
                int duracionDias = Integer.parseInt(datos[3]);
                
                Actividad act = new Actividad(codigo, nombre, dependencias, duracionDias);
                setActividades(act);
                       
                

               // System.out.println(act);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) throws MiExcepcion {
        // TODO code application logic here
        Menu.menu();
    }
    
}
