/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Validacion {
    
    private static Scanner scanNum=new Scanner(System.in);
    private static Scanner scanString=new Scanner(System.in);
    
     
    public static void comprobarString(String cadena, String valor ) throws MiExcepcion{
		
        if (cadena==null || cadena.trim().equals("")) {
            String mensaje = "";
            switch(valor){
                case "nombre":
                    mensaje = "Debe ingresar nombre";
                    break;
                case "legajo":
                    mensaje = "Debe ingresar su legajo";
                    break;
                case "denominacion":
                    mensaje = "Denominación de materia inválido";
                    break;
            }
            throw new MiExcepcion(mensaje);
        }
    }
    
    public static void comprobarEsVacioS(String cadena) throws MiExcepcion{
		
        if (cadena.equals("")) {
            String mensaje = "Debe ingresar su direccion";
            throw new MiExcepcion(mensaje);
        }
    }
    
    
    public static void comprobarNombrePropio(String cadena, String valor) throws MiExcepcion{
        
        if(cadena == null || cadena.trim().equals("") || contieneDigito(cadena)){
            String mensaje = "";
            switch(valor){
                case "nombre":
                    mensaje = "Debe ingresar su nombre";
                    break;
                case "apellido":
                    mensaje = "Debe ingresar su apellido";
                    break;
            }
            throw new MiExcepcion(mensaje);
        }
    }
    
    public static boolean contieneDigito(String cadena){  
        boolean containsDigit = false;

        if(cadena != null && !cadena.isEmpty()){
            for(char c : cadena.toCharArray()){
                if(containsDigit = Character.isDigit(c)){
                    containsDigit = true;
                    break;
                }
            }
        }

        return containsDigit;
    }
    
    public static boolean comprobarCodigo(int entero, String valor) throws MiExcepcion{
        if(entero == (int) entero && entero != 0){
            return true;
        }
        else{
           String mensaje = "";
           switch(valor){
               case "dni":
                   mensaje = "DNI inválido";
                   break;
               case "codigo":
                   mensaje = "Código de materia inválido";
                   break;
               case "semestre":
                   mensaje = "Código de semestre inválido";
                   break;
           }
           throw new MiExcepcion(mensaje); 
        }
    }
    
    public static boolean esNumerico(String cadena){
        try{
            Double d = Double.parseDouble(cadena);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    public static int validarEntero(String mensaje){
			
		try {
			if (mensaje.equals("")==false){ 
				System.out.println(mensaje); 
			}
			
			int numero=Integer.parseInt(scanNum.next());
			
			return numero;
			
		} catch (NumberFormatException nfe) {
			System.out.println("Ingrese solo numeros enteros");
			return validarEntero(mensaje);
			
		}
	}
 
 
	 public static String validarString(String mensaje){
			
			try {
				
				if (mensaje.equals("")==false){ 
					System.out.println(mensaje); 
				}
				
				String cadena = scanString.nextLine();						
				return cadena;
				
			} catch (NumberFormatException nfe) {
				System.out.println("Error en cadena de texto");
				return validarString(mensaje);
				
			}
		}
	
	
	 public static double validarDouble(String mensaje){
			
			try {
				if (mensaje.equals("")==false){ 
					System.out.println(mensaje); 
				}
				
				Double numero=Double.parseDouble(scanNum.next());
				
				return numero;
				
			} catch (NumberFormatException nfe) {
				System.out.println("Ingrese solo numeros double");
				return validarDouble(mensaje);
				
			}
		}
    
    
    
}
