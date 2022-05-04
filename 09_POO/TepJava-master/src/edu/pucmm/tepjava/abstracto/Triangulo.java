/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.abstracto;

/**
 *
 * @author vacax
 */
public class Triangulo extends FiguraGeometrica{
 
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        nombre = "Triangulo";
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
       return base*altura/2; 
    }

    @Override
    public double perimetro() {
        return 0;
    }
    
    
    
}
