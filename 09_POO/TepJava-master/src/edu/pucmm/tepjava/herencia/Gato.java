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
public class Gato extends Mamiferos{
    
    //por falta de creatividad, sin propiedades
    
    public Gato(String nombre){
        super.nombre = nombre; //me muevo hacia la clase superior.
    }
    
    public void maullar(){
        System.out.println("Gato "+nombre+" maulla");  
    }
    
}
