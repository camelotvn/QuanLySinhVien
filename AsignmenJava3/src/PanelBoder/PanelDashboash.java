/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelBoder;

import Swing.TableCustom;
import database.GradeDao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Grade;

/**
 *
 * @author Vinh
 */
public class PanelDashboash extends javax.swing.JPanel {

    DefaultTableModel tblModel = new DefaultTableModel();
    ArrayList<Grade> ListSV = new ArrayList<>();
    public PanelDashboash() {
        initComponents();
        initTable();
        setOpaque(false);
        desIcon();
        table.setBackground(Color.WHITE);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        fillTable();
        setVisible(true);
    }

    public void desIcon() {
        ImageIcon iconprev = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\prev.png");
        ImageIcon iconnext = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\nextbtn.png");
        ImageIcon iconfirst = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\Firstbtn.png");
        ImageIcon iconlast = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\endbtn.png");
        ImageIcon gpa = new ImageIcon("C:\\Users\\Vinh\\Documents\\NetBeansProjects\\asm\\src\\main\\java\\icon\\icons8-ball-point-pen-50.png");
        gpas.setIcon(gpa);
        btnFirst.setIcon(iconfirst);
        btnPrev.setIcon(iconprev);
        btnNext.setIcon(iconnext);
        btnLast.setIcon(iconlast);

    }

    public void initTable() {
        tblModel.setColumnIdentifiers(new String[]{"ID", "Name", "Tiếng Anh", "Tin Học", "GDTC", "GPA"});
        table.setModel(tblModel);
    }

