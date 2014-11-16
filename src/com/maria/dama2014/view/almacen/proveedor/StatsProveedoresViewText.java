/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.proveedor;

import com.maria.dama2014.model.ProveedorStats;

/**
 *
 * @author Maria
 */
public class StatsProveedoresViewText implements StatsProveedoresInterfaz {

    ProveedorStats prov = new ProveedorStats();

    @Override
    public void run() {

        prov.getFacturacion();
//        ArrayList<ProveedorStats> provs = prov.getFacturacion();
//
//        for (ProveedorStats p : provs){
//            System.out.println("Id: " + p.id +
//                    "Nombre: " + p.nombre +
//                    "Num Modelos: " + p.numModelos +
//                    "Num Prendas: " + p.numPrendas +
//                    "Facturas: " + p.facturas +
//                    "Precio medio: " + p.precioMedio);
            
    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
