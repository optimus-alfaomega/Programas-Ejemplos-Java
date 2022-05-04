package org.ejemplos.stripes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.DontValidate;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidateNestedProperties;
import org.ejemplos.modelo.Actividad;
import org.ejemplos.modelo.Categoria;
import org.ejemplos.oad.ActividadOad;
import org.ejemplos.oad.CategoriaOad;

/**
 *
 * 
 */
public class ActividadesAction extends AccionBase{
    
    private ActividadOad actOad = new ActividadOad();
    private CategoriaOad catOad = new CategoriaOad();
    
    private List<Actividad> actividades;
    private Map<Long, Categoria> categorias;

    public List<Actividad> getActividades() {
        return actividades;
    }
    
    public Map<Long,Categoria> getMapaCategorias() {
        categorias = new HashMap<Long, Categoria>();
        for (Categoria cat: catOad.getCategorias()) {
            // Se convierte los id's a Long por un problema con las etiquetas usadas en los JSP
            categorias.put(new Long(cat.getId()), cat);
        }
        return categorias;
    }

    @DefaultHandler
    @DontValidate
    public Resolution listarActividades() {
        actividades = actOad.getActividades();
        return new ForwardResolution("/actividades/lista.jsp");
    }
    
    
    @ValidateNestedProperties({
            @Validate(field="descripcion", required=true),
            @Validate(field="plazoEntrega", required=true)
    })
    private Actividad actividad;
    
    public Actividad getActividad() {
        return actividad;
    }
    
    @HandlesEvent("nuevaActividad")
    @DontValidate
    public Resolution formaNuevaActividad() {
        actividad = new Actividad();
        return new ForwardResolution("/actividades/forma.jsp");
    }
    
    @HandlesEvent("crearActividad")
    public Resolution crearActividad() {
        return new RedirectResolution("/Actividades.action");
    }

}
