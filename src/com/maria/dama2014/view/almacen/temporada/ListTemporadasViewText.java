/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.temporada;

import com.maria.dama2014.db.Temporada;
import java.util.List;

/**
 *
 * @author Maria
 */
public class ListTemporadasViewText extends ListTemporadasInterfaz {

    @Override
    public void run(Object parent) {

        List<Temporada> temps = season.listTemporadas();
        
        for (Temporada t : temps){
            System.out.println("\t* " + t.toString());
        }
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
