/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view;

import com.maria.dama2014.IndexOptions;
import com.maria.dama2014.controller.IndexController;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class IndexViewText implements IndexInterfaz{

    IndexController controller;

    public void setController(IndexController controller){
        this.controller = controller;
    }
    
    public void run() {

        // opciones
        System.out.println("Elige la opcion");
        System.out.println("\t 1. Venta");
        System.out.println("\t 2. Almacen");
        System.out.println("\t 3. Opciones");
        System.out.println("\t 4. Salir");

        // read choice
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            Integer choice = Integer.valueOf(s);

            System.out.println("Has elegido: " + s);

            switch (choice) {
                case 1:
                    controller.actionPerformed( new ActionEvent(this, 1, IndexOptions.VENTA.toString()) );
                    break;
                case 2:
                    controller.actionPerformed( new ActionEvent(this, 2, IndexOptions.ALMACEN.toString()) );
                    break;
                case 3:
                    controller.actionPerformed( new ActionEvent(this, 3, IndexOptions.MENU.toString()) );
                    break;
                case 4:
                    controller.actionPerformed( new ActionEvent(this, 4, IndexOptions.SALIR.toString()) );
                    break;
                default:
                    break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void salir() {
        System.out.println("Adios");
        System.exit(0);
    }
}