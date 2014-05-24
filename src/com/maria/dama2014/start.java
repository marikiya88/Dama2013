/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014;

import com.maria.dama2014.controller.IndexController;
import com.maria.dama2014.view.IndexViewText;

/**
 *
 * @author Maria
 */
public class start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IndexViewText indexV = new IndexViewText();
        IndexController indexC = new IndexController(indexV);
        indexV.setController(indexC);
        
        indexV.run();
        
    }
}
