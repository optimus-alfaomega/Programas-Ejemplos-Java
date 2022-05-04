/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.oo;

/**
 *
 * @author vacax
 */
public class ClaseInstancia {

    // Es de instancia.
    String propiedadInstancia;
    //Cuando utilizo static, vuelvo una propiedad de clase.
    static String propiedadClase;
    
    public static void main(String[] args) {
        ClaseInstancia claseInstancia = new ClaseInstancia();
        claseInstancia.propiedadInstancia = "Valor";
        
        ClaseInstancia.propiedadClase = "Valor de Clase";
       
    }
    
    public void metodoInstancia(){
        propiedadInstancia = "valor";
        ClaseInstancia.propiedadClase = "Valor de Clase 1";
    }
    
}
