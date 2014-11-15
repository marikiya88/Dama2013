/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.proveedor;

import com.maria.dama2014.controller.EditProveedorController;
import com.maria.dama2014.db.Proveedor;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Maria
 */
public class EditProveedorViewText implements EditProveedorInterfaz {

    EditProveedorController controller;
    Proveedor prov = new Proveedor();

    @Override
    public void run() {

        String s;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Elige el proveedor a modificar (su identificador) ");
        new ListProveedoresViewText().run(null);

        // leer proveedor
        int id = 0;
        try {
            s = bufferRead.readLine();
            id = Integer.valueOf(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Proveedor prov = new Proveedor().getById(id);

        System.out.println("Introduce los datos (pulsa Intro para dejar igual)");
        try {
            s = "";
            System.out.println("Id: \t\t" + prov.getId());
            System.out.println("Nombre: \t\t" + prov.getNombre());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setNombre(s);
            }
            System.out.println("Direccion: \t\t" + prov.getDireccion());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setDireccion(s);
            }
            System.out.println("CP: \t\t" + prov.getCp());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setCp(s);
            }
            System.out.println("Localidad: \t\t" + prov.getLocalidad());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setLocalidad(s);
            }
            System.out.println("Provincia: \t\t" + prov.getProvincia());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setProvincia(s);
            }
            System.out.println("Telefono: \t\t" + prov.getTelefono());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setTelefono(s);
            }
            System.out.println("Representante: \t\t" + prov.getRepresentante());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setRepresentante(s);
            }
            System.out.println("Tel Representante: \t\t" + prov.getTelefonoRepresentante());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setTelefonoRepresentante(s);
            }
            System.out.println("Comentarios: \t\t" + prov.getComentarios());
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setComentarios(s);
            }

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
