/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.proveedor;

import com.maria.dama2014.controller.EditProveedorController;
import com.maria.dama2014.db.Proveedor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maria
 */
public class EditProveedorViewText implements EditProveedorInterfaz {

    EditProveedorController controller;

    public void setController(EditProveedorController controller){
        this.controller = controller;
    }
    
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
            System.out.println("Id: " + prov.getId());
            System.out.print("Nombre: " + prov.getNombre() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setNombre(s);
            }
            System.out.print("Direccion: " + prov.getDireccion() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setDireccion(s);
            }
            System.out.print("CP: " + prov.getCp() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setCp(s);
            }
            System.out.print("Localidad: " + prov.getLocalidad() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setLocalidad(s);
            }
            System.out.print("Provincia: " + prov.getProvincia() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setProvincia(s);
            }
            System.out.print("Telefono: " + prov.getTelefono() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setTelefono(s);
            }
            System.out.print("Representante: " + prov.getRepresentante() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setRepresentante(s);
            }
            System.out.print("Tel Representante: " + prov.getTelefonoRepresentante() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setTelefonoRepresentante(s);
            }
            System.out.print("Comentarios: " + prov.getComentarios() + "\t\t:");
            s = bufferRead.readLine();
            if (!s.isEmpty()) {
                prov.setComentarios(s);
            }

            prov.updateProveedor();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    @Override
    public void salir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
