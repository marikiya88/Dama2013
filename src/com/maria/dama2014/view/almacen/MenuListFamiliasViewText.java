/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen;

import com.maria.dama2014.db.Categoria;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author Maria
 */
public class MenuListFamiliasViewText extends MenuListFamiliasInterfaz {

    @Override
    public void run(Object parent) {

        List<Categoria> fams = cat.listFamilias();
        
        for (Categoria c : fams){
            System.out.println("\t* " + c.toString());
        }

    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
