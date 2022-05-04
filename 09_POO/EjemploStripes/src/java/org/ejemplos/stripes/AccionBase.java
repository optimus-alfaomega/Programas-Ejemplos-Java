package org.ejemplos.stripes;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * Clase que sera la base de las demas acciones
 * 
 */
public abstract class AccionBase implements ActionBean {

    protected ActionBeanContext contexto;
    
    @Override
    public void setContext(ActionBeanContext abc) {
        contexto = abc;
    }

    @Override
    public ActionBeanContext getContext() {
        return contexto;
    }
    
}
