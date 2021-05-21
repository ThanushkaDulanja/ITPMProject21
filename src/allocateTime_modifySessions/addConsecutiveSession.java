/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allocateTime_modifySessions;

import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hvdil
 */
public class addConsecutiveSession extends javax.swing.JPanel {

    Connection connection;
    PreparedStatement pst;
    ResultSet rs;
    String finalTags = null;
    String sessID = null;
    ArrayList<ConsecutiveSession> Conseclist = new ArrayList<ConsecutiveSession>();
    /**
     * Creates new form addConsecutiveSession
     */
    public addConsecutiveSession() {
        initComponents();
        
        txt_id.setVisible(false);
        SubGroupSelection();
        txt_csSelectionId.setVisible(false);
        txt_csSelectedId.setVisible(false);
        showConsecutiveSessionNList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_csSelected = new javax.swing.JTable();
        btn_select = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_csSelection = new javax.swing.JTable();
        btn_remove = new javax.swing.JButton();
        txt_csSelectionId = new javax.swing.JTextField();
        btn_set = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        selection_sId = new javax.swing.JComboBox<>();
        txt_csSelectedId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_error_selection = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_cs = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_deletecs = new javax.swing.JButton();
        txt_error_cs = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, -1, -1));

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Set Consecutive Session");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tbl_csSelected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Session", "Tag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_csSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csSelectedMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_csSelected);

        btn_select.setBackground(new java.awt.Color(0, 153, 204));
        btn_select.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_select.setForeground(new java.awt.Color(51, 51, 51));
        btn_select.setText("Select ");
        btn_select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });

        tbl_csSelection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Session", "Tag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_csSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csSelectionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_csSelection);

        btn_remove.setBackground(new java.awt.Color(255, 0, 0));
        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(51, 51, 51));
        btn_remove.setText("Remove");
        btn_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_set.setBackground(new java.awt.Color(255, 153, 0));
        btn_set.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_set.setForeground(new java.awt.Color(51, 51, 51));
        btn_set.setText("Set");
        btn_set.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Group ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        selection_sId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection_sIdActionPerformed(evt);
            }
        });

        txt_error_selection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error_selection.setForeground(new java.awt.Color(255, 51, 51));
        txt_error_selection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel2))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(txt_error_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txt_csSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addComponent(txt_csSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selection_sId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(selection_sId))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txt_csSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_csSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_select, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane5.setViewportView(jPanel12);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(732, 360));

        tbl_cs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Group ID", "Consecutive Session", "Session ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_csMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_cs);
        if (tbl_cs.getColumnModel().getColumnCount() > 0) {
            tbl_cs.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbl_cs.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbl_cs.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setToolTipText("");
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consecutive Session List");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_deletecs.setBackground(new java.awt.Color(255, 0, 0));
        btn_deletecs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deletecs.setForeground(new java.awt.Color(51, 51, 51));
        btn_deletecs.setText("Delete");
        btn_deletecs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deletecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletecsActionPerformed(evt);
            }
        });

        txt_error_cs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error_cs.setForeground(new java.awt.Color(255, 51, 51));
        txt_error_cs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(btn_deletecs, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(txt_error_cs, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletecs, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error_cs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );

        jScrollPane4.setViewportView(jPanel2);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
        // TODO add your handling code here:

            if (txt_csSelectionId.getText().equals("")){
                
                txt_error_selection.setText("Select First*");
            }
            else{
                txt_error_selection.setText("");
            String selected_id = txt_csSelectionId.getText();
            showSelectedSessionNList(selected_id);
            }
    }//GEN-LAST:event_btn_selectActionPerformed

    private void tbl_csSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csSelectedMouseClicked
        // TODO add your handling code here:
        
        int i = tbl_csSelected.getSelectedRow();
        TableModel model = tbl_csSelection.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_csSelectedId.setText(model.getValueAt(i, 0).toString());
        
    }//GEN-LAST:event_tbl_csSelectedMouseClicked

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        if (txt_csSelectedId.getText().equals("")){
                
                txt_error_selection.setText("Select First*");
            }
            else{
                txt_error_selection.setText("");
        DefaultTableModel model = (DefaultTableModel)tbl_csSelected.getModel();
        model.removeRow(Integer.parseInt(txt_csSelectedId.getText())-1);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void tbl_csSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csSelectionMouseClicked
        // TODO add your handling code here:
        int i = tbl_csSelection.getSelectedRow();
        TableModel model = tbl_csSelection.getModel();
        txt_csSelectionId.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csSelectionMouseClicked

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed
        // TODO add your handling code here:
        
        try{
        DefaultTableModel model = (DefaultTableModel)tbl_csSelected.getModel();
        DefaultTableModel model2 = (DefaultTableModel)tbl_cs.getModel();
        connection = DBconnection.getConnection();
        if (tbl_csSelected.getRowCount() == 0){

                txt_error_selection.setText("Select Sessions First*");
            }
            else{
                txt_error_selection.setText("");

                TagCreator();
                
                String sessionList[] = sessID.split(",");
                boolean lock = false;
                Conseclist = getConsecutiveSessionNList();
                
                for(int x=0;x<sessionList.length;x++){
                    
                    for(int i =0;i<Conseclist.size();i++){
                         String sessionList2[] = Conseclist.get(i).getSessionID().split(",");
                         
                         for(int a=0;a<sessionList2.length;a++){
                            if(sessionList[x].equals(sessionList2[a])){
                                lock = true;
                            }
                         }
                    }
                }
                if(lock){
                    txt_error_selection.setText("This Sessions Already Exist");
                }
                else{
                    PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SP2_CONSECUTIVE_SESSION_TABLE));

                    statement.setString(1, selection_sId.getSelectedItem().toString());
                    statement.setString(2, finalTags);
                    statement.setString(3, sessID);


                    statement.executeUpdate();
                    model.setRowCount(0);
                    model2.setRowCount(0);
                    showConsecutiveSessionNList();
                    txt_id.setText("");
                    JOptionPane.showMessageDialog(null, "Inserting Successful!");
                }
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btn_setActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)tbl_csSelection.getModel();
        model.setRowCount(0);
        String sGid = selection_sId.getSelectedItem().toString();
        showSessionNList(sGid);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selection_sIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selection_sIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selection_sIdActionPerformed

    private void tbl_csMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_csMouseClicked
        // TODO add your handling code here:
        int i = tbl_cs.getSelectedRow();
        TableModel model = tbl_cs.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_csMouseClicked

    private void btn_deletecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletecsActionPerformed
        // TODO add your handling code here:
       
            try
            {
                DefaultTableModel model = (DefaultTableModel)tbl_cs.getModel();
                Statement smt = connection.createStatement();
                
                if (txt_id.getText().equals("")){

                    txt_error_cs.setText("Select First*");
                }
                else{
                    txt_error_cs.setText("");

                    String id = txt_id.getText();

                    smt.execute("DELETE FROM sp2_consecutive_session WHERE id = "+id); 
                    model.setRowCount(0);
                    showConsecutiveSessionNList();
                    txt_id.setText("");
                    JOptionPane.showMessageDialog(this, "Deleted");

                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        
    }//GEN-LAST:event_btn_deletecsActionPerformed

    public ArrayList<sessionDetails> getSessionNList(String sGid)
    {
        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from session where group_id = '"+sGid+"'";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        sessionDetails sDetails;
        while(rs.next())
        {
            sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("group_id"));
            list.add(sDetails);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showSessionNList(String sGid)
    {
        ArrayList<sessionDetails> list = getSessionNList(sGid);
        DefaultTableModel model = (DefaultTableModel)tbl_csSelection.getModel();
        Object[] row = new Object[3];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSession();
            row[2] = list.get(i).gettag();
            
            model.addRow(row);
        }
    }
    
    public ArrayList<sessionDetails> getselectedSessionNList(String id)
    {
        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from session where id = '"+id+"'";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        sessionDetails sDetails;
        while(rs.next())
        {
            sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("subgroup_id"));
            list.add(sDetails);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showSelectedSessionNList(String id)
    {
        ArrayList<sessionDetails> list = getselectedSessionNList(id);
        DefaultTableModel model = (DefaultTableModel)tbl_csSelected.getModel();
        Object[] row = new Object[3];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSession();
            row[2] = list.get(i).gettag();
            
            model.addRow(row);
        }
    }
    
    public ArrayList<ConsecutiveSession> getConsecutiveSessionNList()
    {
        ArrayList<ConsecutiveSession> list = new ArrayList<>();
        try{
        connection = DBconnection.getConnection();
        String querry = "select * from sp2_consecutive_session";
        Statement st;
        ResultSet rs;
        
        st = connection.createStatement();
        rs= st.executeQuery(querry);
        ConsecutiveSession ConsecutiveSession;
        while(rs.next())
        {
            ConsecutiveSession = new ConsecutiveSession(rs.getInt("id"), rs.getString("sGid"), rs.getString("cSession"), rs.getString("sessionID"));
            list.add(ConsecutiveSession);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showConsecutiveSessionNList()
    {
        ArrayList<ConsecutiveSession> list = getConsecutiveSessionNList();
        DefaultTableModel model = (DefaultTableModel)tbl_cs.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getSgid();
            row[2] = list.get(i).gettag();
            row[3] = list.get(i).getSessionID();
            
            model.addRow(row);
        }
    }
    
    public  void SubGroupSelection(){
        try{  
        connection = DBconnection.getConnection();
        String query = "select * from session group by group_id";
        pst = connection.prepareStatement(query);
        rs = pst.executeQuery();
        
        while(rs.next())
        {
            String Gid = rs.getString("group_id");
            if(Gid != null){
                selection_sId.addItem(Gid);
//                System.out.println(Gid);
            }
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public void TagCreator(){
        DefaultTableModel model = (DefaultTableModel)tbl_csSelected.getModel();
        int x = tbl_csSelected.getRowCount();
        String[] tags = new String[x];
        String[] newtags = new String[x];
        
                                
        newtags[0] = model.getValueAt(0, 2).toString()+','+model.getValueAt(0, 1).toString();
        sessID = model.getValueAt(0, 0).toString();
        int i = 1;
        while (x!=i){

            tags[i] = model.getValueAt(i, 2).toString()+','+model.getValueAt(i, 1).toString();
            newtags[i] = '('+newtags[i-1]+')'+','+'('+tags[i]+')';
            finalTags = newtags[i];
            sessID = sessID.concat(","+model.getValueAt(i, 0));
            i++;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deletecs;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_set;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JComboBox<String> selection_sId;
    private javax.swing.JTable tbl_cs;
    private javax.swing.JTable tbl_csSelected;
    private javax.swing.JTable tbl_csSelection;
    private javax.swing.JTextField txt_csSelectedId;
    private javax.swing.JTextField txt_csSelectionId;
    private javax.swing.JLabel txt_error_cs;
    private javax.swing.JLabel txt_error_selection;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
