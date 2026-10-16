package hartron.training.jp;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgentPolicyDetails extends javax.swing.JFrame {

    //step 1
    //Db connection
    Connection connection;      //global variable
    
    //dbconnection
    public Connection dbConnection(){       
        try {
        //return type void
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/testjava1", "root", "@Deep2003");
                System.out.println("Database connected!!!");

        
        } catch (SQLException ex) {
            Logger.getLogger(AgentPolicyDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    
    //constructor
    public AgentPolicyDetails() {
        initComponents();
        dbConnection();
        getAgentDetails();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCustomerName = new javax.swing.JTextField();
        txtPolicyAmount = new javax.swing.JTextField();
        comboAgent = new javax.swing.JComboBox<>();
        dtePolicy = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPolicy = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Agent Details");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Policy Date");

        jLabel6.setText("Policy Amount");

        jButton1.setText("Save Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        txtPolicyAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPolicyAmountActionPerformed(evt);
            }
        });

        comboAgent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAgentItemStateChanged(evt);
            }
        });

        tblPolicy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPolicy);
        if (tblPolicy.getColumnModel().getColumnCount() > 0) {
            tblPolicy.getColumnModel().getColumn(0).setResizable(false);
            tblPolicy.getColumnModel().getColumn(1).setResizable(false);
            tblPolicy.getColumnModel().getColumn(2).setResizable(false);
            tblPolicy.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPolicyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dtePolicy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtePolicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPolicyAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        saveDetails();
        report();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPolicyAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPolicyAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPolicyAmountActionPerformed

    private void comboAgentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAgentItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAgentItemStateChanged

    //step 2 save (insert)
    //save details
    public void saveDetails(){
        //query, prepared statement, result set, connection
        //step 1 query
        String query= "Insert into policy_details (agent_no, policy_date, customer_name, policy_amount, commission) values (?,?,?,?,?)";
    
        try {
            //prepared statement
            PreparedStatement statement= connection.prepareStatement(query);
            
            //agent no
            String agent= (String) comboAgent.getSelectedItem();
            int agentNo= Integer.parseInt(agent.split("-")[0].trim());
            statement.setInt(1, agentNo);
            
            //policy date
            java.util.Date date= (java.util.Date) dtePolicy.getDate();
            java.sql.Date sqlDate= new java.sql.Date(date.getTime());
            statement.setDate(2, sqlDate);           
            
            //customer name
            String name= txtCustomerName.getText();
            statement.setString(3, name);
            
            //policy amount
            int amount= Integer.parseInt(txtPolicyAmount.getText());
            statement.setInt(4, amount);
            
            double commission= 0.0;
            //commission
            if(amount > 10000){
                commission= amount * 0.025;
            }
            else{
                commission= amount * 0.02;
            }
            
            statement.setDouble(5, commission);

            //execute statement
            statement.execute();
            JOptionPane.showMessageDialog(comboAgent, "Data saved successfully!!!!");

        } catch (SQLException ex) {
            Logger.getLogger(AgentPolicyDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    //get agent details
    public void getAgentDetails(){
        String query= "Select agent_no, agent_name from agent_master";
        try {
            PreparedStatement statement= connection.prepareStatement(query);
            ResultSet result= statement.executeQuery();
            
            while(result.next()){
                comboAgent.addItem(result.getInt("agent_no") + "-" + result.getString("agent_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgentPolicyDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //report
    private void report(){
        DefaultTableModel model= new DefaultTableModel(new Object[]{"Agent", "Policy Date", "Policy Amount", "Commission"} , 0);
        String query= "Select agent_no, policy_date, policy_amount, commission from policy_details";
        try {
            PreparedStatement statement= connection.prepareStatement(query);
            ResultSet resultSet= statement.executeQuery();
            while (resultSet.next()) {                
                model.addRow(new Object[]{
                resultSet.getInt("agent_no"),
                resultSet.getDate("policy_date"),
                resultSet.getInt("policy_amount"),
                resultSet.getDouble("commission")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgentPolicyDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    
            tblPolicy.setModel(model);
    }
    
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
            java.util.logging.Logger.getLogger(AgentPolicyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentPolicyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentPolicyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentPolicyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentPolicyDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAgent;
    private com.toedter.calendar.JDateChooser dtePolicy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPolicy;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtPolicyAmount;
    // End of variables declaration//GEN-END:variables
}
