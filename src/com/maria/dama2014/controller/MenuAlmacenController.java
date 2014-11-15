/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.controller;

import com.maria.dama2014.view.almacen.proveedor.EditProveedorInterfaz;
import com.maria.dama2014.view.almacen.proveedor.ListProveedoresInterfaz;
import com.maria.dama2014.view.almacen.proveedor.AddProveedorViewText;
import com.maria.dama2014.view.almacen.proveedor.EditProveedorViewText;
import com.maria.dama2014.view.almacen.proveedor.AddProveedorInterfaz;
import com.maria.dama2014.Config;
import com.maria.dama2014.IndexOptions;
import com.maria.dama2014.model.MenuAlmacenModel;
import com.maria.dama2014.view.almacen.MenuAlmacenOptionsEnum;
import com.maria.dama2014.model.MenuVentaModel;
import com.maria.dama2014.model.TicketModel;
import com.maria.dama2014.view.IndexViewText;
import com.maria.dama2014.view.TicketView;
import com.maria.dama2014.view.almacen.*;
import com.maria.dama2014.view.almacen.proveedor.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Maria
 */
public class MenuAlmacenController {

    private MenuAlmacenInterfaz view;
    private MenuAlmacenModel model;

    public MenuAlmacenController(MenuAlmacenInterfaz view, MenuAlmacenModel model) {
        this.view = view;
        this.model = model;
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_PROV.toString())) {
            System.out.println("Pulso añadir proveedor");
            addProveedor();
            view.run();

        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.VIEW_PROV.toString())) {
            System.out.println("Pulso ver proveedores");
            viewProveedores();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.MODIFY_PROV.toString())) {
            System.out.println("Pulso ver proveedores");
            editProveedor();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_FAMILY.toString())) {
            System.out.println("Pulso añadir familia");
            addFamilia();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_GARMENT.toString())) {
            System.out.println("Pulso añadir prenda");
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_MODEL.toString())) {
            System.out.println("Pulso añadir modelo");
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_SIZETYPE.toString())) {
            System.out.println("Pulso devolucion");
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.EXIT.toString())) {
            System.out.println("Pulso salir");
            backToPreviousView();
        } else {
            System.out.println("No te entiendo");
            view.run();
        }
    }

    private void backToPreviousView() {
        view.salir();

        // crear vista de Menu inicial
        IndexViewText indexV = new IndexViewText();
        //controlador
        IndexController indexC = new IndexController(indexV);
        // configurar la vista
        indexV.setController(indexC);
        // arrancar la vista
        indexV.run();
    }

    private void addProveedor() {
        AddProveedorInterfaz addProvView = new AddProveedorViewText();
        // arrancar la vista
        addProvView.run();
    }
    
    private void editProveedor() {
        EditProveedorInterfaz editProvView = 
                (Config.getTextMode() ? new EditProveedorViewText() : new EditProveedorViewPanel());
        
        editProvView.set
        // arrancar la vista
        editProvView.run();
    }

    private void viewProveedores() {
        ListProveedoresInterfaz listProvView = 
                (Config.getTextMode() ? new ListProveedoresViewText() : new ListProveedoresViewPanel());
        
        // arrancar la vista
        listProvView.run(view);
    }


    private void addFamilia() {
        AddFamiliaInterfaz addFamView = new AddFamiliaViewText();
        // arrancar la vista
        addFamView.run();
    }
}
