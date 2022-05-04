/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pucmm.tepjava.main;

import edu.pucmm.tepjava.oo.ModificadoresAcceso;

/**
 *
 * @author vacax
 */
public class ModificarAcceso3 extends ModificadoresAcceso{
    
    public ModificarAcceso3(){
        protegido = "";//acceso a la propiedad protegida.
        metodoProtegido();
    }
}
