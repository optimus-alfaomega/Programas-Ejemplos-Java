/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.main;

/**
 *
 * @author vacax
 */
public class Main {
    
    int global=1;
    
    public static void main(String[] args) {
        int local = 1;
        System.out.println("Hola Mundo desde el Netbeans..."); 
        for(String para : args){
            System.out.println("param: "+para);
        }
    }
    
}
