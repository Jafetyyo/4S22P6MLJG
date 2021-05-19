/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4s22p6mljg;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jafet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        lista.forEach(contenido ->{
            System.out.println("El valor contenido es " + contenido);
        });
        lista.add("G");
        lista.add("H");
        
        System.out.println("\n Segunda Forma de trabajar recorridos de listas \n");
        
        for(String contenido1 : lista){
            System.out.println("El valor contenido es " + contenido1);
        } 
        lista.add("Jafet");
        lista.add("Esta es una linea muy larga");
        lista.add("Martinez");
        lista.add("Segunda linea muy larga sin problema de almacenamiento");
        
        System.out.println("\n Tercer Forma de trabajar recorridos de listas \n");
        
        lista.stream().forEach(contenido2 -> {
        System.out.println("El valor contenido es " + contenido2);
        
        });
    }
}
