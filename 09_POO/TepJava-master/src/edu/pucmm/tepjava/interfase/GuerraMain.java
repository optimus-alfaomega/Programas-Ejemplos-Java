/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.interfase;

import edu.pucmm.tepjava.interfase.paisa.CiudadanoA;
import edu.pucmm.tepjava.interfase.paisa.IMilitar;
import edu.pucmm.tepjava.interfase.paisb.Cientifico;
import edu.pucmm.tepjava.interfase.paisb.Militar;
import edu.pucmm.tepjava.interfase.paisb.Trabajador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vacax
 */
public class GuerraMain {

    public static void main(String[] args) {
        
        //Pais B
        Militar militarB = new Militar("Militar B");
        Cientifico cientificoB = new Cientifico("Cientifico B");
        Trabajador trabajadorB = new Trabajador("Trabajo B");
        
        //Pais A
        CiudadanoA ciudadanoA1=new CiudadanoA("Ciudadano 1");
        CiudadanoA ciudadanoA2=new CiudadanoA("Ciudadano 2");
        CiudadanoA ciudadanoA3=new CiudadanoA("Ciudadano 3");
        
        //guerra.
        List<Militar> listaMilitarPaisB = new ArrayList<>();
        listaMilitarPaisB.add(militarB); //incluyendo en al colección...
        //listaMilitarPaisB.add(cientificoB);
        
        List<IMilitar> listaMilitarPaisA = new ArrayList<>();
        listaMilitarPaisA.add(ciudadanoA1); //Polimorfismo...
        listaMilitarPaisA.add(ciudadanoA2);
        listaMilitarPaisA.add(ciudadanoA3);
        
        peleaMilitares(listaMilitarPaisA, listaMilitarPaisB);
        
    }
    
    /**
     * 
     * @param listaMilitarPaisA
     * @param listaMilitarPaisB 
     */
    public static void peleaMilitares(List<IMilitar> listaMilitarPaisA,
            List<Militar> listaMilitarPaisB){
        
        System.out.println("Guerra entre País A y País B");
        int militaresA = listaMilitarPaisA.size();
        int militaresB = listaMilitarPaisB.size();
        System.out.println("La cantidad de militares en A: "+militaresA);
        for(IMilitar iMilitar : listaMilitarPaisA){
            iMilitar.pelear();
        }
        
        System.out.println("La cantidad de militares en B: "+militaresB);
        for(Militar militar : listaMilitarPaisB){
            militar.pelear();
        }
        
        if(militaresA > militaresB){
            System.out.println("Gano País A");
        }else if(militaresA == militaresB){
            System.out.println("Empate...");
        } else{
            System.out.println("Gano País B");
        }
    }

}
