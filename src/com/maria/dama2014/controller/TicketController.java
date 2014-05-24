/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.controller;

import com.maria.dama2014.TicketEvents;
import com.maria.dama2014.TicketOptions;
import com.maria.dama2014.model.TicketModel;
import com.maria.dama2014.view.TicketView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Maria
 */
public class TicketController {

    public TicketController(TicketView ticketV, TicketModel ticketM) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void actionPerformed(ActionEvent actionEvent) {

        // ver tipo de evento
        if (actionEvent.getID() == TicketEvents.CHOICE.ordinal()) {
            actionSelected(actionEvent.getActionCommand());
        }
    }

    private void actionSelected(String actionCommand) {

        if (actionCommand.equals(TicketOptions.ACEPTAR.toString())) {
            System.out.println("Acepto ticket");
            //aceptarTicket();
        } else if (actionCommand.equals(TicketOptions.APARCAR.toString())) {
            System.out.println("Aparco ticket");
            //aparcarTicket()
        } else if (actionCommand.equals(TicketOptions.BUSCAR_REF)) {
            System.out.println("Voy a consultar el almacen");
            //buscarRef()
        } else if (actionCommand.equals(TicketOptions.BORRAR_LINEA)) {
            //borrarLinea()
        } else if (actionCommand.equals(TicketOptions.VALE)) {
            //pagar con vale
        } else if (actionCommand.equals(TicketOptions.CANCELAR)) {
            //cancelarTicket();
        }
    }
}
