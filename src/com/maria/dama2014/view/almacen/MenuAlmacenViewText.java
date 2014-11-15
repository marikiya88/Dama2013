/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen;

import com.maria.dama2014.controller.MenuAlmacenController;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class MenuAlmacenViewText implements MenuAlmacenInterfaz{

    MenuAlmacenController controller;
    MenuAlmacenOptions options = new MenuAlmacenOptions();
        
    @Override
    public void run() {
        System.out.println("Opciones");
        // opciones
        for (int option : options.getOptionsKeys()){
            System.out.println(option + ". " + options.getOptions().get(option).value);
        }
        
        // read choice
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            
            Integer choice = Integer.valueOf(s);

            System.out.println("Has elegido: " + s);
            controller.actionPerformed(new ActionEvent(this, choice, options.getOptions().get(choice).key.toString()));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void setController(MenuAlmacenController controller) {
        this.controller = controller;
    }

    @Override
    public void salir() {
        // en este caso no hacer nada
    }

    
}
