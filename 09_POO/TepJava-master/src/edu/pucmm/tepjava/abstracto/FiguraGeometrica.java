/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.abstracto;

/**
 *
 * @author vacax
 */
public abstract class FiguraGeometrica {
    
    String nombre;
    
    public FiguraGeometrica(){
        
    }
    
    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double area();
    
    public abstract double perimetro();
    
    public String dimeMiNombre(){
        return nombre;
    }
    
}
