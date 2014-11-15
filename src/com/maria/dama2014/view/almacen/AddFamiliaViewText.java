/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen;

import com.maria.dama2014.db.Categoria;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class AddFamiliaViewText implements AddFamiliaInterfaz {

    Categoria cat = new Categoria();

    @Override
    public void run() {

        String s;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce los datos (no se puede dejar en blanco)");
        // pedir los datos
        try {

            s="";
            while (s.isEmpty()) {
                System.out.println("Nombre: ");
                s = bufferRead.readLine();
            }
            cat.setDescripcion(s);
            
            cat.newCategoria();
            
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    @Override
    public void salir() {
        return;
    }
}
