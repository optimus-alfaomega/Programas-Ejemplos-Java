/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase.paisa;

/**
 *
 * @author vacax
 */
public class CiudadanoA implements ITrabajador, ICientifico, IMilitar{
    
    String nombre;

    public CiudadanoA(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println(""+nombre+", trabajando....");
    }

    @Override
    public void pensar() {
        System.out.println(""+nombre+", pensando....");
    }

    @Override
    public void pelear() {
        System.out.println(""+nombre+", peleando....");
    }   
    
    
}
