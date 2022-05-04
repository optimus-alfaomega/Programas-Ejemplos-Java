package org.ejemplos.stripes;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * 
 */
public class InicioAction extends AccionBase {
    
    @DefaultHandler
    public Resolution mostrarInicio() {
        return new ForwardResolution("/index.jsp");
    }
}
