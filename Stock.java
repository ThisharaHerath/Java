
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Stock extends javax.swing.JFrame {
    public Stock() {
        initComponents();

        
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        quntity = new javax.swing.JTextField();
        name = new javax.swing.JComboBox<>();
        fabDate = new javax.swing.JTextField();
        expDate = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Med_Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 94, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quntity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 75, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("FabDate");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 75, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ExpDate");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        add.setBackground(new java.awt.Color(0, 255, 51));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 75, 38));

        update.setBackground(new java.awt.Color(102, 102, 255));
        update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 80, 38));

        delete.setBackground(new java.awt.Color(255, 102, 0));
        delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 80, 38));

        clear.setBackground(new java.awt.Color(153, 153, 153));
        clear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 84, 38));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 320, -1));
        jPanel1.add(quntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 320, -1));

        name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amoxicillin", "Levothyroxine", "Metformin", "Panadol", "Piriton", "Vitamin D" }));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 320, -1));

        fabDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabDateActionPerformed(evt);
            }
        });
        jPanel1.add(fabDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 320, -1));
        jPanel1.add(expDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 320, -1));

        back.setBackground(new java.awt.Color(0, 204, 204));
        back.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 90, 40));

        exit.setBackground(new java.awt.Color(255, 0, 51));
        exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 90, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("STOCK");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 160, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quntity", "FabDate", "ExpDate"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 680, 180));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 900, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// Example declaration at the class level
    
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {

            String nn = name.getSelectedItem().toString();
            String ag = price.getText();
            String ge = quntity.getText();
            String me = fabDate.getText();
            String ex = expDate.getText();

            dbcon.IUD("INSERT INTO stock (medName,price,quntity,fabDate,expDate) VALUES ('" + nn + "','" + ag + "','" + ge + "','" + me + "','" + ex + "')");
            JOptionPane.showMessageDialog(this, "Details Added Successfully", "DONE!", JOptionPane.INFORMATION_MESSAGE);

            //customerId.setText(null);
            price.setText(null);
            quntity.setText(null);
            fabDate.setText(null);
            expDate.setText(null);

            ResultSet rs = dbcon.SEARCH("SELECT * FROM stock");
            while (rs.next()) {
                String id = rs.getString("medID");
                String nam = rs.getString("medName");
                String nm = rs.getString("price");
                String age = rs.getString("quntity");
                String gen = rs.getString("fabDate");
                String mee = rs.getString("expDate");

                Vector v = new Vector();
                v.add(id);
                v.add(nam);
                v.add(nm);
                v.add(age);
                v.add(gen);
                v.add(mee);
                DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addActionPerformed


    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            int r = jTable.getSelectedRow();

            String id = jTable.getValueAt(r, 0).toString();
            String name = jTable.getValueAt(r, 1).toString();
            String price = jTable.getValueAt(r, 2).toString();
            String quntity = jTable.getValueAt(r, 3).toString();
            String fabDate = jTable.getValueAt(r, 4).toString();
            String expDate = jTable.getValueAt(r, 5).toString();

            dbcon.IUD("UPDATE stock SET medName = '" + name + "' WHERE medID = '" + id + "'");
            dbcon.IUD("UPDATE stock SET price = '" + price + "' WHERE medID = '" + id + "'");
            dbcon.IUD("UPDATE stock SET quntity = '" + quntity + "' WHERE medID = '" + id + "'");
            dbcon.IUD("UPDATE stock SET fabDate = '" + fabDate + "' WHERE medID = '" + id + "'");
            dbcon.IUD("UPDATE stock SET expDate = '" + expDate + "' WHERE medID = '" + id + "'");

            JOptionPane.showMessageDialog(this, "Row Update Successfully!", "DONE", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void fabDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fabDateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        //name.setSelectedItem("");
        price.setText("");
        quntity.setText("");
        fabDate.setText("");
        expDate.setText(""); 
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            int r = jTable.getSelectedRow();
            String delr = jTable.getValueAt(r, 0).toString(); // 0 veni row
            dbcon.IUD("DELETE FROM stock WHERE medID = '" + delr + "'");
            DefaultTableModel dtm = (DefaultTableModel) jTable.getModel();
            dtm.removeRow(r);
            JOptionPane.showMessageDialog(this, "Row Deleted Successfulll!", "DONE", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        DashBoard r = new DashBoard();
        r.setVisible(true);

        //login l = new login();
        this.dispose();
        

    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JTextField expDate;
    private javax.swing.JTextField fabDate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quntity;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
