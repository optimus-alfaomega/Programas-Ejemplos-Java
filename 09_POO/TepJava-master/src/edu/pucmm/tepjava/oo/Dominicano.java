/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.oo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author vacax
 */
public class Dominicano {
    
    //Propiedades
    public String idioma;
    public String nombre;
    public String cedula;
    public String equipoPelota;
    public Date fechaNacimiento;
    
    public Dominicano(){
        
    }
    
    public Dominicano(String nombre, String suCedula, String fechaNacimiento){
        this.nombre = nombre;
        cedula = suCedula;
        try {
            this.fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
        } catch (ParseException ex) {
            Logger.getLogger(Dominicano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodos.
    public void jugarDomino(){
        System.out.println("");
    }
    
    public void bailarBachata(){
        System.out.println("");
    }
    
    public void comerPuercoAlaPuya(){
        System.out.println("");
    }
    
}
