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
public final class Perro extends Mamiferos{ //no puedo heredar de la clase Perro
    
    public void ladrar(){
        System.out.println("Perro "+nombre+", ladrando...");
    }
}
