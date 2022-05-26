/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chicu
 */
public class FrmTimChucVu extends javax.swing.JPanel {

    NhanVienBUS nvbus = new NhanVienBUS();
    DefaultTableModel defaultTableModel;

    /**
     * Creates new form FrmTimChucVu
     */
    public FrmTimChucVu() {
        initComponents();
    }

    private JButton btn;
    private JDialog dialog;

    public FrmTimChucVu(JButton btn, JDialog dialog) {
        initComponents();
        this.btn = btn;
        this.dialog = dialog;

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        dataTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã nhân viên");
        defaultTableModel.addColumn("Tên nhân viên");
        defaultTableModel.addColumn("Mã chức vụ");
        setEmployeeData(nvbus.getNhanVien());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel2.getWidth(), jPanel2.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        rankNameLabel = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        employeeLabel = new javax.swing.JLabel();
        virtualLabel = new javax.swing.JLabel();
        searchBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selectCBB = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel3.getWidth(), jPanel3.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 600));

        employeeLabel.setText("Nhập thông tin tìm kiếm:");

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/buttonsearch.png"))); // NOI18N
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        jLabel4.setText("Chọn chế độ tìm:");

        selectCBB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã nhân viên", "Tên nhân viên" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeLabel)
                            .addComponent(rankNameLabel)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(virtualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(selectCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rankNameLabel)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(employeeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(virtualLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel3.setPreferredSize(new java.awt.Dimension(207, 24));

        jLabel2.setText("Thông tin chức vụ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        dataTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dataTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(dataTable);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/refresh.png"))); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setEmployeeData(ArrayList<NhanVienDTO> employees) {
        for (NhanVienDTO employee : employees) {
            defaultTableModel.addRow(new Object[]{
                employee.getMaNV(),
                employee.getTenNV(),
                employee.getMaCV()
            });
        }
    }

    public void setEmployeeDataByID(ArrayList<NhanVienDTO> employees, String MaNV) {
        for (NhanVienDTO employee : employees) {
            MaNV = MaNV.toLowerCase();
            if (employee.getMaNV().toLowerCase().equals(MaNV)) {
                defaultTableModel.addRow(new Object[]{
                    employee.getMaNV(),
                    employee.getTenNV(),
                    employee.getMaCV()
                });
            }
        }
    }

    public void setEmployeeDataByName(ArrayList<NhanVienDTO> employees, String TenNV) {
        for (NhanVienDTO employee : employees) {
            TenNV = TenNV.toLowerCase();
            if (employee.getTenNV().toLowerCase().contains(TenNV)) {
                defaultTableModel.addRow(new Object[]{
                    employee.getMaNV(),
                    employee.getTenNV(),
                    employee.getMaCV()
                });
            }
        }
    }

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        searchNhanVienCV();
    }//GEN-LAST:event_searchBtnMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        setEmployeeData(nvbus.getNhanVien());
    }//GEN-LAST:event_jButton2ActionPerformed

    public void searchNhanVienCV() {
        String input = inputField.getText().trim();

        switch (selectCBB.getSelectedIndex()) {
            case 0 -> {
                if ("".equals(inputField.getText())) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên cầm tìm !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setEmployeeDataByID(nvbus.getNhanVien(), input);
            }
            case 1 -> {
                if ("".equals(inputField.getText())) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập tên nhân viên cầm tìm !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
//                setEmployeeDataByName(nvbus.getNhanVienByName(input), input);
                setEmployeeDataByName(nvbus.getNhanVien(), input);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JTextField inputField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rankNameLabel;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JComboBox selectCBB;
    private javax.swing.JLabel virtualLabel;
    // End of variables declaration//GEN-END:variables
}
