
package View;

import PanelBoder.Account;
import PanelBoder.PanelCBDT;
import PanelBoder.PanelDashboash;
import PanelBoder.PanelHelp;
import database.UserDao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinh
 */
public final class FormCBDT extends javax.swing.JFrame {
        private PanelCBDT pd;
        private PanelHelp pnhelp;
        private  Account acc;
        private String usns;
    public FormCBDT(String usname) {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        initMoving();
        ImageIcon iconExit = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\ex.png");
        ImageIcon icondb = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\db.png");
        ImageIcon iconaccount = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\account.png");
        ImageIcon iconhelp = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\help.png");
        ImageIcon iconlogout = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\logout.png");
        ImageIcon iconUser = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\icons8-user-100.png");
        jLabel4.setIcon(iconUser);
        logout.setIcon(iconlogout);
        help.setIcon(iconhelp);
        account.setIcon(iconaccount);
        dashboash.setIcon(icondb);
        panel1.setOpaque(false);
        panel2.setOpaque(false);
        panel3.setOpaque(false);
        panel4.setOpaque(false);
        btnExit.setIcon(iconExit);
        mainPanel.setLayout(new FlowLayout());
        pd = new PanelCBDT();
        pnhelp = new  PanelHelp();
        acc = new Account(usname);
        UserLogin.setText("User: "+usns);
        showDashboash();
        showdate();
        UserLogin.setText("User: "+usname);
        
        
    }
    public void showdate(){
        daynow.setText("Today: "+UserDao.getdate());
    }
    public void showDashboash() {
        mainPanel.add(pd);
        pnhelp.setVisible(false);
        acc.setVisible(false);
        pd.setVisible(true);
    }

    public void showHelp() {
        mainPanel.add(pnhelp);
        acc.setVisible(false);
        pd.setVisible(false);
        pnhelp.setVisible(true);

    }

    public void showAccount() {
        mainPanel.add(acc);
        pd.setVisible(false);
        pnhelp.setVisible(false);
        acc.setVisible(true);

    }
    
//    public void showDetail(){
//        txtID.setText(t);
//        txtName.setText(t);
//        txtTiengAnh.setText(t);
//        txtTinHoc.setText(t);
//        txtGiaoDucTC.setText(t);
//    }
    private int x;
    private int y;
        // di chuyển 
    public  void initMoving() {
        navmenu1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }
        });
        navmenu1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boder1 = new PanelBoder.Boder();
        jLabel3 = new javax.swing.JLabel();
        daynow = new javax.swing.JLabel();
        UserLogin = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnExit = new javax.swing.JLabel();
        navmenu1 = new PanelBoder.Menu();
        panel2 = new javax.swing.JPanel();
        help = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        account = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        dashboash = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        boder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("STUDENT MANAGEMENT");
        jLabel3.setToolTipText("");

        daynow.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        daynow.setText("Today: 04/07/2023");

        UserLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        UserLogin.setText("User: vinh");

        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });

        help.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        help.setForeground(new java.awt.Color(255, 255, 255));
        help.setText("HELP");
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                helpMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });

        account.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        account.setForeground(new java.awt.Color(255, 255, 255));
        account.setText("ACCOUNT");
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                accountMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(account, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
            }
        });

        dashboash.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboash.setForeground(new java.awt.Color(255, 255, 255));
        dashboash.setText("DASHBOASH");
        dashboash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboashMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboashMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashboashMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dashboashMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addComponent(dashboash, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboash, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4MouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logoutMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout navmenu1Layout = new javax.swing.GroupLayout(navmenu1);
        navmenu1.setLayout(navmenu1Layout);
        navmenu1Layout.setHorizontalGroup(
            navmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navmenu1Layout.setVerticalGroup(
            navmenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navmenu1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jLabel4.setText("icon");

        javax.swing.GroupLayout boder1Layout = new javax.swing.GroupLayout(boder1);
        boder1.setLayout(boder1Layout);
        boder1Layout.setHorizontalGroup(
            boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(boder1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jSeparator2))
            .addGroup(boder1Layout.createSequentialGroup()
                .addComponent(navmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boder1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daynow)
                            .addComponent(UserLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boder1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        boder1Layout.setVerticalGroup(
            boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boder1Layout.createSequentialGroup()
                .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boder1Layout.createSequentialGroup()
                        .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(boder1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boder1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boder1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boder1Layout.createSequentialGroup()
                                        .addGroup(boder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(boder1Layout.createSequentialGroup()
                                                .addComponent(daynow)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UserLogin)))
                                        .addGap(25, 25, 25)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(boder1Layout.createSequentialGroup()
                        .addComponent(navmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseReleased

    }//GEN-LAST:event_logoutMouseReleased

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed

    }//GEN-LAST:event_logoutMousePressed

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
                showDashboash();
    }//GEN-LAST:event_panel1MouseClicked

    private void dashboashMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboashMouseReleased

    }//GEN-LAST:event_dashboashMouseReleased

    private void dashboashMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboashMousePressed

    }//GEN-LAST:event_dashboashMousePressed

    private void dashboashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboashMouseExited

    }//GEN-LAST:event_dashboashMouseExited

    private void dashboashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboashMouseClicked
                    showDashboash();
    }//GEN-LAST:event_dashboashMouseClicked

    private void accountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseReleased

    }//GEN-LAST:event_accountMouseReleased

    private void accountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMousePressed

    }//GEN-LAST:event_accountMousePressed

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
            showHelp();
    }//GEN-LAST:event_panel2MouseClicked

    private void helpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseReleased

    }//GEN-LAST:event_helpMouseReleased

    private void helpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMousePressed

    }//GEN-LAST:event_helpMousePressed

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
            showHelp();
    }//GEN-LAST:event_helpMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        showAccount();
    }//GEN-LAST:event_accountMouseClicked

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        showAccount();
    }//GEN-LAST:event_panel3MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?");
       if(x == JOptionPane.YES_OPTION){
            this.setVisible(false);
            Login lg = new Login();
            lg.setVisible(true);
       }
    }//GEN-LAST:event_logoutMouseClicked

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
         int x = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?");
       if(x == JOptionPane.YES_OPTION){
            this.setVisible(false);
            Login lg = new Login();
            lg.setVisible(true);
       }
    }//GEN-LAST:event_panel4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCBDT formCBDT = new FormCBDT("Not Login");
                formCBDT.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserLogin;
    private javax.swing.JLabel account;
    private PanelBoder.Boder boder1;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel dashboash;
    private javax.swing.JLabel daynow;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel mainPanel;
    private PanelBoder.Menu navmenu1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    // End of variables declaration//GEN-END:variables
}
