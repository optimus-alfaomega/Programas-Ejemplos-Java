/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.punto8;

/**
 *
 * @author vacax
 */
public class MainBombilla {

    public static void main(String[] args) {
        //Instanciando...
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();
        //
        System.out.println("Accionado el interruptor en b1, b2,b3");
        b1.interruptor(); //por defecto el tipo boolean es falso, cambia a verdadero.
        b2.interruptor();
        b3.interruptor();
        //
        System.out.println("Estado Bombilla #1: "+b1.isEstado());
        System.out.println("Estado Bombilla #2: "+b2.isEstado());
        System.out.println("Estado Bombilla #3: "+b3.isEstado());
        //
        System.out.println("Accionado el interruptor en b1 y b3");
        b1.interruptor();
        b3.interruptor();
        //
        System.out.println("Estado Bombilla #1: "+b1.isEstado());
        System.out.println("Estado Bombilla #2: "+b2.isEstado());
        System.out.println("Estado Bombilla #3: "+b3.isEstado());
        //
        System.out.println("Accionado el interruptor en b1 y b3");
        b1.interruptor();
        b3.interruptor();
        //
        System.out.println("Estado Bombilla #1: "+b1.isEstado()); //encendida
        System.out.println("Estado Bombilla #2: "+b2.isEstado()); //encendida
        System.out.println("Estado Bombilla #3: "+b3.isEstado()); //encendida
        //
        System.out.println("Accionando el Breaker.");
        b2.accionarBreaker(); //es de instancia, no resuelve el problema.
        //
        System.out.println("Estado Bombilla #1: "+b1.isEstado()); // true
        System.out.println("Estado Bombilla #2: "+b2.isEstado());  //falso.
        System.out.println("Estado Bombilla #3: "+b3.isEstado()); //true
        
        //
        b2.accionarBreaker();
        
        //
        System.out.println("Accionando el super breaker");
        b1.accionarSuperBreaker(); // desde la instancia el metodo estatico, no es lo correcto.
        
        //
        System.out.println("Estado Bombilla #1: "+b1.isEstado()); 
        System.out.println("Estado Bombilla #2: "+b2.isEstado()); 
        System.out.println("Estado Bombilla #3: "+b3.isEstado()); 
        
        //
        System.out.println("Accionando el super breaker");
        Bombilla.accionarSuperBreaker(); //forma correcta, mediente la clase.
        System.out.println("Estado Bombilla #1: "+b1.isEstado()); 
        System.out.println("Estado Bombilla #2: "+b2.isEstado()); 
        System.out.println("Estado Bombilla #3: "+b3.isEstado()); 
        
    }

}
