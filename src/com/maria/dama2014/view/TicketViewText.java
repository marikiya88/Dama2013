/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view;

import com.maria.dama2014.IndexOptions;
import com.maria.dama2014.TicketEvents;
import com.maria.dama2014.TicketOptions;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class TicketViewText implements TicketInterfaz {

    public void run() {
        System.out.println("Elige una opcion");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(actions[i]);
        }

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            Integer choice = Integer.valueOf(s);

            System.out.println("Has elegido: " + s);

            switch (choice) {
                case 1:
                    controller.actionPerformed(
                            new ActionEvent(this, TicketEvents.CHOICE.ordinal(), TicketOptions.ACEPTAR.toString()));
                    break;
                case 2:
                    controller.actionPerformed(
                            new ActionEvent(this, TicketEvents.CHOICE.ordinal(), TicketOptions.APARCAR.toString()));
                    break;
                case 3:
                    controller.actionPerformed(
                            new ActionEvent(this, TicketEvents.CHOICE.ordinal(), TicketOptions.BUSCAR_REF.toString()));
                    break;
                case 4:
                    controller.actionPerformed(
                            new ActionEvent(this, TicketEvents.CHOICE.ordinal(), TicketOptions.BORRAR_LINEA.toString()));
                    break;
                case 5:
                    controller.actionPerformed(
                            new ActionEvent(this, TicketEvents.CHOICE.ordinal(), TicketOptions.VALE.toString()));
                    break;
                case 6:
                    controller.actionPerformed(
                            new ActionEvent(this, TicketEvents.CHOICE.ordinal(), TicketOptions.CANCELAR.toString()));
                    break;
                default:
                    break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