    public void fillTable() {
        tblModel.setRowCount(0);
        ListSV = GradeDao.ShowData();
      for(Grade grde : ListSV){
          double gpa = (grde.getTiengAnh()+grde.getTinHoc()+grde.getGDTC())/3.0;
          double round = Math.round(gpa * 100.0) / 100.0;
          Object[] rows = new Object[]{grde.getMaSV(), grde.getTenSV(), grde.getTiengAnh(), grde.getTinHoc(),grde.getGDTC(),round};
          tblModel.addRow(rows);
      }
    }
        public void fillForm(int index){
            txtID.setText(String.valueOf(ListSV.get(index).getMaSV()));
            txtName.setText(ListSV.get(index).getTenSV());
            txtTiengAnh.setText(String.valueOf(ListSV.get(index).getTiengAnh()));
            txtTinHoc.setText(String.valueOf(ListSV.get(index).getTinHoc()));
            txtGiaoDucTC.setText(String.valueOf(ListSV.get(index).getGDTC()));
            double tiengAnh = Double.parseDouble(txtTiengAnh.getText());
            double tinHoc = Double.parseDouble(txtTinHoc.getText());
            double giaoDucTC = Double.parseDouble(txtGiaoDucTC.getText());
            double gpa = (tiengAnh + tinHoc + giaoDucTC) / 3;
            double round = Math.round(gpa * 100.0) / 100.0;
            lblGPA.setText(String.valueOf(round));
        
    }
    public void FindSV(String Masv){
        for(int i =0;i<ListSV.size();i++){
            if(ListSV.get(i).getMaSV().equalsIgnoreCase(Masv)){
                fillForm(i);
                nav(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có mã: "+Masv);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDashboash = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTiengAnh = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTinHoc = new javax.swing.JTextField();
        txtGiaoDucTC = new javax.swing.JTextField();
        btnReset = new Swing.Button();
        btnUpdate = new Swing.Button();
        gpas = new javax.swing.JLabel();
        lblGPA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtFind = new Swing.TextField();
        btnSearch = new Swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnFirst = new javax.swing.JLabel();
        btnPrev = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();
        btnLast = new javax.swing.JLabel();

        PanelDashboash.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tiếng Anh:");

        txtTiengAnh.setBackground(new java.awt.Color(240, 239, 239));
        txtTiengAnh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTiengAnh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiengAnh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtID.setBackground(new java.awt.Color(240, 239, 239));
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("ID:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Name:");

        txtName.setBackground(new java.awt.Color(240, 239, 239));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Giáo Dục TC:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tin Học:");

        txtTinHoc.setBackground(new java.awt.Color(240, 239, 239));
        txtTinHoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTinHoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTinHoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtGiaoDucTC.setBackground(new java.awt.Color(240, 239, 239));
        txtGiaoDucTC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtGiaoDucTC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGiaoDucTC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnReset.setBackground(new java.awt.Color(0, 153, 0));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetMouseExited(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUpdateMouseReleased(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        gpas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        gpas.setText("GPA:");

        lblGPA.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblGPA.setText("10.0");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtFind.setHint("Mã Sinh Viên");

        btnSearch.setBackground(new java.awt.Color(51, 51, 255));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFirstMouseClicked(evt);
            }
        });

        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevMouseClicked(evt);
            }
        });

        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(255, 255, 255));
        btnLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLastMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelDashboashLayout = new javax.swing.GroupLayout(PanelDashboash);
        PanelDashboash.setLayout(PanelDashboashLayout);
        PanelDashboashLayout.setHorizontalGroup(
            PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboashLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDashboashLayout.createSequentialGroup()
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelDashboashLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(9, 9, 9)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelDashboashLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtGiaoDucTC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelDashboashLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(txtTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(gpas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGPA)))
                .addGap(57, 57, 57))
            .addGroup(PanelDashboashLayout.createSequentialGroup()
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDashboashLayout.setVerticalGroup(
            PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboashLayout.createSequentialGroup()
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaoDucTC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDashboashLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGPA))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelDashboashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelDashboash, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDashboash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents
     public boolean checktable() {
        if (tblModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập sinh viên!");
            return false;
        }
        return true;

    }
     public boolean checkscore( int tienganh,int gdtc,int tinhoc){
          if(tienganh<0 || tienganh >10 ||gdtc<0 || gdtc >10 ||tinhoc<0 || tinhoc >10 ){
              JOptionPane.showMessageDialog(this, "Điểm chỉ được nhập từ 1-10");
              return false;
          }
          else {
              return true;
          }
          
     }
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        btnReset.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseExited
        btnReset.setBackground(new Color(0, 152, 0));
    }//GEN-LAST:event_btnResetMouseExited

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtID.setText(null);
        txtName.setText(null);
        txtTinHoc.setText(null);
        txtTiengAnh.setText(null);
        txtGiaoDucTC.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(0, 152, 0));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed

    }//GEN-LAST:event_btnUpdateMousePressed

    private void btnUpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseReleased

    }//GEN-LAST:event_btnUpdateMouseReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
        fillForm(index);
    }//GEN-LAST:event_tableMouseClicked
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int tienganh = Integer.parseInt(txtTiengAnh.getText());
        int gdtc = Integer.parseInt(txtGiaoDucTC.getText());
        int tinhoc =  Integer.parseInt(txtTinHoc.getText());
        String MaSV = txtID.getText();
        if(checkscore(tienganh, gdtc, tinhoc)){
            if(GradeDao.update(MaSV, tienganh, tinhoc, gdtc)){
            JOptionPane.showMessageDialog(this, "Update thành công!");
            fillTable();
        }
            else {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi!");
            }
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtFind.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sinh viên để tìm kiếm!");
        }
        else {
            String masv = txtFind.getText();
        FindSV(masv);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseClicked
         if (checktable()) {
            int index = 0;
            nav(index);
        }
    }//GEN-LAST:event_btnFirstMouseClicked

    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        if (checktable()) {
            int index = table.getSelectedRow();
            if (checktable()) {
                if (index == 0 || index == -1) {
                    index = ListSV.size() - 1;
                } else {
                    index--;
                }
                nav(index);
            }
        }
    }//GEN-LAST:event_btnPrevMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        if (checktable()) {
            int index = table.getSelectedRow();
            if (index == ListSV.size() - 1) {
                index = 0;
            } else {
                index++;
            }
            nav(index);
        }
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnLastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseClicked
         if (checktable()) {
            int index = ListSV.size() - 1;
            nav(index);
        }
    }//GEN-LAST:event_btnLastMouseClicked
    public void nav(int index){
        table.setRowSelectionInterval(index, index);
        fillForm(index);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDashboash;
    private javax.swing.JLabel btnFirst;
    private javax.swing.JLabel btnLast;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnPrev;
    private Swing.Button btnReset;
    private Swing.Button btnSearch;
    private Swing.Button btnUpdate;
    private javax.swing.JLabel gpas;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGPA;
    private javax.swing.JTable table;
    private Swing.TextField txtFind;
    private javax.swing.JTextField txtGiaoDucTC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTiengAnh;
    private javax.swing.JTextField txtTinHoc;
    // End of variables declaration//GEN-END:variables
}
