/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.oo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vacax
 */
public class MainDominicano {

    /**
     * 
     * @param args
     * @throws ParseException 
     * Incluyendo la Excepción de la fecha.
     */
    public static void main(String[] args) throws ParseException {
        //Comentario: Instanciando un objeto...
        Dominicano carlos = new Dominicano();
        carlos.cedula = "031-04128131-0";
        carlos.equipoPelota = "Licey";
        carlos.idioma = "español";
        carlos.nombre = "Carlos Camacho";
        carlos.fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1984");
        //
        Dominicano hilario = new Dominicano();
        hilario.cedula = "0xx-xxxxxx-0";
        hilario.equipoPelota = "Las Aguilas";
        hilario.idioma = "español";
        hilario.nombre = "Prof. Hilario";
        hilario.fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1984");
        
        //Aplicando la referencia del objeto carlos.
        Dominicano otro = carlos;
        System.out.println("Nombre: "+otro.nombre);
        
        //Cambiando la referencia de carlos a hilario.
        otro = hilario;
        System.out.println("Nombre: "+otro.nombre);   
        
        //
        carlos = otro;
        //¿Qué paso con la referencia anterior?.
        //Recolector de basura limpia la memoria no utilizada o referenciada.
        System.out.println("Nombre: "+carlos.nombre);
        //Llamarlo de forma manual.
        System.gc();
        
        Dominicano clariza = new Dominicano("Clariza", "X23234", "20/05/1984");
        System.out.println("Nombre: "+clariza.nombre);
        
        
        
    }
}
