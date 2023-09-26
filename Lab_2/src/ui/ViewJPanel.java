/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSignHistory;
import model.VitalSigns;

/**
 *
 * @author Snehal
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    VitalSignHistory history;
    
    public ViewJPanel(VitalSignHistory history) {
        initComponents();
        this.history = history;
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        lblPressure = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        txtPressure = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Vital Signs");

        tblVitals.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Temperature", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitals);

        viewBtn.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        lblPressure.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lblPressure.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPressure.setText("Blood Pressure:");

        lblPulse.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPulse.setText("Pulse:");

        lblDate.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDate.setText("Date:");

        txtDate.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        txtPulse.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        txtTemperature.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        txtPressure.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        lblTemperature.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTemperature.setText("Temperature:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTemperature)
                            .addComponent(lblPulse)
                            .addComponent(lblPressure)
                            .addComponent(lblDate))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPulse, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPressure, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitle)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPressure)
                    .addComponent(txtPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblVitals.getSelectedRow();
    
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
           
        }  
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedRowIndex,0) ;   
        
        txtTemperature.setText(String.valueOf(selectedVitals.getTemperature()));
        txtPressure.setText(String.valueOf(selectedVitals.getBloodPressure()));
        txtPulse.setText(String.valueOf(selectedVitals.getPulse()));
        txtDate.setText(selectedVitals.getDate());
        
        
    }//GEN-LAST:event_viewBtnActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblVitals.getSelectedRow();
    
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
           
        }  
        
        DefaultTableModel model = (DefaultTableModel) tblVitals.getModel();
        VitalSigns selectedVitals = (VitalSigns) model.getValueAt(selectedRowIndex,0) ;   
        
        history.deleteVitals(selectedVitals);
        
        JOptionPane.showMessageDialog(this, "Vital signs deleted.");
        
        populateTable();

                
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPressure;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPressure;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
    DefaultTableModel  model = (DefaultTableModel) tblVitals.getModel();    
    model.setRowCount(0);
    
    for (VitalSigns vs : history.getHistory()){
        
        Object[] row = new Object[3];
        row[0] = vs;
        row[1] = vs.getTemperature();
        row[2] = vs.getPulse();     
        
        model.addRow(row);
        
    }
    }
}