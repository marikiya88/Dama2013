/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view;

import com.maria.dama2014.view.almacen.proveedor.ListProveedoresInterfaz;
import com.maria.dama2014.view.almacen.proveedor.AddProveedorViewText;
import com.maria.dama2014.view.almacen.proveedor.ListProveedoresViewPanel;
import com.maria.dama2014.view.almacen.proveedor.AddProveedorInterfaz;
import com.maria.dama2014.controller.IndexController;
import com.maria.dama2014.view.almacen.*;
import com.maria.dama2014.view.almacen.consulta.*;

/**
 *
 * @author Maria
 */
public class IndexViewGraph extends javax.swing.JFrame implements IndexInterfaz {

    IndexController controller;

    /**
     * Creates new form IndexView
     */
    public IndexViewGraph() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        ventaMenu = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        almacenMenu = new javax.swing.JMenu();
        consultaAlmacenMenu = new javax.swing.JMenu();
        consultaCodigoMenuItem = new javax.swing.JMenuItem();
        consultaProvMenuItem = new javax.swing.JMenuItem();
        consultaDescrMenuItem = new javax.swing.JMenuItem();
        consultaFamiliaMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        proveedorMenu = new javax.swing.JMenu();
        proveedorMenuViewItem = new javax.swing.JMenuItem();
        proveedorMenuAddItem = new javax.swing.JMenuItem();
        familiaMenu = new javax.swing.JMenu();
        familiaMenuViewItem = new javax.swing.JMenuItem();
        familiaMenuAddItem = new javax.swing.JMenuItem();
        tipoTallaMenu = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        configMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventaMenu.setText("Venta");

        jMenu4.setText("Recoger");

        jMenuItem2.setText("Modista");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Apartado");
        jMenu4.add(jMenuItem3);

        ventaMenu.add(jMenu4);

        jMenuBar1.add(ventaMenu);

        almacenMenu.setText("Almacen");

        consultaAlmacenMenu.setText("Consulta");

        consultaCodigoMenuItem.setText("Por código");
        consultaCodigoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaCodigoMenuItemActionPerformed(evt);
            }
        });
        consultaAlmacenMenu.add(consultaCodigoMenuItem);

        consultaProvMenuItem.setText("Por proveedor");
        consultaProvMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProvMenuItemActionPerformed(evt);
            }
        });
        consultaAlmacenMenu.add(consultaProvMenuItem);

        consultaDescrMenuItem.setText("Por descripción");
        consultaDescrMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaDescrMenuItemActionPerformed(evt);
            }
        });
        consultaAlmacenMenu.add(consultaDescrMenuItem);

        consultaFamiliaMenuItem.setText("Por familia");
        consultaFamiliaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaFamiliaMenuItemActionPerformed(evt);
            }
        });
        consultaAlmacenMenu.add(consultaFamiliaMenuItem);

        almacenMenu.add(consultaAlmacenMenu);

        jMenu1.setText("Alta de ");
        almacenMenu.add(jMenu1);
        almacenMenu.add(jSeparator1);

        proveedorMenu.setText("Proveedores");

        proveedorMenuViewItem.setText("Ver Proveedores");
        proveedorMenuViewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorMenuViewItemActionPerformed(evt);
            }
        });
        proveedorMenu.add(proveedorMenuViewItem);

        proveedorMenuAddItem.setText("Añadir Prov.");
        proveedorMenuAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorMenuAddItemActionPerformed(evt);
            }
        });
        proveedorMenu.add(proveedorMenuAddItem);

        almacenMenu.add(proveedorMenu);

        familiaMenu.setText("Familias");

        familiaMenuViewItem.setText("Ver Familias");
        familiaMenuViewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familiaMenuViewItemActionPerformed(evt);
            }
        });
        familiaMenu.add(familiaMenuViewItem);

        familiaMenuAddItem.setText("Añadir Familia");
        familiaMenu.add(familiaMenuAddItem);

        almacenMenu.add(familiaMenu);

        tipoTallaMenu.setText("Tipos de Tallas");
        almacenMenu.add(tipoTallaMenu);
        almacenMenu.add(jSeparator2);

        jMenu2.setText("jMenu2");
        almacenMenu.add(jMenu2);

        jMenu3.setText("jMenu3");
        almacenMenu.add(jMenu3);

        jMenuBar1.add(almacenMenu);

        configMenu.setText("Configuración");
        jMenuBar1.add(configMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proveedorMenuViewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorMenuViewItemActionPerformed

        //MenuListProveedoresInterfaz view = new MenuListProveedoresViewText();
        ListProveedoresInterfaz view = new ListProveedoresViewPanel();
        view.run(this);
    }//GEN-LAST:event_proveedorMenuViewItemActionPerformed

    private void proveedorMenuAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorMenuAddItemActionPerformed
        AddProveedorInterfaz view = new AddProveedorViewText();
        view.run();
    }//GEN-LAST:event_proveedorMenuAddItemActionPerformed

    private void familiaMenuViewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familiaMenuViewItemActionPerformed
        //MenuListFamiliasInterfaz view = new MenuListFamiliasViewText();
        ListFamiliasInterfaz view = new MenuListFamiliasViewPanel();
        view.run(this);

    }//GEN-LAST:event_familiaMenuViewItemActionPerformed

    private void consultaCodigoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaCodigoMenuItemActionPerformed

        ConsultaAlmacenInterfaz view = new ConsultaAlmacenByCodigoViewText();
        view.run(this);
    }//GEN-LAST:event_consultaCodigoMenuItemActionPerformed

    private void consultaProvMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProvMenuItemActionPerformed
        ConsultaAlmacenInterfaz view = new ConsultaAlmacenByProvNameViewText();
        view.run(this);
    }//GEN-LAST:event_consultaProvMenuItemActionPerformed

    private void consultaDescrMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaDescrMenuItemActionPerformed
        ConsultaAlmacenInterfaz view = new ConsultaAlmacenByDescrViewText();
        view.run(this);
    }//GEN-LAST:event_consultaDescrMenuItemActionPerformed

    private void consultaFamiliaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaFamiliaMenuItemActionPerformed
        ConsultaAlmacenInterfaz view = new ConsultaAlmacenByFamiliaViewText();
        view.run(this);
    }//GEN-LAST:event_consultaFamiliaMenuItemActionPerformed

    @Override
    public void run() {
        setVisible(true);
    }

    @Override
    public void salir() {
        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu almacenMenu;
    private javax.swing.JMenu configMenu;
    private javax.swing.JMenu consultaAlmacenMenu;
    private javax.swing.JMenuItem consultaCodigoMenuItem;
    private javax.swing.JMenuItem consultaDescrMenuItem;
    private javax.swing.JMenuItem consultaFamiliaMenuItem;
    private javax.swing.JMenuItem consultaProvMenuItem;
    private javax.swing.JMenu familiaMenu;
    private javax.swing.JMenuItem familiaMenuAddItem;
    private javax.swing.JMenuItem familiaMenuViewItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu proveedorMenu;
    private javax.swing.JMenuItem proveedorMenuAddItem;
    private javax.swing.JMenuItem proveedorMenuViewItem;
    private javax.swing.JMenu tipoTallaMenu;
    private javax.swing.JMenu ventaMenu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setController(IndexController controller) {
        this.controller = controller;
    }
}
