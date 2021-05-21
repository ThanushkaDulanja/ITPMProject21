/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.form.working_hours;

import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;


/**
 *
 * @author Tiran Harsha
 */
public class InsertWorkingHoursWD extends javax.swing.JPanel {

     private int hcount = 0;
     private int mcount = 0;
     private int numOfdays = 0; 
     private static int chk_days = 0; 
     private static boolean error = false;
     private static ArrayList<String> daysNum = new ArrayList();
     private static ArrayList<String> days = new ArrayList();
     
    /**
     * Creates new form InsertWorkingHoursWE
     */
    public InsertWorkingHoursWD() {
        initComponents();
        
       rdGroup = new ButtonGroup();
       rdGroup.add(rdb_1hour);
       rdGroup.add(rdb_30min);
       
       txt_hour.setText("0");
       txt_min.setText("0");
        execute();
    }
    
    private void execute(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_hour = new javax.swing.JTextField();
        cmb_num_of_days = new javax.swing.JComboBox<>();
        chk_mon = new javax.swing.JCheckBox();
        chk_tue = new javax.swing.JCheckBox();
        chk_wed = new javax.swing.JCheckBox();
        chk_thu = new javax.swing.JCheckBox();
        chk_fri = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        rdb_1hour = new javax.swing.JRadioButton();
        rdb_30min = new javax.swing.JRadioButton();
        btn_reset = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        txt_error = new javax.swing.JLabel();
        txt_days_error = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_min = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Number of working days");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Working days");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Working hours per day");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Time slot");

        txt_hour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_hour.setToolTipText("Number of hours");
        txt_hour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_hourMousePressed(evt);
            }
        });
        txt_hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hourActionPerformed(evt);
            }
        });
        txt_hour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_hourKeyPressed(evt);
            }
        });

        cmb_num_of_days.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_num_of_days.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        cmb_num_of_days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_num_of_daysActionPerformed(evt);
            }
        });

        chk_mon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_mon.setText("Monday");
        chk_mon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chk_monMousePressed(evt);
            }
        });

        chk_tue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_tue.setText("Tuesday");
        chk_tue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chk_tueMousePressed(evt);
            }
        });

        chk_wed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_wed.setText("Wednsday");
        chk_wed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chk_wedMousePressed(evt);
            }
        });

        chk_thu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_thu.setText("Thursday");
        chk_thu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chk_thuMousePressed(evt);
            }
        });

        chk_fri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chk_fri.setText("Friday");
        chk_fri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chk_friMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("H");

        rdb_1hour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdb_1hour.setText("1 hour");

        rdb_30min.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdb_30min.setText("30 mins");

        btn_reset.setBackground(new java.awt.Color(51, 51, 51));
        btn_reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_resetMousePressed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(0, 153, 204));
        btn_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_saveMousePressed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 0, 102));

        txt_days_error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_days_error.setForeground(new java.awt.Color(255, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insert Weekday Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(337, 337, 337))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Start Time");

        txt_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_days_error, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdb_1hour)
                                    .addComponent(btn_reset))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdb_30min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_mon)
                                    .addComponent(chk_wed)
                                    .addComponent(chk_fri)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_thu)
                                    .addComponent(chk_tue)))
                            .addComponent(cmb_num_of_days, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_num_of_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(chk_mon)
                    .addComponent(chk_tue))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_wed)
                    .addComponent(chk_thu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_days_error, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_fri))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdb_1hour)
                    .addComponent(rdb_30min))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_save))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMousePressed

        cmb_num_of_days.setSelectedIndex(0);
        uncheckAll();
        txt_hour.setText("0");
        txt_min.setText("0");
        rdGroup.clearSelection();
        chk_days = 0;
        numOfdays = 0;
        txt_days_error.setText("");
        daysNum.clear();
        days.clear();
    }//GEN-LAST:event_btn_resetMousePressed

    private void txt_hourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hourKeyPressed
        Validator.filterInt(evt, "hour", txt_error, txt_hour);
        Validator.validateLenght("hour", txt_hour, txt_min);
    }//GEN-LAST:event_txt_hourKeyPressed

    private void cmb_num_of_daysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_num_of_daysActionPerformed
         
        numOfdays = cmb_num_of_days.getSelectedIndex();
        checkDays(chk_days);
    }//GEN-LAST:event_cmb_num_of_daysActionPerformed

    private void chk_monMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_monMousePressed
        if(chk_mon.isSelected()){
            chk_days--;
            daysNum.remove("1");
        }
        else{
            chk_days++;
            daysNum.add("1");
        }
        
        checkDays(chk_days);
    }//GEN-LAST:event_chk_monMousePressed

    private void chk_tueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_tueMousePressed
        if(chk_tue.isSelected()){
            chk_days--;
            daysNum.remove("2");
        }
        else{
            chk_days++;
            daysNum.add("2");
        }
        
        checkDays(chk_days);
    }//GEN-LAST:event_chk_tueMousePressed

    
    private void checkDays(int value){
        if(value > numOfdays)
            txt_days_error.setText("Days cannot exceed number of days : " + numOfdays);
        else
            txt_days_error.setText("");
    }
    
    private boolean checkTime(){
        if(txt_hour.getText().contains(" "))
            return true;
        if(Integer.parseInt(txt_hour.getText()) > 12 || Integer.parseInt(txt_hour.getText()) == 0 ||txt_hour.getText().contains(" ") )
            return true;
        
        return false;
    }
    private void btn_saveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMousePressed
       
        int temp = 0;
        
             if(numOfdays == 0){
                  error = true;
                    JOptionPane.showMessageDialog(InsertWorkingHoursWD.this, "Select number of working days!", 
                            "Data missing",JOptionPane.ERROR_MESSAGE);
             }else
                 error = false;
             
             if(chk_days > numOfdays){
                 error = true;
                    JOptionPane.showMessageDialog(InsertWorkingHoursWD.this, "Days cannot exceed number of days : " + numOfdays, 
                            "Data missing",JOptionPane.ERROR_MESSAGE);
             }else if(chk_days < numOfdays){
                 error = true;
                    JOptionPane.showMessageDialog(InsertWorkingHoursWD.this, "Select " + (numOfdays - chk_days) + " more day(s) according to number of days" , 
                            "Data missing",JOptionPane.ERROR_MESSAGE);
             }else
                 error = false;
             
             if(checkTime()){
                 error = true;
                     JOptionPane.showMessageDialog(InsertWorkingHoursWD.this, "Invalide time", 
                            "Data missing",JOptionPane.ERROR_MESSAGE);
             }else
                 error = false;
             
             if(rdGroup.getSelection()== null){
                 error = true;
                    JOptionPane.showMessageDialog(InsertWorkingHoursWD.this, "Select time slot", 
                            "Data missing",JOptionPane.ERROR_MESSAGE);
             }else
                 error = false;
             
             if(!error){
                  try {
                Connection connection = DBconnection.getConnection();

                PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_WORKING_HOUR_TABLE));
                PreparedStatement statement2 = connection.prepareStatement(CreateQuery.getQuery(Constant.REMOVE_WORKING_HOUR_TABLE));
                PreparedStatement statement3 = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_WD_WORKING_HOUR_DAYS_TABLE));
                PreparedStatement statement4 = connection.prepareStatement(CreateQuery.getQuery(Constant.REMOVE_WORKING_HOUR_DAYS_TABLE));

                statement2.setInt(1, 1);
                statement4.setInt(1, 1);
                
                statement4.execute();
                
                if(!statement2.execute()){
                    
                    ArrayList<Integer> numbs = new ArrayList<>();
                    
                    for(String day : daysNum){
                        
                          numbs.add(Integer.parseInt(day));
                    }
                    
                    String dayList = "";
                    
                    numbs.sort(null);
                    
                    
                    for (Integer day : numbs) {
                        
                        if(day == 1){
                            dayList = dayList.concat("Monday,");
                            days.add("Monday");
                        }
                        if(day == 2){
                            dayList = dayList.concat("Tuesday,");
                            days.add("Tuesday");
                        }
                        if(day == 3){
                            dayList = dayList.concat("Wednsday,");
                            days.add("Wednsday");
                        }
                        if(day == 4){
                            dayList = dayList.concat("Thursday,");
                            days.add("Thursday");
                        }
                        if(day == 5){
                            dayList = dayList.concat("Friday,");
                            days.add("Friday");
                        }   
                    }
                    int lenght = dayList.length();
                    
                    statement.setInt(1, 1);
                    statement.setInt(2, numOfdays);
                    statement.setString(3, dayList.substring(0,lenght-1));
                    statement.setInt(4, Integer.parseInt(txt_hour.getText()));
                    statement.setFloat(5, Float.parseFloat(txt_min.getText()));

                    if(rdb_1hour.isSelected()){
                        statement.setInt(6, 1);

                    }else{
                        statement.setInt(6, 2);
                    }
                    
                      
                    statement.execute();
                    
                    for(int x = 0; x < days.size(); x++){
//                        statement3.setInt(1, x+1);
                        statement3.setString(1, days.get(x));
                        
                        statement3.execute();
                    }
                    
                     btn_resetMousePressed(null); 
                }
                } catch (SQLException | ClassNotFoundException | IOException | ParserConfigurationException | SAXException ex) {
                    Logger.getLogger(InsertWorkingHoursWD.class.getName()).log(Level.SEVERE, null, ex);
                    temp = 1;
                    JOptionPane.showMessageDialog(InsertWorkingHoursWD.this, "Data input Unsucces"+ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
                }
                  if(temp == 0){
                      btn_resetMousePressed(null);
                      JOptionPane.showMessageDialog(InsertWorkingHoursWD.this, "Data input succes");
                  }
             }
    }//GEN-LAST:event_btn_saveMousePressed

    private void chk_wedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_wedMousePressed

        if(chk_wed.isSelected()){
            chk_days--;
            daysNum.remove("3");
        }
        else{
            chk_days++;
            daysNum.add("3");
        }
        
        checkDays(chk_days);
    }//GEN-LAST:event_chk_wedMousePressed

    private void chk_thuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_thuMousePressed

        if(chk_thu.isSelected()){
            chk_days--;
            daysNum.remove("4");
        }
        else{
            chk_days++;
            daysNum.add("4");
        }
        
        checkDays(chk_days);
    }//GEN-LAST:event_chk_thuMousePressed

    private void chk_friMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_friMousePressed

        if(chk_fri.isSelected()){
            chk_days--;
            daysNum.remove("5");
        }
        else{
            chk_days++;
            daysNum.add("5");
        }
        
        checkDays(chk_days);
    }//GEN-LAST:event_chk_friMousePressed

    private void txt_hourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hourMousePressed
        txt_hour.setText("");
    }//GEN-LAST:event_txt_hourMousePressed

    private void txt_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_minMouseClicked
       txt_min.setText("");
    }//GEN-LAST:event_txt_minMouseClicked

    private void txt_hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hourActionPerformed
  
    private void uncheckAll(){
        
        chk_mon.setSelected(false);
        chk_tue.setSelected(false);
        chk_wed.setSelected(false);
        chk_thu.setSelected(false);
        chk_fri.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JCheckBox chk_fri;
    private javax.swing.JCheckBox chk_mon;
    private javax.swing.JCheckBox chk_thu;
    private javax.swing.JCheckBox chk_tue;
    private javax.swing.JCheckBox chk_wed;
    private javax.swing.JComboBox<String> cmb_num_of_days;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_1hour;
    private javax.swing.JRadioButton rdb_30min;
    private javax.swing.JLabel txt_days_error;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextField txt_hour;
    private javax.swing.JTextField txt_min;
    // End of variables declaration//GEN-END:variables
    private javax.swing.ButtonGroup rdGroup;
}
