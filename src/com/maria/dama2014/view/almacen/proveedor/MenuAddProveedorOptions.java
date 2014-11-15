/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.proveedor;

import com.maria.dama2014.util.MyKeyValue;
import java.util.*;

/**
 *
 * @author Maria
 */
public class MenuAddProveedorOptions {
   HashMap<Integer, MyKeyValue> options;

    
    public MenuAddProveedorOptions() {
        this.options = new HashMap();
        options.put(1, new MyKeyValue(MenuAddProveedorOptionsEnum.NAME, "Nombre"));
        options.put(2, new MyKeyValue(MenuAddProveedorOptionsEnum.DIR, "Direccion"));
        options.put(3, new MyKeyValue(MenuAddProveedorOptionsEnum.ZIP, "Codigo Postal"));
        options.put(4, new MyKeyValue(MenuAddProveedorOptionsEnum.LOCALITY, "Localidad"));
        options.put(5, new MyKeyValue(MenuAddProveedorOptionsEnum.PROVINCE, "Provincia"));
        options.put(6, new MyKeyValue(MenuAddProveedorOptionsEnum.TEL, "Telefono"));
        options.put(6, new MyKeyValue(MenuAddProveedorOptionsEnum.MOVIL, "Movil"));
        options.put(6, new MyKeyValue(MenuAddProveedorOptionsEnum.REPR_NAME, "Representante"));
        options.put(6, new MyKeyValue(MenuAddProveedorOptionsEnum.REPR_TEL, "Nombre Representante"));
        options.put(6, new MyKeyValue(MenuAddProveedorOptionsEnum.COMMENTS, "Comentarios"));
        options.put(6, new MyKeyValue(MenuAddProveedorOptionsEnum.DATE_START, "Fecha de alta"));
        
        
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
