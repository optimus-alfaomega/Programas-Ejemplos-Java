/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.abstracto;

import edu.pucmm.tepjava.oo.VariablesConstantes;

/**
 *
 * @author vacax
 */
public  class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(double radio) {
        nombre = "Circulo";
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return VariablesConstantes.PI*Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2*VariablesConstantes.PI*radio*radio;
    }


    
}
