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
public class MainAbstracto {
    
    public static void main(String[] args) {
        Triangulo triangulo=new Triangulo(20, 12);
        
        final double lado = 20;
        //Declaracion anonima de una clase...         
        FiguraGeometrica cuadrado = new FiguraGeometrica("Cuadrado") {                        
            
            @Override
            public double area() {
                return lado*lado;
            }

            @Override
            public double perimetro() {
                return lado*4;
            }           
           
        };
        
        Circulo circulo = new Circulo(3);
        
       
        mostrarDatosFigurGeometrica(triangulo);
        mostrarDatosFigurGeometrica(cuadrado);
        mostrarDatosFigurGeometrica(circulo);
        
    }
    
    public static void mostrarDatosFigurGeometrica(FiguraGeometrica figuraGeometrica){
        System.out.printf("El area de la figura geometrica %s  = %f \n",
                figuraGeometrica.nombre, figuraGeometrica.area());
    }
}
