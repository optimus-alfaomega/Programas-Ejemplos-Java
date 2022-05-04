/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.excepciones;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author vacax
 */
public class MainExcepciones {

    public static void main(String[] args) {
        int dividendo = 12;
        int divisor = 0;
        if (divisor != 0) {
            double division = dividendo / divisor;
            System.out.println("el resulado es: " + division);
        }
        
        try {
            seguirDelegandoLaExcepcion();
        } catch (FileNotFoundException ex) {
            System.out.println("Error leyendo el archivo...");
            Logger.getLogger(MainExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            pruebaMiExcepcion(10);
        } catch (MiExcepcion ex) {
            Logger.getLogger(MainExcepciones.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            //siempre se ejecuta...
        }
        
        
        
    }
    
    public static void seguirDelegandoLaExcepcion() throws FileNotFoundException {
        excepcionVerificada();
    }
    
    public static void excepcionVerificada() throws FileNotFoundException{
        FileInputStream filein=new FileInputStream("ruta..");
    }
    
    public static void pruebaMiExcepcion(int entero) throws MiExcepcion{
        if(entero == 10){
            throw new MiExcepcion("Entero igual a 10, no puede ser....");
        }
        System.out.println("Se ejecuto el metodo sin problema....");
    }
}
