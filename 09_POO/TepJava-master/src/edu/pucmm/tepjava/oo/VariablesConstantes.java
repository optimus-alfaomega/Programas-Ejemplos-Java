/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.oo;

import edu.pucmm.tepjava.punto8.Bombilla;

/**
 *
 * @author vacax
 */
public class VariablesConstantes {
    
    //Como una constante valor primitivo(int, long, double, short...),
    //no puedo cambiar el valor.
    public static final double PI = 3.1416; //final, es una constante.
    
    //Aplico el final a un objeto no puedo cambiar su referencia.
    final Bombilla bombilla; // = new Bombilla();
    Bombilla otraBombilla = new Bombilla();
    
    public  VariablesConstantes(){
        bombilla = new Bombilla(); // debo de instanciar el objeto..
    }
    
    public static void main(String[] args) {
        System.out.println("El valor de PI: "+PI);
        //PI = 12.123; //no compila, no puedo cambiar el valor.
        //
        VariablesConstantes va =new VariablesConstantes();
        System.out.println("El estado de la bombilla: "+va.bombilla.isEstado());
        va.bombilla.interruptor();
        System.out.println("El estado de la bombilla: "+va.bombilla.isEstado());        
        //va.bombilla = new Bombilla(); // no compila, no estoy cambiando la referencia.
        
        System.out.println("El estado de la bombilla: "+va.otraBombilla.isEstado());
        va.otraBombilla = new Bombilla(); //cambiando la refencia, no es final.
        
       //
       va.corridaReferencia();
    }
    
    public void corridaReferencia(){
         //va.bombilla = va.otraBombilla; // no puedo cambiar la referencia.
        Dominicano dominicano = new Dominicano("Carlos camacho", "031-123123", "20/05/1984");
        metodoPorRefencia(dominicano);
        System.out.println("El equipo de pelota: "+dominicano.equipoPelota); 
        metodoPorRefencia2(dominicano);
        System.out.printf("El nombre %s tiene equipo %s \n", dominicano.nombre, dominicano.equipoPelota);
    }
    
    /**
     * Los objetos se pasan por referencia.
     * @param dominicano 
     */
    public static void metodoPorRefencia(Dominicano dominicano){
        System.out.println("El nombre: "+dominicano.nombre);
        dominicano.equipoPelota = "Licey"; //los cambios afectan al objeto original...
        dominicano.idioma = "Español";        
    }
    
    
    public void metodoPorRefencia2( Dominicano dominicano){
        Dominicano otro = new Dominicano();
        System.out.println("El nombre: "+otro.nombre);
        otro.equipoPelota = "Otro Equipo"; //los cambios afectan al objeto original...
        otro.idioma = "Otro Idioma";    
        dominicano = otro;
    }
    
}
