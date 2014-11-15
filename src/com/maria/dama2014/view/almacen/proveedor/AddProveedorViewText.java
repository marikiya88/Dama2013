/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.proveedor;

import com.maria.dama2014.db.Proveedor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class AddProveedorViewText implements AddProveedorInterfaz {

    Proveedor prov = new Proveedor();

    @Override
    public void run() {

        String s;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce los datos (pulsa Intro para dejar en blanco)");
        // pedir los datos
        try {

            s="";
            while (s.isEmpty()) {
                System.out.println("Nombre: ");
                s = bufferRead.readLine();
            }
            prov.setNombre(s);
            
            System.out.println("Direccion: ");
            s = bufferRead.readLine();
            prov.setDireccion(s);

            System.out.println("Telefono: ");
            s = bufferRead.readLine();
            prov.setTelefono(s);

            System.out.println("Representante: ");
            s = bufferRead.readLine();
            prov.setRepresentante(s);

            System.out.println("Telefono del Representante: ");
            s = bufferRead.readLine();
            prov.setTelefonoRepresentante(s);

            System.out.println("Comentarios: ");
            s = bufferRead.readLine();
            prov.setComentarios(s);

            prov.newProveedor();
            
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
