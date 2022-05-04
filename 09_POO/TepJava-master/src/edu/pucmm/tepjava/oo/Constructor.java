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
public class Constructor {

    String propiedad1;
    String propiedad2;

    public Constructor(String propiedad1, String propiedad2) {
        this.propiedad1 = propiedad1;
        this.propiedad2 = propiedad2;
    }

    Constructor(String param1) {
        System.out.println("El parametro: " + param1);
    }

    public Constructor() {
        System.out.println("El constructor vacio");
    }

    private Constructor(int entero) {
        System.out.println("Constructor entero: " + entero);
    }

    protected Constructor(long tipolong) {
        System.out.println("Constructor long: " + tipolong);
    }

}
