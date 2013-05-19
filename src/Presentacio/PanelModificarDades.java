/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelModificarDades.java
 *
 * Created on 13-may-2013, 22:59:11
 */

package Presentacio;

import java.util.ArrayList;

/**
 *
 * @author albertomarin
 */
public class PanelModificarDades extends javax.swing.JPanel {

    ControladorPresentacio cp;

    /** Creates new form PanelModificarDades */
    public PanelModificarDades(ControladorPresentacio cpr) {
        cp = cpr;
        initComponents();
        this.setBounds(0, 0, 700, 550);
        this.comboBoxAssigs.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        llistaAssignatures = new javax.swing.JTextArea();
        comboBoxOpcionsAssig = new javax.swing.JComboBox();
        panelNomAssig = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        panellDadesAssignatura = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        nivell = new javax.swing.JTextField();
        comboBoxAssigs = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        botoTornar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 550));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Assignatures Disponibles:");

        llistaAssignatures.setEditable(false);
        llistaAssignatures.setBackground(new java.awt.Color(240, 240, 240));
        llistaAssignatures.setColumns(20);
        llistaAssignatures.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        llistaAssignatures.setRows(5);
        jScrollPane4.setViewportView(llistaAssignatures);

        comboBoxOpcionsAssig.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBoxOpcionsAssig.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CREAR", "MODIFICAR", "ESBORRAR" }));
        comboBoxOpcionsAssig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOpcionsAssigActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("nom de l' assignatura");
        jLabel5.setBounds(50, 10, 135, 15);
        panelNomAssig.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField2.setBounds(200, 10, 110, 20);
        panelNomAssig.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("nivell");
        jLabel4.setBounds(30, 10, 50, 20);
        panellDadesAssignatura.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nivell.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nivell.setBounds(80, 10, 70, 20);
        panellDadesAssignatura.add(nivell, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ACCEPTAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelNomAssig, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(panellDadesAssignatura)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxAssigs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxOpcionsAssig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxOpcionsAssig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBoxAssigs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelNomAssig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panellDadesAssignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        jTabbedPane1.addTab("Assignatures", jPanel1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel2.setText("Aules Disponibles:");

        jButton5.setText("Crear...");

        jButton6.setText("Modificar...");

        jButton7.setText("Borrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap(453, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Aules", jPanel2);

        jLabel3.setText("Restriccions Disponibles:");

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1. Restringir un grup a una aula.", "2. Restringir un grup a un dia i hora.", "3. Restringir una assignatura+grup en una hora.", "4. Restringir una assignatura+grup en un dia.", "5. Dues assig+grup no poden cursarse a la vegada.", "6. Restringir un aula a no utilitzar-se un dia/hora." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jButton8.setText("Definir...");

        jButton9.setText("Modificar...");

        jButton10.setText("Borrar...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Restriccions", jPanel3);

        jTabbedPane1.setBounds(10, 10, 680, 490);
        jLayeredPane1.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botoTornar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botoTornar.setText("Tornar");
        botoTornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoTornarActionPerformed(evt);
            }
        });
        botoTornar.setBounds(300, 510, 100, 30);
        jLayeredPane1.add(botoTornar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botoTornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoTornarActionPerformed
        // TODO add your handling code here:
        cp.canviaPanel("menuPrincipal");
    }//GEN-LAST:event_botoTornarActionPerformed

    private void comboBoxOpcionsAssigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOpcionsAssigActionPerformed
        if( ( (String) comboBoxOpcionsAssig.getSelectedItem() ).equals("CREAR")  ) {
            this.comboBoxAssigs.setVisible(false);
            this.panelNomAssig.setVisible(true);
            this.panellDadesAssignatura.setVisible(true);
        }
        else if( ( (String) comboBoxOpcionsAssig.getSelectedItem() ).equals("MODIFICAR")  ) {
            this.comboBoxAssigs.setVisible(true);
            this.panelNomAssig.setVisible(false);
            this.panellDadesAssignatura.setVisible(true);
        }
        else if( ( (String) comboBoxOpcionsAssig.getSelectedItem() ).equals("ESBORRAR")  ) {
            this.comboBoxAssigs.setVisible(true);
            this.panelNomAssig.setVisible(false);
            this.panellDadesAssignatura.setVisible(false);
        }
    }//GEN-LAST:event_comboBoxOpcionsAssigActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoTornar;
    private javax.swing.JComboBox comboBoxAssigs;
    private javax.swing.JComboBox comboBoxOpcionsAssig;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea llistaAssignatures;
    private javax.swing.JTextField nivell;
    private javax.swing.JLayeredPane panelNomAssig;
    private javax.swing.JLayeredPane panellDadesAssignatura;
    // End of variables declaration//GEN-END:variables

    public void inicialitza() {
        ArrayList<String> llistaAssigs =  cp.llistaAssignatures();
        String totesAssig = "";
        String nomUD = cp.getNomUnitatDocent();
        for( String nomAssig : llistaAssigs ){
            nomAssig = nomAssig.replace( "assig-"+nomUD+"-", "");
            nomAssig = nomAssig.replace( ".txt", "");
            String f = nomAssig;
            this.comboBoxAssigs.addItem(f);
            totesAssig = totesAssig.concat(nomAssig+"\n");
        }
       this.llistaAssignatures.setText(totesAssig);
    }

}
