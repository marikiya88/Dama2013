/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view;

import com.maria.dama2014.controller.TicketController;

/**
 *
 * @author Maria
 */
public interface TicketInterfaz {
    
    TicketController controller = null;
    
    static String[] actions = {
        "F1 - Aceptar Ticket",
        "F2 - Aparcar Ticket",
        "F3 - Buscar Referencia",
        "F4 - Borrar Linea",
        "F5 - Usar Vale",
        "F6 - Cancelar Ticket"
    };
    
    public void run();
    
}
