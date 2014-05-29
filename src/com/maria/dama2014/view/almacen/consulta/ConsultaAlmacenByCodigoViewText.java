/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.consulta;

import com.maria.dama2014.db.Categoria;
import com.maria.dama2014.db.Modelo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author Maria
 */
public class ConsultaAlmacenByCodigoViewText extends ConsultaAlmacenByCodigoInterfaz {

    @Override
    public void run(Object parent) {

        String s;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        // pedir los datos
        try {

            s = "";
            while (s.isEmpty()) {
                System.out.println("Introduce el código a buscar");
                s = bufferRead.readLine();
            }
            
            List<Modelo> mods = mod.findByCode(s);
            
            if (mods.size() > 0){
                System.out.println("Se han encontrado " + mods.size() + " modelos");
                for (Modelo m : mods){
                    System.out.println(": " + m.getCodigo() 
                            + "\r\n\t" + m.getDescripcion() 
                            + "\r\n\t" + m.getCategoria().getDescripcion()
                            + "\r\n\t" + m.getProveedor().getNombre() 
                            + "\r\n\t" + m.getPrendas().size() + " prendas en stock"
                            + "\r\n\t" + m.getColoridos());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void salir() {
        return;
    }
}
