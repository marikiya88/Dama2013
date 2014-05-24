/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.model;

import com.maria.dama2014.MenuVentaOptions;
import java.util.HashMap;

/**
 *
 * @author Maria
 */
public class MenuVentaModel {
   
    private HashMap<MenuVentaOptions, String> actions = new HashMap<MenuVentaOptions, String>();
    
    public MenuVentaModel(){
        actions.put(MenuVentaOptions.START_TICKET, "F1 - Iniciar Ticket");
        actions.put(MenuVentaOptions.RESUME_TICKET, "F2 - Retomar ticket aparcado");
        actions.put(MenuVentaOptions.ALMACEN, "F3 - Consultar almacén");
        actions.put(MenuVentaOptions.DEVOLUCION, "F4 - Devolucion");
        actions.put(MenuVentaOptions.APARTADO,  "F5 - Recoger apartado");
        actions.put(MenuVentaOptions.MODISTA, "F6 - Recoger modista"); 
        actions.put(MenuVentaOptions.SALIR, "F7 - Volver"); 
    }
    
    
}


