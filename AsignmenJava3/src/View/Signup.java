
package View;

import database.UserDao;
import static database.UserDao.Reg;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinh
 */
public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
    }
     public boolean checkemail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!Pattern.matches(regex, email)){
            JOptionPane.showMessageDialog(this, " Email không hợp lệ!");
            return false;
        }
         
        else {
            return true;
            
        }
    }
    public boolean validateSignup() {
        if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtEmail.getText().isEmpty()
                || (!rdbCBDT.isSelected() && !rdbGiangVien.isSelected())) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
            return false;
        } else {
            if(checkemail(txtEmail.getText())){
                return true;
            }
            else {               
                return false;
                
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField3 = new Swing.TextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        boder1 = new PanelBoder.Boder();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new Swing.TextField();
        txtUsername = new Swing.TextField();
        txtPassword = new Swing.TextField();
        rdbGiangVien = new javax.swing.JRadioButton();
        rdbCBDT = new javax.swing.JRadioButton();
        btnSignup = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();

        textField3.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        boder1.setMinimumSize(new java.awt.Dimension(402, 383));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel3.setText("SIGN UP");
        jLabel3.setToolTipText("");

        txtEmail.setHint("Email");

        txtUsername.setHint("Username");

        txtPassword.setHint("Password");

        buttonGroup1.add(rdbGiangVien);
        rdbGiangVien.setText("Giảng Viên");

        buttonGroup1.add(rdbCBDT);
        rdbCBDT.setText("Cán Bộ Đào Tạo");

        btnSignup.setBackground(new java.awt.Color(51, 51, 255));
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("SIGN UP");
        btnSignup.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        jLabel1.setText("Already have account? ");

        lblLogin.setBackground(new java.awt.Color(0, 51, 255));
        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 255));
        lblLogin.setText("Login here");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boder1Layout = new javax.swing.GroupLayout(boder1);
        boder1.setLayout(boder1Layout);
        boder1Layout.setHorizontalGroup(
            boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(boder1Layout.createSequentialGroup()
                .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boder1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addGroup(boder1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(rdbGiangVien, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdbCBDT)
                                .addGap(28, 28, 28))
                            .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(boder1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        boder1Layout.setVerticalGroup(
            boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boder1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCBDT)
                    .addComponent(rdbGiangVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        this.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        if (validateSignup()) {
            String role = null;
            if (rdbGiangVien.isSelected()) {
                role = "Giangvien";
            } else {
                role = "Canbodaotao";
            }
            if(UserDao.Reg(txtUsername.getText(), txtPassword.getText(), role, txtEmail.getText())){
                 JOptionPane.showMessageDialog(this, "SignUp Success");
            }
            else {
                JOptionPane.showMessageDialog(this, "Thất bại! tài khoản đã tồn tại trong hệ thống!");
            }
           
        }

    }//GEN-LAST:event_btnSignupMouseClicked

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
            
    }//GEN-LAST:event_btnSignupActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PanelBoder.Boder boder1;
    private Swing.Button btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JRadioButton rdbCBDT;
    private javax.swing.JRadioButton rdbGiangVien;
    private Swing.TextField textField3;
    private Swing.TextField txtEmail;
    private Swing.TextField txtPassword;
    private Swing.TextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
