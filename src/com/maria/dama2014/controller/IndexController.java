/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.controller;

import com.maria.dama2014.IndexOptions;
import com.maria.dama2014.model.MenuAlmacenModel;
import com.maria.dama2014.model.MenuVentaModel;
import com.maria.dama2014.view.IndexInterfaz;
import com.maria.dama2014.view.IndexViewText;
import com.maria.dama2014.view.almacen.MenuAlmacenInterfaz;
import com.maria.dama2014.view.almacen.MenuAlmacenViewText;
import com.maria.dama2014.view.venta.MenuVentaInterfaz;
import com.maria.dama2014.view.venta.MenuVentaViewText;
import java.awt.event.ActionEvent;

/**
 *
 * @author Maria
 */
public class IndexController {

    private IndexInterfaz view;

    public IndexController(IndexInterfaz view) {
        this.view = view;
    }

    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().equals(IndexOptions.VENTA.toString())) {
            System.out.println("Estoy en venta");
            startMenuVenta();

        } else if (evento.getActionCommand().equals(IndexOptions.ALMACEN.toString())) {
            System.out.println("Pulso almacen");
            //view.run();
            startMenuAlmacen();
        } else if (evento.getActionCommand().equals(IndexOptions.MENU.toString())) {
            System.out.println("Pulso menu");
            view.run();
        } else if (evento.getActionCommand().equals(IndexOptions.SALIR.toString())) {
            System.out.println("Pulso salir");
            view.salir();
        } else {
            System.out.println("No te entiendo");
            view.run();
        }
    }

    private void startMenuVenta() {
        // crear vista de Menu de venta
        MenuVentaInterfaz ventaV = new MenuVentaViewText();
        
        // modelo
        MenuVentaModel ventaM = new MenuVentaModel();
        MenuVentaController ventaC = new MenuVentaController(ventaV, ventaM);
        // configurar la vista
        ventaV.setController(ventaC);
        // arrancar la vista
        ventaV.run();
    }
    
    private void startMenuAlmacen() {
        // crear vista de Menu de almacen
        MenuAlmacenInterfaz almacenV = new MenuAlmacenViewText();
        
        // modelo
        MenuAlmacenModel almacenM = new MenuAlmacenModel();
        MenuAlmacenController almacenC = new MenuAlmacenController(almacenV, almacenM);
        // configurar la vista
        almacenV.setController(almacenC);
        // arrancar la vista
        almacenV.run();
    }
}
