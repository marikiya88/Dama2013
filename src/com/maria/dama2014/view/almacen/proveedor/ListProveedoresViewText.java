/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.proveedor;

import com.maria.dama2014.db.Proveedor;
import java.util.List;

/**
 *
 * @author Maria
 */
public class ListProveedoresViewText extends ListProveedoresInterfaz {

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
