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
public class Mamiferos extends SerVivo{
    
    boolean sangreCaliente;
    int cantidadHuesos;
    
    
    public void tomarLeche(){
        System.out.println("Tomar leche"); 
    }
    
    public void darALuz(){
        System.out.println("Dando a Luz");
    }
    
    @Override
    public void crecer(){
        //cambio nuevo..
        System.out.println("Debo comer...: "+nombre);
        System.out.println("Debo Dormir: "+nombre);
        System.out.println("Debo tomar agua: "+nombre);
        //quiero llamar la funcionalidad anterior. (opcional)
        super.crecer(); //llamando al metodo del padre...
        
    }
    
    //No puede ser sobre-escrito, tiene final en el metodo.
//    public void morir(){
//        
//    }
    
}
