/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelLogin.java
 *
 * Created on May 10, 2013, 1:15:31 PM
 */
package Presentacio;

/**
 *
 * @author miquel.masriera
 */
public class PanelLogin extends javax.swing.JPanel {
    
    ControladorPresentacio cp;

    /** Creates new form PanelLogin */
    public PanelLogin( ControladorPresentacio cpres ) {
        cp = cpres; 
        initComponents();
        this.setBounds(0,0,700,500);
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
        botoLogin = new javax.swing.JButton();
        nomUD = new javax.swing.JTextField();
        labelNomUnitatDocent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        botoLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botoLogin.setText("LOGIN");
        botoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoLoginActionPerformed(evt);
            }
        });
        botoLogin.setBounds(300, 350, 100, 40);
        jLayeredPane1.add(botoLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nomUD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomUDActionPerformed(evt);
            }
        });
        nomUD.setBounds(350, 250, 200, 40);
        jLayeredPane1.add(nomUD, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labelNomUnitatDocent.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        labelNomUnitatDocent.setText("Nom de la unitat docent  :");
        labelNomUnitatDocent.setBounds(150, 250, 200, 40);
        jLayeredPane1.add(labelNomUnitatDocent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generador d' horaris 6.1");
        jLabel1.setBounds(100, 50, 500, 180);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void botoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoLoginActionPerformed
    String nomUnitatDocent = nomUD.getText();
    System.out.println(nomUnitatDocent);
    if( nomUnitatDocent == null || nomUnitatDocent.contains(" ") || nomUnitatDocent.equals("") )
        cp.mostraAvis("El nom de la unitat docent ha de ser \n una cadena de Caracters sense espais en blanc");
    else { // el nom es valid
        cp.identificarUnitatDocent(nomUnitatDocent);
        cp.canviaPanel("menu");
    }
}//GEN-LAST:event_botoLoginActionPerformed

    private void nomUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomUDActionPerformed
        
    }//GEN-LAST:event_nomUDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel labelNomUnitatDocent;
    private javax.swing.JTextField nomUD;
    // End of variables declaration//GEN-END:variables
}
