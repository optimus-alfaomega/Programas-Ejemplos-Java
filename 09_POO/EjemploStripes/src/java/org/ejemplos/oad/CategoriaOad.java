package org.ejemplos.oad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.ejemplos.modelo.Categoria;

/**
 * Objeto de acceso a datos para la clase Categoria.
 * Por el momento utiliza objetos simulados
 * 
 */
public class CategoriaOad {
    
    // Se utiliza un Map pues simula mejor la relacion de una entidad y su llave primaria 
    // dentro de una base de datos relacional.
    private static Map<Integer,Categoria> categorias;
    
    static {
        categorias = new HashMap<Integer, Categoria>();
        categorias.put(1, new Categoria(1,"Tareas"));
        categorias.put(2, new Categoria(2,"Proyecto"));
        categorias.put(3, new Categoria(3,"Tesis"));
    }
    
    public List<Categoria> getCategorias() {
        return new ArrayList<Categoria>(categorias.values());
    }
}
