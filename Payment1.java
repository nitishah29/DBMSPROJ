
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class Payment1 extends javax.swing.JFrame {
    static String s;
    /**
     * Creates new form Payment1
     */
    public Payment1() {
        initComponents();
         payIDDisplay.setText(uIDGenerator());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ResIDDisplay = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        payIDDisplay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Payment");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 20, 160, 44);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PaymentID:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 110, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Card Number:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 150, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name on Card:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 190, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Expiry Date:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 230, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CVV:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 270, 70, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ResID:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 310, 50, 30);

        ResIDDisplay.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ResIDDisplay);
        ResIDDisplay.setBounds(350, 310, 160, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(350, 150, 230, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(350, 190, 230, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(350, 230, 230, 30);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(350, 270, 230, 30);

        payIDDisplay.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(payIDDisplay);
        payIDDisplay.setBounds(350, 110, 160, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Total>");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 390, 100, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(650, 310, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Get ResID");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(750, 310, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LicNo:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(590, 310, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pattern:YYYY-MM-DD");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(620, 230, 140, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Please Swipe Your Card in the Counter!");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(340, 450, 280, 14);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Work\\Desktop\\Project\\wallpapers\\black_background_wood-wallpaper-960x540.jpg")); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 900, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if((jTextField1.getText().length()==0)||(jTextField2.getText().length()==0)||(jTextField3.getText().length()==0)
                ||(jTextField4.getText().length()==0))
        {
            JOptionPane.showMessageDialog(null, "Please fill all fields");
        }
        else
        {
            String cardno      = jTextField1.getText();
            String name        = jTextField2.getText();
            String expirydate  = jTextField3.getText();
            String cvv         = jTextField4.getText();
            String total,resid;
            
            String payID=uIDGenerator();
            resid = s;
            
            try {
                insertvalues(payID,cardno,name,expirydate,cvv,resid);
                TotalAmount1 ta = new TotalAmount1();
            ta.setVisible(true);
            ta.pack();
            ta.setLocationRelativeTo(null);
            ta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose(); 
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String licno  = jTextField5.getText();
        try {
            getResID(licno);// TODO add your handling code here:
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
         char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Payment1().setVisible(true);
        });
    }
    private String uIDGenerator()
    {
        String uid="1";
        int id;
        try{
            
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        PreparedStatement st = conn.prepareStatement("select * from payment order by PAYID ");
        ResultSet rs = st.executeQuery();
        if(rs.next())
        {
            
            while(rs.next())
                uid=rs.getString(1);
            id=Integer.parseInt(uid);
            id++;
            uid=String.valueOf(id);
        }
        
        }
        catch(ClassNotFoundException | SQLException e)
        {
            
        }
        return uid;
    }
    public void getResID(String licno) throws SQLException, ClassNotFoundException
    {   
        int id;
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        PreparedStatement st = conn.prepareStatement("select RESID FROM reservation WHERE LICNO = '"+licno+"' ");
        ResultSet rs = st.executeQuery();
        if (rs.next())
        {
            ResIDDisplay.setText(rs.getString(1));
            s=rs.getString(1);
            
        }
    }
    /**
     *
     * @param payID
     * @param cardno
     * @param name
     * @param expirydate
     * @param cvv
     * @param resid
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public void insertvalues(String payID,String cardno,String name,String expirydate,String cvv,String resid) throws ClassNotFoundException, SQLException
    {   System.out.println(payID+cardno+name+expirydate+cvv+resid);
        String total=null;
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@activation.acronis.com:1521:orcl","scott","tiger");
        PreparedStatement st;
        st = conn.prepareStatement("insert into payment(PAYID,CARDNO,NAMEONCARD,EXPIRYDATE,CVV,TOTALAMOUNT,RESID)values(?,?,?,?,?,?,?)");
        st.setString(1,payID);
        st.setString(2,cardno);
        st.setString(3,name);
        st.setString(4,expirydate);
        st.setString(5,cvv);
        st.setString(6,total);
        st.setString(7,resid);
        int a = st.executeUpdate();
        if(a>0)
        {
            System.out.println("Row Updated Successfully");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ResIDDisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel payIDDisplay;
    // End of variables declaration//GEN-END:variables
}
