/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.temporada;

import com.maria.dama2014.db.Temporada;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class AddTemporadaViewText implements AddTemporadaInterfaz {

    Temporada season = new Temporada();

    @Override
    public void run() {

        String s;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce los datos (pulsa Intro para dejar en blanco)");
        // pedir los datos
        try {

            s="";
            while (s.isEmpty()) {
                System.out.println("Descripcion: ");
                s = bufferRead.readLine();
            }
            season.setDescripcion(s);
            
            season.newTemporada();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
