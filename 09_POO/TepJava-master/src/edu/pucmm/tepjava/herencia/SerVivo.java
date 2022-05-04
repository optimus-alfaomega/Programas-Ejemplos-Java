/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.herencia;

/**
 *
 * @author vacax
 */
public class SerVivo {
    
    public String nombre;
    
    public void nacer(){
        System.out.println("Nace: "+nombre); 
    }
    
    public void crecer(){
      System.out.println("Crecer: "+nombre);   
    }
    
    public void reproducir(){
      System.out.println("reproducir: "+nombre);   
    }
    
    final public void morir(){
       System.out.println("Morir: "+nombre);  
    }
    
    public void cicloVida(){
        nacer();
        crecer();
        reproducir();
        morir();
    }
    
}
