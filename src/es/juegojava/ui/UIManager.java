/**
 * 
 */
package es.juegojava.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


import es.juegojava.common.Element;
import es.juegojava.mapa.Item;
import es.juegojava.mapa.Room;

/**
 * @author pablo.fernandez
 *
 */

public class UIManager {
	
	static PrintWriter pw = null;
	static Scanner sc = null;	
	static File archivo = null;
    static FileReader fr = null;
    static BufferedReader br = null;

	public UIManager() {
		super();
		pw = new PrintWriter(System.out, true);
		sc = new Scanner(System.in);
	}
	
	public static void destruirUI(){
		pw.flush();
		pw.close();
		sc.close();
	}
	
	public static void imprimirPorPantalla(String salida){
		pw.println(salida);	
	}
	
	public static void imprimirPorPantalla(int salida){
		PrintWriter pw = new PrintWriter(System.out, true);
		String cadena = "";
		cadena += salida;
		pw.println(cadena);
	}
	
	public static int leerNumeroTeclado(){
		int salida = -1;
		try{
			salida = sc.nextInt();
		}catch(InputMismatchException e){
			imprimirPorPantalla("El valor introducido no es un entero");
			sc.nextLine();
		}
		return salida;
	}
	
	public static String leerCadenaTeclado(){
		String salida = "";
		
		try{
			salida = sc.nextLine();
		}catch(InputMismatchException e){
			imprimirPorPantalla("El valor introducido no es una cadena");
			sc.nextLine();
		}
		return salida;
	}
	
	public static ArrayList<String> leerFichero(String path){
		ArrayList<String> salida = new ArrayList<String>();
		
		try {
			archivo = new File(path);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea;
			while((linea=br.readLine())!=null)
				salida.add(linea);
		  	}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}	
		}
		return salida;
	}
	
	
	
	
	
	
	
	
	
	
	
	public void descripcion(Element elementoADescribir){
		//Descripcion generica de cualquier elemento
		//imprimimos el toString
		//To-do
	}
		
	
	public void describirHabitacion(Room habitacionADescribir){
		//To-do
		
		/*
		String roomPath = "Room" + habitacionADescribir.getId() + "Desc.txt";

		String descFichero = "";
		descFichero = leerFichero(roomPath).toString();
		String aspecto = "";
		String token = "####";
		String nombreHabitacion = habitacionADescribir.getNombre();
		aspecto = descFichero.replace(token, nombreHabitacion);
		aspecto += "\nEn la habitacion hay...\n";
		
		String contenidoHabitacion = "";
		contenidoHabitacion = habitacionADescribir.getNombre();
		*/
	}
	
	public void imprimirMenuAcciones(){
		//To-do
	}
	
	
	
	public void describirItem(Item itemADescribir){
		//To-do
	}
}
