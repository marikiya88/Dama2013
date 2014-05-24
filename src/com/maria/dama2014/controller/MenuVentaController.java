/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.controller;

import com.maria.dama2014.IndexOptions;
import com.maria.dama2014.MenuVentaOptions;
import com.maria.dama2014.model.MenuVentaModel;
import com.maria.dama2014.model.TicketModel;
import com.maria.dama2014.view.IndexViewText;
import com.maria.dama2014.view.TicketView;
import com.maria.dama2014.view.venta.MenuVentaInterfaz;
import com.maria.dama2014.view.venta.MenuVentaViewText;
import java.awt.event.ActionEvent;

/**
 *
 * @author Maria
 */
public class MenuVentaController {

    private MenuVentaInterfaz view;
    private MenuVentaModel model;
    
    public MenuVentaController(MenuVentaInterfaz view, MenuVentaModel model) {
        this.view = view;
        this.model = model;
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equals(MenuVentaOptions.START_TICKET.toString())) {
            System.out.println("Pulso empezar ticket");
            startTicketWindow();

        } else if (evento.getActionCommand().equals(MenuVentaOptions.RESUME_TICKET.toString())) {
            System.out.println("Pulso continuar ticket");
            view.run();
        } else if (evento.getActionCommand().equals(MenuVentaOptions.ALMACEN.toString())) {
            System.out.println("Pulso almacen");
            view.run();
        } else if (evento.getActionCommand().equals(MenuVentaOptions.APARTADO.toString())) {
            System.out.println("Pulso apartado");
            view.run();
        } else if (evento.getActionCommand().equals(MenuVentaOptions.DEVOLUCION.toString())) {
            System.out.println("Pulso devolucion");
            view.run();
        } else if (evento.getActionCommand().equals(MenuVentaOptions.MODISTA.toString())) {
            System.out.println("Pulso modista");
            view.run();
        } else if (evento.getActionCommand().equals(MenuVentaOptions.SALIR.toString())) {
            System.out.println("Pulso salir");
            backToPreviousView();
        } else {
            System.out.println("No te entiendo");
            view.run();
        }
    }

    private void startTicketWindow() {
        view.salir();
        
        TicketView ticketV = new TicketView();
        
        TicketModel ticketM = new TicketModel();
        TicketController ticketC = new TicketController(ticketV, ticketM);
    
    ticketV.setController(ticketC);
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
    
}
