/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.herencia;

/**
 *
 * @author vacax
 */
public class MainHerencia {

    public static void main(String[] args) {
        Gato gato = new Gato("Felix Gato");
        Perro perro = new Perro();
        perro.nombre = "Pedro el Perro";

        //gato.
        gato.maullar();

        //perro
        perro.ladrar();

        //
        ejecutarCicloDeVida(perro);
        ejecutarCicloDeVida(gato);

    }

    public static void ejecutarCicloDeVida(SerVivo serVivo) {
        serVivo.cicloVida();
    }

}
