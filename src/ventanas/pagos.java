/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Bladimr Chavez
 */
public class pagos extends javax.swing.JFrame {

    /**
     * Creates new form pagos
     */
    public pagos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ci = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pago_mes = new javax.swing.JLabel();
        hextras = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        anticipos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        total_pagar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        realizar_pago = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        gfgfg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(745, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("Numero de Cedula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Pagos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));
        getContentPane().add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel5.setText("Pago por horas trabajadas al mes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/20562137_1621368791238438_863900797_n.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel7.setText("Pago por horas extras");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        pago_mes.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        pago_mes.setForeground(new java.awt.Color(0, 0, 255));
        pago_mes.setText("jLabel6");
        getContentPane().add(pago_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        hextras.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        hextras.setForeground(new java.awt.Color(0, 0, 255));
        hextras.setText("jLabel8");
        getContentPane().add(hextras, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel9.setText("Total de anticipos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 120, -1));

        anticipos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        anticipos.setForeground(new java.awt.Color(255, 102, 0));
        anticipos.setText("jLabel10");
        getContentPane().add(anticipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel11.setText("Total a pagar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        total_pagar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        total_pagar.setText("jLabel12");
        getContentPane().add(total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hora de Entrada", "Hora de Salida", "Fecha", "Anticipos"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 720, 200));

        realizar_pago.setBackground(new java.awt.Color(255, 153, 0));
        realizar_pago.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        realizar_pago.setForeground(new java.awt.Color(255, 255, 255));
        realizar_pago.setText("Realizar Pago");
        getContentPane().add(realizar_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, 40));

        volver.setBackground(new java.awt.Color(255, 153, 0));
        volver.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/20496087_1621698584538792_2063384811_n.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        buscar.setBackground(new java.awt.Color(255, 153, 0));
        buscar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 130, 30));

        gfgfg.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        gfgfg.setForeground(new java.awt.Color(255, 102, 0));
        gfgfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/white-wallpaper_021212709_265.jpg"))); // NOI18N
        gfgfg.setText("jLabel1");
        getContentPane().add(gfgfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
    registros obj =new registros();
    obj.setVisible(true);
    dispose();
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anticipos;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField ci;
    private javax.swing.JLabel gfgfg;
    private javax.swing.JLabel hextras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pago_mes;
    private javax.swing.JButton realizar_pago;
    private javax.swing.JLabel total_pagar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}