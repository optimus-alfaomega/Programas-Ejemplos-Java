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
public class Bombilla {
    
    private boolean estado;
    private boolean breaker = true;
    private static boolean superBreaker = true;
    
    /**
     * Metodo para conocer el estado de la bombilla.
     * @return 
     */
    public boolean isEstado(){
        return estado && breaker && superBreaker;
    }
    
    public void interruptor(){
        estado=!estado;
    }
    
    public void accionarBreaker(){
        breaker = !breaker;
    }
    
    public static void accionarSuperBreaker(){
        superBreaker=!superBreaker;
    }
    
}
