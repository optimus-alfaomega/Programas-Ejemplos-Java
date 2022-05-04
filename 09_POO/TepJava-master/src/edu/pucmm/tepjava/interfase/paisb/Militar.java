/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase.paisb;

/**
 *
 * @author vacax
 */
public class Militar {
    String nombre;

    public Militar(String nombre) {
        this.nombre = nombre;
    }
    
    public void pelear(){
        System.out.println(""+nombre+", peleando...");
    }
}
