/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allocateTime_modifySessions;

import com.spm.timetablemanagement.form.student_details.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.spm.timetablemanagement.main.MainFrame;
import com.spm.timetablemanagement.menu.MenuItem;



/**
 *
 * @author hvdil
 */
public class addDetails_allocationTime_Home extends javax.swing.JPanel {
     
    
    /**
     * Creates new form addDetails_Home
     */
    public addDetails_allocationTime_Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_home_lw = new javax.swing.JButton();
        btn_home_gw = new javax.swing.JButton();
        btn_home_sgw = new javax.swing.JButton();
        btn_home_sw = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setToolTipText("");

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_home_lw.setBackground(new java.awt.Color(255, 255, 255));
        btn_home_lw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_home_lw.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_lw.setText("Lecturer Wise");
        btn_home_lw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_lw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_lwMousePressed(evt);
            }
        });
        btn_home_lw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_lwActionPerformed(evt);
            }
        });

        btn_home_gw.setBackground(new java.awt.Color(255, 255, 255));
        btn_home_gw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_home_gw.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_gw.setText("Group Wise");
        btn_home_gw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_gw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_gwMousePressed(evt);
            }
        });
        btn_home_gw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_gwActionPerformed(evt);
            }
        });

        btn_home_sgw.setBackground(new java.awt.Color(255, 255, 255));
        btn_home_sgw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_home_sgw.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_sgw.setText("Sub-Group Wise");
        btn_home_sgw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_sgw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_sgwMousePressed(evt);
            }
        });
        btn_home_sgw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_sgwActionPerformed(evt);
            }
        });

        btn_home_sw.setBackground(new java.awt.Color(255, 255, 255));
        btn_home_sw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_home_sw.setForeground(new java.awt.Color(51, 51, 51));
        btn_home_sw.setText("Session Wise");
        btn_home_sw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home_sw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_home_swMousePressed(evt);
            }
        });
        btn_home_sw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home_swActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_home_lw, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addComponent(btn_home_gw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home_sgw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home_sw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btn_home_lw, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home_gw, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home_sgw, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home_sw, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn_home_lwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_lwActionPerformed
        // TODO add your handling code here:
               
    }//GEN-LAST:event_btn_home_lwActionPerformed
        
    private void btn_home_gwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_gwActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_home_gwActionPerformed

    private void btn_home_swActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_swActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home_swActionPerformed

    private void btn_home_lwMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_lwMousePressed
        // TODO add your handling code here: 
        jPanel3.removeAll();
        jPanel2.add(new lecturers_time());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_lwMousePressed

    private void btn_home_sgwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home_sgwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home_sgwActionPerformed

    private void btn_home_gwMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_gwMousePressed
        // TODO add your handling code here:
        jPanel3.removeAll();      
        jPanel2.add(new addGroup());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_gwMousePressed

    private void btn_home_sgwMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_sgwMousePressed
        // TODO add your handling code here:
        jPanel3.removeAll();      
        jPanel2.add(new addSubGroup());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_sgwMousePressed

    private void btn_home_swMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_home_swMousePressed
        // TODO add your handling code here:
        jPanel3.removeAll();      
        jPanel2.add(new setSessions());
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btn_home_swMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home_gw;
    private javax.swing.JButton btn_home_lw;
    private javax.swing.JButton btn_home_sgw;
    private javax.swing.JButton btn_home_sw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

