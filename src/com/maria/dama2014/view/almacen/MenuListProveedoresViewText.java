/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen;

import com.maria.dama2014.db.Proveedor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author Maria
 */
public class MenuListProveedoresViewText extends MenuListProveedoresInterfaz {

    @Override
    public void run(Object parent) {

        List<Proveedor> provs = prov.listProveedores();
        
        for (Proveedor p : provs){
            System.out.println("\t* " + p.toString());
        }

    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
