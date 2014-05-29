/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen;

import com.maria.dama2014.util.MyKeyValue;
import java.util.*;

/**
 *
 * @author Maria
 */
public class MenuAlmacenOptions {
   HashMap<Integer, MyKeyValue> options;

    public MenuAlmacenOptions() {
        this.options = new HashMap();
        options.put(1, new MyKeyValue(MenuAlmacenOptionsEnum.ADD_PROV, "Nuevo proveedor"));
        options.put(2, new MyKeyValue(MenuAlmacenOptionsEnum.VIEW_PROV, "Ver proveedores"));
        options.put(3, new MyKeyValue(MenuAlmacenOptionsEnum.ADD_FAMILY, "Nueva familia"));
        options.put(4, new MyKeyValue(MenuAlmacenOptionsEnum.ADD_SIZETYPE, "Nuevo tipo de talla"));
        options.put(5, new MyKeyValue(MenuAlmacenOptionsEnum.ADD_MODEL, "Nuevo modelo"));
        options.put(6, new MyKeyValue(MenuAlmacenOptionsEnum.ADD_GARMENT, "Alta prendas"));
        options.put(7, new MyKeyValue(MenuAlmacenOptionsEnum.EXIT, "Salir"));
    }

    public HashMap<Integer, MyKeyValue> getOptions() {
        return options;
    }
    
    
    public Collection<MyKeyValue> getValueOptions(){
        return options.values();
    }
    
     public ArrayList<Integer> getOptionsKeys(){
         SortedSet<Integer> keys = new TreeSet<>(options.keySet());
         return new ArrayList(keys);
    }
    
    
   
   
   
   
}
