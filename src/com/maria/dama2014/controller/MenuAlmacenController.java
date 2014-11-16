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
import com.maria.dama2014.model.MenuAlmacenModel;
import com.maria.dama2014.view.almacen.MenuAlmacenOptionsEnum;
import com.maria.dama2014.view.IndexViewText;
import com.maria.dama2014.view.almacen.*;
import com.maria.dama2014.view.almacen.categoria.AddCategoriaInterfaz;
import com.maria.dama2014.view.almacen.categoria.AddCategoriaViewText;
import com.maria.dama2014.view.almacen.categoria.ListCategoriasInterfaz;
import com.maria.dama2014.view.almacen.categoria.ListCategoriasViewText;
import com.maria.dama2014.view.almacen.consulta.ConsultaGastosMesViewText;
import com.maria.dama2014.view.almacen.proveedor.*;
import com.maria.dama2014.view.almacen.temporada.AddTemporadaInterfaz;
import com.maria.dama2014.view.almacen.temporada.AddTemporadaViewText;
import com.maria.dama2014.view.almacen.temporada.ListTemporadasInterfaz;
import com.maria.dama2014.view.almacen.temporada.ListTemporadasViewText;
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
        if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.TEST.toString())) {
            System.out.println("Pulso añadir proveedor");
            test();
            view.run();

        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_PROV.toString())) {
            System.out.println("Pulso añadir proveedor");
            addProveedor();
            view.run();

        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.VIEW_PROV.toString())) {
            System.out.println("Pulso ver proveedores");
            viewProveedores();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.EDIT_PROV.toString())) {
            System.out.println("Pulso editar proveedor");
            editProveedor();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_CATEG.toString())) {
            System.out.println("Pulso añadir familia");
            addCategoria();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.VIEW_CATEG.toString())) {
            System.out.println("Pulso añadir familia");
            viewCategorias();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.ADD_SEASON.toString())) {
            System.out.println("Pulso añadir temporada");
            addTemporada();
            view.run();
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.VIEW_SEASON.toString())) {
            System.out.println("Pulso ver temporadas");
            viewTemporadas();
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
        } else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.STATS_PROV.toString())) {
            System.out.println("Estadisticas de proveedor");
            statsProveedores();
        }else if (evento.getActionCommand().equals(MenuAlmacenOptionsEnum.EXIT.toString())) {
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

    private void test(){
        new ConsultaGastosMesViewText().run();
    }
    
    /************ PROVEEDOR ************************************************/
    private void addProveedor() {
        AddProveedorInterfaz addProvView = new AddProveedorViewText();
        // arrancar la vista
        addProvView.run();
    }
    
    private void editProveedor() {
        EditProveedorInterfaz editProvView = 
                (Config.getTextMode() ? new EditProveedorViewText() : new EditProveedorView());
        
        editProvView.setController(new EditProveedorController());
        // arrancar la vista
        editProvView.run();
    }

    private void viewProveedores() {
        ListProveedoresInterfaz listProvView = 
                (Config.getTextMode() ? new ListProveedoresViewText() : new ListProveedoresViewPanel());
        // arrancar la vista
        listProvView.run(null);
    }
    
    private void statsProveedores() {
        StatsProveedoresInterfaz view =
                new StatsProveedoresViewText();
        view.run();
    }

    /************ FAMILIA ************************************************/
    private void addCategoria() {
        AddCategoriaInterfaz addCatView = new AddCategoriaViewText();
        // arrancar la vista
        addCatView.run();
    }
    
    private void viewCategorias() {
        ListCategoriasInterfaz listCatView =  new ListCategoriasViewText();
        
        // arrancar la vista
        listCatView.run(view);
    }
    
    /************ TEMPORADA ************************************************/
    private void addTemporada() {
        AddTemporadaInterfaz addTempView = new AddTemporadaViewText();
        // arrancar la vista
        addTempView.run();
    }
    
    private void viewTemporadas() {
        ListTemporadasInterfaz listTempView =  new ListTemporadasViewText();
        
        // arrancar la vista
        listTempView.run(view);
    }
}
