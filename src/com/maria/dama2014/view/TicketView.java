/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view;

import com.maria.dama2014.controller.TicketController;
import com.maria.dama2012.AceptarTicketDialog;
import com.maria.dama2012.TableTicketModel;
import com.maria.dama2012.controller.TicketController;
import com.maria.dama2012.controller.TicketModel;

import com.maria.dama2012.config.*;
import com.maria.dama2012.controller.MainController;
import com.maria.dama2014.model.TicketModel;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maria
 */
public class TicketView extends javax.swing.JFrame implements TicketInterfaz{

    private boolean apartadoVenta = false;
    private int numTicket = 1;
    private int totalItems = 0;
    private double total = 0.0;

    public TicketView() {
        initComponents();
        localInitialization();
    }

    private void localInitialization() {

        // Ocultar las etiquetas
        hideLabels();

        // ----------------------------------------------------------------
        // Capturar las letras pulsadas
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F1"), "f1");
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F2"), "f2");
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F3"), "f3");
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F4"), "f4");
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F5"), "f5");
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F6"), "f6");

        jPanel1.getActionMap().put("f1", f1Pulsada);
        jPanel1.getActionMap().put("f2", f2Pulsada);
        jPanel1.getActionMap().put("f3", f3Pulsada);
        jPanel1.getActionMap().put("f4", f4Pulsada);
        jPanel1.getActionMap().put("f5", f5Pulsada);
        jPanel1.getActionMap().put("f6", f6Pulsada);
        // ----------------------------------------------------------------

        //model.addListener(this);
        //controller.init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ticketLabel = new javax.swing.JLabel();
        nTicketLabel = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        tableTicket = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuList = new javax.swing.JList();
        itemsLabel = new javax.swing.JLabel();
        itemsNumberLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalNumberLabel = new javax.swing.JLabel();
        totalColonLabel = new javax.swing.JLabel();
        totalDecimalLabel = new javax.swing.JLabel();
        totalEurosLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        vendedorLabel = new javax.swing.JLabel();
        logoPanel = new logoPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modas DAMA");
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ticketLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ticketLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketLabel.setText("Ticket");
        ticketLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        nTicketLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        nTicketLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nTicketLabel.setText("25");
        nTicketLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        tableTicket.setModel(new TableTicketModel());
        tableTicket.setEnabled(false);
        tableTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableTicketKeyPressed(evt);
            }
        });
        tableScroll.setViewportView(tableTicket);

        menuList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        menuList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menuList);

        itemsLabel.setText("Total items:");

        itemsNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        itemsNumberLabel.setText("5");

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        totalLabel.setText("Total");
        totalLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        totalNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        totalNumberLabel.setText("225");
        totalNumberLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        totalColonLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalColonLabel.setText(",");
        totalColonLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        totalDecimalLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totalDecimalLabel.setText("99");

        totalEurosLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        totalEurosLabel.setText("€");
        totalEurosLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        buttonsPanel.setLayout(new java.awt.GridLayout(2, 3));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Vendedor:");

        vendedorLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vendedorLabel.setText("Mari");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(itemsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemsNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                        .addComponent(totalLabel)
                        .addGap(40, 40, 40)
                        .addComponent(totalNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalColonLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalDecimalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalEurosLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(vendedorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ticketLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nTicketLabel))
                            .addComponent(tableScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nTicketLabel)
                    .addComponent(ticketLabel)
                    .addComponent(vendedorLabel)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalDecimalLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemsNumberLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(itemsLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalColonLabel))
                    .addComponent(totalEurosLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public TicketController getController() {
        return controller;
    }

    public void setController(TicketController controller) {
        this.controller = controller;
    }

    public void run() {
        pack();// coloca los componentes
        setLocationRelativeTo(null);// centra la ventana en la pantalla
        setVisible(true);// visualiza la ventana
    }

    private void tableTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableTicketKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (tableTicket.isEditing()) {
                tableTicket.getCellEditor().stopCellEditing();
            }
            evt.consume(); // esto hace que no avance

            int field = tableTicket.getSelectedRow();
            int column = tableTicket.getSelectedColumn();


            // Hacer comprobaciones
            if (campoTipoAceptado(field, column)) {

                // informar al controlador
                getController().fieldEntered(field, column, tableTicket.getColumnCount(), tableTicket.getValueAt(field, column));

                if (column == 0 || column == 4) {
                    column += 2;
                } else if (column == tableTicket.getColumnCount() - 1) {
                    field++;
                    column = 0;
                } else {
                    column++;
                }

                tableTicket.changeSelection(field, column, false, false);
                tableTicket.editCellAt(field, column);
            }
        } else {
            System.out.println("Letra pulsada: " + evt.getKeyChar() + ", codigo " + evt.getKeyCode());
        }

    }//GEN-LAST:event_tableTicketKeyPressed

    private void menuListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuListMouseClicked

        // contar numero de clicks
        if (evt.getClickCount() == 2) {
            //get selected option
            controller.actionPerformed(new ActionEvent(this, EventoTicket.OPTION, ))
            controller.selectAction(menuList.getSelectedIndex());
        }
    }//GEN-LAST:event_menuListMouseClicked

    private void fBotonActionPerformed(ActionEvent evt) {
        // ver en qué botón se ha pulsado
        for (int index = 0; index < buttonsPanel.getComponentCount(); index++) {
            if (buttonsPanel.getComponent(index) == evt.getSource()) {
                controller.selectAction(index);
            }
        }
    }
    Action f1Pulsada = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.selectAction(0);
        }
    };
    Action f2Pulsada = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.selectAction(1);
        }
    };
    Action f3Pulsada = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.selectAction(2);
        }
    };
    Action f4Pulsada = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.selectAction(3);
        }
    };
    Action f5Pulsada = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.selectAction(4);
        }
    };
    Action f6Pulsada = new AbstractAction() {

        @Override
        public void actionPerformed(ActionEvent e) {
            controller.selectAction(5);
        }
    };

    private void ticketAceptado() {
        new AceptarTicketDialog(this, numTicket, totalItems, total).setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JLabel itemsNumberLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JList menuList;
    private javax.swing.JLabel nTicketLabel;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTable tableTicket;
    private javax.swing.JLabel ticketLabel;
    private javax.swing.JLabel totalColonLabel;
    private javax.swing.JLabel totalDecimalLabel;
    private javax.swing.JLabel totalEurosLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalNumberLabel;
    private javax.swing.JLabel vendedorLabel;
    // End of variables declaration//GEN-END:variables

    private boolean campoTipoAceptado(int row, int column) {

        // segun qué columna es una cosa u otra

        Object valor = tableTicket.getValueAt(row, column);
        switch (column) {
            case ColumnasTablaKey.CANTIDAD:
                // Cantidad
                // tiene que ser una cantidad positiva 
                int cantidad = (Integer) valor;
                return (cantidad > 0);

            case ColumnasTablaKey.PVP_ACTUAL:
                // tiene que ser positivo
                float pvp = (Float) valor;
                return (pvp > 0);

            default:
                return true;

            case ColumnasTablaKey.REFERENCIA:
                // Referencia
                // tiene que existir la referencia en la bd

                return true;
            case ColumnasTablaKey.TALLA:
                // Talla
                // la voy a obligar a elegir de un listado
                break;
            case ColumnasTablaKey.COLOR:
                // Color
                // le voy a obligar a elegir de un listado
                break;

        }

        return false;
    }

    public void resetTicketTable() {
        tableTicket.setModel(new TableTicketModel());
        tableTicket.setFillsViewportHeight(true);
    }

    public void setTicketLabel(int nTicket) {
        nTicketLabel.setText(nTicket + "");
        ticketLabel.setVisible(true);
        nTicketLabel.setVisible(true);
    }

    public void setVendedorLabel(String nombre) {
        vendedorLabel.setText(nombre);
        jLabel3.setVisible(true);
        vendedorLabel.setVisible(true);
    }

    public void setActionsMenu() {
        menuList.setListData(actions);
        buttonsPanel.removeAll();
        buttonsPanel.repaint();
        for (int i = 0; i < actions.length; i++) {
            // boton
            JButton b = new JButton(actions[i]);
            // lista
            b.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fBotonActionPerformed(evt);
                }
            });

            buttonsPanel.add(b);
        }
    }

    public void hideLabels() {
        // ticket
        ticketLabel.setVisible(false);
        nTicketLabel.setVisible(false);

        // vendedor
        jLabel3.setVisible(false);
        vendedorLabel.setVisible(false);

        // totales
        totalLabel.setVisible(false);
        totalNumberLabel.setVisible(false);
        totalColonLabel.setVisible(false);
        totalDecimalLabel.setVisible(false);
        totalEurosLabel.setVisible(false);

        // items
        itemsLabel.setVisible(false);
        itemsNumberLabel.setVisible(false);
    }
}