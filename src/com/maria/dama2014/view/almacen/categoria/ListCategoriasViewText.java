/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.categoria;

import com.maria.dama2014.db.Categoria;
import java.util.List;

/**
 *
 * @author Maria
 */
public class ListCategoriasViewText extends ListCategoriasInterfaz {

    @Override
    public void run(Object parent) {

        List<Categoria> temps = categ.listCategorias();
        
        for (Categoria t : temps){
            System.out.println("\t* " + t.toString());
        }
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
