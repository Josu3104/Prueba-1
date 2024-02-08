
import programacion2pureba1.BlockBuster;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Mia Symns
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    BlockBuster tk;

    public main() {
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

        MENU = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarItem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BUSCAR = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        coddde = new javax.swing.JTextField();
        searchBTTN = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MENU.setBackground(new java.awt.Color(51, 51, 51));
        MENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        jLabel1.setText("MENU");
        MENU.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 27, 113, 47));

        buscarItem.setText("Buscar Item");
        buscarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarItemActionPerformed(evt);
            }
        });
        MENU.add(buscarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 92, 147, 32));

        jButton2.setText("Agregar Item");
        MENU.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 142, 147, 31));

        jButton3.setText("Rentar");
        MENU.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 191, 147, 35));

        jButton4.setText("auditarMovieEstados");
        MENU.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 244, 147, 35));

        BUSCAR.setBackground(new java.awt.Color(51, 51, 51));
        BUSCAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        jLabel2.setText("BUSCAR");
        BUSCAR.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 160, 47));
        BUSCAR.add(coddde, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, 40));

        searchBTTN.setText("Buscar");
        searchBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTTNActionPerformed(evt);
            }
        });
        BUSCAR.add(searchBTTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GAME", "MOVIE", " ", " " }));
        BUSCAR.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel3.setText("CODIGO");
        BUSCAR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENU, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENU, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarItemActionPerformed
        this.MENU.setVisible(false);
        this.BUSCAR.setVisible(true);
    }//GEN-LAST:event_buscarItemActionPerformed

    private void searchBTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTTNActionPerformed
        String temp = tipo.getSelectedItem().toString();
        switch (temp) {
            case "GAME":
                temp = "GAME";
                tk.buscarItem(Integer.parseInt(this.coddde.getText()), temp);

                break;
            case "MOVIE":
                temp = "MOVIE";
                tk.buscarItem(Integer.parseInt(this.coddde.getText()), temp);
                break;

        }


    }//GEN-LAST:event_searchBTTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BUSCAR;
    private javax.swing.JPanel MENU;
    private javax.swing.JButton buscarItem;
    private javax.swing.JTextField coddde;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton searchBTTN;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}