/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.session;

import com.spm.timetablemanagement.models.Lecturer;
import com.spm.timetablemanagement.models.Session;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiran Harsha
 */
public class ViewSession extends javax.swing.JPanel {
    PreparedStatement statement,statement1;
    Connection connection;
    ResultSet resultSet;
    TableModel tableModel;
    DefaultTableModel dtm;
    
    Map<Integer, Lecturer> lecturerList;
    Map<Integer, Session> sessionList;
    Map<Integer, Integer> session_lecList;
    List<String> lecList ;
    String[] lecture;
    Object [] data ;
    int i = 0;
    int a = 0;
    /**
     * Creates new form ViewSession
     */
    public ViewSession() {
        initComponents();
        
        this.lecturerList = new Hashtable<>();
        this.sessionList = new Hashtable<>();
        this.session_lecList = new Hashtable<>();
        this.lecList = new ArrayList<>();
        dtm = (DefaultTableModel) jTable1.getModel();
        tableModel = jTable1.getModel();
        
        
        try {
            connection = DBconnection.getConnection();
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(ViewSession.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on connection create"+ex.getMessage(), "Data error", JOptionPane.ERROR_MESSAGE);
        }
        loadData();
        createTable();
    }

    private void createTable(){
        dtm = (DefaultTableModel) jTable1.getModel();
        
        for(Session s : sessionList.values()){
            data = new Object[10];
            
            data[0] = s.getId();
            data[1] = Arrays.toString(s.getLec());
            data[2] = s.getSub();
            data[3] = s.getSubc();
            data[4] = s.getTag();
            data[5] = s.getDuration();
            data[6] = s.getGroupID();
            data[7] = s.getSubgroupID();
            data[8] = s.getStu_count();
            data[9] = "Delete";
            
            dtm.addRow(data);
        }
    }
    
    private void loadData(){
        i = 0;
        loadLecturers();
        
        Session session ;
        
        try {
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION));
            statement1 = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_LECT_BY_ID));
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                session = new Session();
                
                session.setId(resultSet.getInt("id"));
                session.setSub(resultSet.getString("subject"));
                session.setSubc(resultSet.getString("sub_code"));
                session.setTag(resultSet.getString("tag"));
                session.setDuration(resultSet.getString("tag_duration"));
                session.setGroupID(resultSet.getString("group_id"));
                session.setSubgroupID(resultSet.getString("subgroup_id"));
                session.setStu_count(resultSet.getInt("stu_count"));
                
                sessionList.put(session.getId(), session);
            }
            resultSet.close();
            
            for(Session s : sessionList.values()){
                i =0;
                lecture = new String[10];
                statement1.setInt(1, s.getId());
                resultSet = statement1.executeQuery();
                lecList.clear();
                
                while(resultSet.next()){
                
                    lecture[i] = resultSet.getString("lec_id");
                    i++;
                }
                for(String lec : lecture){
                    if(lec != null){
                        
                        if(lecturerList.containsKey(Integer.parseInt(lec))){
                             lecList.add(lecturerList.get(Integer.parseInt(lec)).getName());
                        }
                    }
                }
                lecture = lecList.toArray(new String[lecList.size()]);
                s.setLec(lecture);
            }
            
            resultSet.close();
            statement1.close();
            statement.close();
        } catch (SQLException | ParserConfigurationException | SAXException | IOException | NumberFormatException | NullPointerException | ClassCastException ex) {
            Logger.getLogger(ViewSession.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on data Load"+ex.getMessage(), "Data error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadLecturers(){
        try {
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_LECTURER));
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Lecturer l = new Lecturer();
                
                l.setId(resultSet.getInt("id"));
                l.setName(resultSet.getString("name"));
                l.setLec_id(resultSet.getString("emp_id"));
                
                lecturerList.put(l.getId(), l);
            }
            
            statement.close();
            resultSet.close();
        } catch (ParserConfigurationException | SAXException | IOException | SQLException ex) {
            Logger.getLogger(AddSession.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(this, "Error on load lecturers data", "Data load error"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        find_sub = new javax.swing.JTextField();
        find_gID = new javax.swing.JTextField();
        find_sgID = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        find_lec = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();

        setBackground(new java.awt.Color(186, 148, 243));
        setToolTipText("");
        setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("View Sessions");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(331, 331, 331))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(186, 148, 243));
        jPanel2.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer(s)", "Subject", "Subject Code", "Tag", "Duration", "GroupID", "SubgroupID", "Student Count", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(60);
        }

        find_sub.setPreferredSize(new java.awt.Dimension(100, 30));

        find_gID.setPreferredSize(new java.awt.Dimension(100, 30));

        find_sgID.setPreferredSize(new java.awt.Dimension(100, 30));

        btn_find.setBackground(new java.awt.Color(0, 153, 204));
        btn_find.setText("Find");
        btn_find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_findMouseClicked(evt);
            }
        });
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        jLabel1.setText("Lecture Name");

        jLabel2.setText("Subject Code");

        jLabel3.setText("Group ID");

        jLabel4.setText("SubGroup ID");

        btn_reset.setBackground(new java.awt.Color(255, 193, 7));
        btn_reset.setText("Reset");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(find_lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(find_sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(find_gID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(find_sgID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_find)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {find_gID, find_lec, find_sgID, find_sub});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(find_sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find_gID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find_sgID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_find)
                    .addComponent(find_lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {find_gID, find_lec, find_sgID, find_sub});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jScrollPane2.setViewportView(jPanel2);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        
        if(col ==9){
            int result = JOptionPane.showConfirmDialog(this, "Are you sure to delete", "Delete session", JOptionPane.YES_NO_OPTION);
            
            if(result==0){
                deleteSession(row,col);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_findMouseClicked
        String gID, sgID, lec, subCode;
        Session session;
        sessionList.clear();
        boolean isLecture = false;
        
        try {
            statement1 = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_LECT_BY_ID));
            
            if(!find_gID.getText().contentEquals("")){
                gID = find_gID.getText();
                statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_BY_GROUP_ID));
                statement.setString(1, gID);
            }
            if(!find_sgID.getText().contentEquals("")){
                sgID = find_sgID.getText();
                statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_BY_SUBGROUP_ID));
                statement.setString(1, sgID);
            }
            if(!find_lec.getText().contentEquals("")){
                isLecture = true;
                
                lec = find_lec.getText();
                statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_BY_LECTURE));
                
                for(Lecturer l: lecturerList.values()){
                    
                    if(l.getName().contentEquals(lec)){
                        statement.setInt(1, l.getId());
                    }
                }
            }
            if(!find_sub.getText().contentEquals("")){
                subCode = find_sub.getText();
                statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_BY_SUBJECT_CODE));
                statement.setString(1, subCode);
            }
            
            if(isLecture){
                
                resultSet = statement.executeQuery();
               
                i = 0;
                while(resultSet.next()){
                    session_lecList.put(i, resultSet.getInt("session_id"));
                    i++;
                }
                
                statement.close();
                resultSet.close();
                statement = connection.prepareStatement(CreateQuery.getQuery(Constant.GET_SESSION_BY_SESSION_ID)); 
                
                for(Integer id : session_lecList.values()){
                    statement.setInt(1, id);
                    
                    resultSet = statement.executeQuery();
                    
                    while(resultSet.next()){
                        session = new Session();
                        
                        session.setId(resultSet.getInt("id"));
                        session.setSub(resultSet.getString("subject"));
                        session.setSubc(resultSet.getString("sub_code"));
                        session.setTag(resultSet.getString("tag"));
                        session.setDuration(resultSet.getString("tag_duration"));
                        session.setGroupID(resultSet.getString("group_id"));
                        session.setSubgroupID(resultSet.getString("subgroup_id"));
                        session.setStu_count(resultSet.getInt("stu_count"));
                        
                        sessionList.put(session.getId(), session);
                    }
                }
                
                for(Session s : sessionList.values()){
                    i =0;
                    lecture = new String[10];
                    statement1.setInt(1, s.getId());
                    resultSet = statement1.executeQuery();
                    lecList.clear();

                    while(resultSet.next()){

                        lecture[i] = resultSet.getString("lec_id");
                        i++;
                    }
                    for(String lecr : lecture){
                        if(lecr != null){

                            if(lecturerList.containsKey(Integer.parseInt(lecr))){
                                 lecList.add(lecturerList.get(Integer.parseInt(lecr)).getName());
                            }
                        }
                    }
                    lecture = lecList.toArray(new String[lecList.size()]);
                    s.setLec(lecture);
                }
            }
            else{
                resultSet = statement.executeQuery();

                while(resultSet.next()){
                    session = new Session();

                    session.setId(resultSet.getInt("id"));
                    session.setSub(resultSet.getString("subject"));
                    session.setSubc(resultSet.getString("sub_code"));
                    session.setTag(resultSet.getString("tag"));
                    session.setDuration(resultSet.getString("tag_duration"));
                    session.setGroupID(resultSet.getString("group_id"));
                    session.setSubgroupID(resultSet.getString("subgroup_id"));
                    session.setStu_count(resultSet.getInt("stu_count"));

                    sessionList.put(session.getId(), session);
                }

                resultSet.close();

                for(Session s : sessionList.values()){
                    i =0;
                    lecture = new String[10];
                    statement1.setInt(1, s.getId());
                    resultSet = statement1.executeQuery();
                    lecList.clear();

                    while(resultSet.next()){

                        lecture[i] = resultSet.getString("lec_id");
                        i++;
                    }
                    for(String lecr : lecture){
                        if(lecr != null){

                            if(lecturerList.containsKey(Integer.parseInt(lecr))){
                                 lecList.add(lecturerList.get(Integer.parseInt(lecr)).getName());
                            }
                        }
                    }
                    lecture = lecList.toArray(new String[lecList.size()]);
                    s.setLec(lecture);
                }
            }
            dtm.setRowCount(0);
            createTable();
        } catch (SQLException | ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(ViewSession.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on load data", "Data load error"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_findMouseClicked

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        find_gID.setText("");
        find_sgID.setText("");
        find_lec.setText("");
        find_sub.setText("");
        loadData();
        dtm.setRowCount(0);
        createTable();
    }//GEN-LAST:event_btn_resetMouseClicked

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_findActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_reset;
    private javax.swing.JTextField find_gID;
    private javax.swing.JTextField find_lec;
    private javax.swing.JTextField find_sgID;
    private javax.swing.JTextField find_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void deleteSession(int row, int col) {
        boolean lock = false;
        try {
            tableModel = jTable1.getModel();
            
            int sessionID =  (int) tableModel.getValueAt(row, 0);
            
            statement = connection.prepareStatement(CreateQuery.getQuery(Constant.DELETE_SESSION));
            statement1 = connection.prepareStatement(CreateQuery.getQuery(Constant.DELETE_SESSION_LECT));
            
            statement.setInt(1, sessionID);
            statement1.setInt(1, sessionID);
            
            statement.execute();
            statement1.execute();
            
            sessionList.remove(sessionID);
            
        } catch (SQLException | ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(ViewSession.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on delete session"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            lock = true;
        }
        if(!lock){
            dtm.removeRow(row);
            dtm.setRowCount(0);
            createTable();
        }
    }
}
