/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.venta;

import com.maria.dama2014.MenuVentaOptions;
import com.maria.dama2014.controller.MenuVentaController;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class MenuVentaViewText implements MenuVentaInterfaz{

    MenuVentaController controller;
    
    private String[] actions = {
        "1 - Iniciar Ticket",
        "2 - Retomar ticket aparcado",
        "3 - Consultar almacén",
        "4 - Devolucion",
        "5 - Recoger apartado",
        "6 - Recoger modista",
        "7 - Salir"
    };
    
    @Override
    public void run() {
        System.out.println("Opciones");
        // opciones
        for (int i=0; i<actions.length; i++){
            System.out.println(actions[i]);
        }
        
        // read choice
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            Integer choice = Integer.valueOf(s);

            System.out.println("Has elegido: " + s);
            switch (choice) {
                case 1:
                    controller.actionPerformed(new ActionEvent(this, choice, MenuVentaOptions.START_TICKET.toString()));
                    break;
                case 2:
                    controller.actionPerformed(new ActionEvent(this, choice, MenuVentaOptions.RESUME_TICKET.toString()));
                    break;
                case 3:
                    controller.actionPerformed(new ActionEvent(this, choice, MenuVentaOptions.ALMACEN.toString()));
                    break;
                case 4:
                    controller.actionPerformed(new ActionEvent(this, choice, MenuVentaOptions.DEVOLUCION.toString()));
                    break;
                case 5:
                    controller.actionPerformed(new ActionEvent(this, choice, MenuVentaOptions.APARTADO.toString()));
                    break;
                case 6:
                    controller.actionPerformed(new ActionEvent(this, choice, MenuVentaOptions.MODISTA.toString()));
                    break;
                case 7:
                    controller.actionPerformed(new ActionEvent(this, choice, MenuVentaOptions.SALIR.toString()));
                    break;
                default:
                    break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void setController(MenuVentaController controller) {
        this.controller = controller;
    }

    @Override
    public void salir() {
        // en este caso no hacer nada
    }
    
}
