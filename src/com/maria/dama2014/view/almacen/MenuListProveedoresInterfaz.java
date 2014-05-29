/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen;

import com.maria.dama2014.controller.MenuAlmacenController;
import com.maria.dama2014.db.Proveedor;

/**
 *
 * @author Maria
 */
public class MenuListProveedoresInterfaz extends javax.swing.JPanel{
    
    Proveedor prov;

    public MenuListProveedoresInterfaz() {
        prov = new Proveedor();
    }
    
    
    public void run(Object parent){}

    //public void setController(MenuAlmacenController controller);

    public void salir(){}
    
}
