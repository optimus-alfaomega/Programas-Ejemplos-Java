package org.ejemplos.oad;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.ejemplos.modelo.Actividad;


public class ActividadOad {

    // Se utiliza un Map pues simula mejor la relacion de una entidad y su llave primaria 
    // dentro de una base de datos relacional.    
    private static Map<Integer, Actividad> actividades;
    
    static {
        actividades = new HashMap<Integer,Actividad>();
        actividades.put(1, new Actividad(1, "Reescribir capítulo 3", new Date(111, 8, 30), 3));
        actividades.put(2, new Actividad(2, "Resolver ejercicios de Estadística", new Date(111, 9, 1), 1));
    }
    
    public List<Actividad> getActividades() {
        return new ArrayList<Actividad>(actividades.values());
    }
}
