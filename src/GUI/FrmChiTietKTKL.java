/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.ChiTietKTKLBUS;
import BUS.KhenThuongKyLuatBUS;
import BUS.NhanVienBUS;
import DTO.ChiTietKTKLDTO;
import DTO.KhenThuongKyLuatDTO;
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
public class FrmChiTietKTKL extends javax.swing.JPanel {
    ChiTietKTKLDTO ctktkldto;
    ChiTietKTKLBUS ctktklbus;
    DefaultTableModel defaultTableModel;
    public JButton btn; 
    public JDialog dialog;
    /**
     * Creates new form FrmChiTietKTKL
     */
    public FrmChiTietKTKL(JButton btn,JDialog dialog) {
        initComponents();
        this.btn = btn;
        this.dialog = dialog;
        ctktkldto = new ChiTietKTKLDTO();
        ctktklbus = new ChiTietKTKLBUS();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        dataTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã khen thưởng kỷ luật");
        defaultTableModel.addColumn("Mã nhân viên");
        setCTKTKL(ctktklbus.getChiTietKTKL());
        getAllCBB();
    }
    public void setCTKTKL(ArrayList<ChiTietKTKLDTO> CTs) {
        for (ChiTietKTKLDTO CT : CTs) {
            defaultTableModel.addRow(new Object[]{
                CT.getMaKTKL(),
                CT.getMaNV()
            });
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

        jPanel1 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel1.getWidth(), jPanel1.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel2.getWidth(), jPanel2.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        studyIDLabel = new javax.swing.JLabel();
        KTKLDeleteBtn = new javax.swing.JButton();
        KTKLAddBtn = new javax.swing.JButton();
        studyNameLabel = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        inputField = new javax.swing.JTextField();
        selectCBB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        KTKLIDCBB = new javax.swing.JComboBox<>();
        employeeCBB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(207, 24));

        jLabel1.setText("Thông tin khen thưởng kỷ luật");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 600));

        studyIDLabel.setText("Mã KTKL:");

        KTKLDeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/xoa.png"))); // NOI18N
        KTKLDeleteBtn.setText("Xóa");
        KTKLDeleteBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        KTKLDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KTKLDeleteBtnActionPerformed(evt);
            }
        });

        KTKLAddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add.png"))); // NOI18N
        KTKLAddBtn.setText("Thêm");
        KTKLAddBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        KTKLAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KTKLAddBtnActionPerformed(evt);
            }
        });

        studyNameLabel.setText("Mã nhân viên:");

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/search.png"))); // NOI18N
        searchBtn.setText("Tìm kiếm");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        inputField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        selectCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã KTKL", "Mã nhân viên" }));

        jLabel2.setText("Nhập thông tin:");

        jLabel3.setText("Chọn thông tin cần tìm:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studyNameLabel)
                            .addComponent(studyIDLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(KTKLAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(KTKLDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(employeeCBB, javax.swing.GroupLayout.Alignment.LEADING, 0, 116, Short.MAX_VALUE)
                                .addComponent(KTKLIDCBB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(selectCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(searchBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(studyIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KTKLIDCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(studyNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KTKLAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KTKLDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã KTKL", "Mã nhân viên"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/refresh.png"))); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        searchNhanVienTDHV();
    }//GEN-LAST:event_searchBtnActionPerformed

    public void setKTKLID(ArrayList<ChiTietKTKLDTO> KTKLs, String MaKTKL) {
        for (ChiTietKTKLDTO KTKL : KTKLs) {
            MaKTKL = MaKTKL.toLowerCase();
            if(KTKL.getMaKTKL().toLowerCase().equals(MaKTKL)) {
                defaultTableModel.addRow(new Object[] {
                    KTKL.getMaKTKL(),
                    KTKL.getMaNV()
                });
            }
        }
    }
    
    public void setKTKLEmployeeID(ArrayList<ChiTietKTKLDTO> KTKLs, String MaNV) {
        for (ChiTietKTKLDTO KTKL : KTKLs) {
            MaNV = MaNV.toLowerCase();
            if(KTKL.getMaNV().toLowerCase().equals(MaNV)) {
                defaultTableModel.addRow(new Object[] {
                    KTKL.getMaKTKL(),
                    KTKL.getMaNV()
                });
            }
        }
    }
    
    public void searchNhanVienTDHV() {
        String input = inputField.getText().trim();

        switch (selectCBB.getSelectedIndex()) {
            case 0 -> {
                if ("".equals(inputField.getText())) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập mã KTKL cầm tìm !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setKTKLID(ctktklbus.getChiTietKTKL(), input);
            }
            case 1 -> {
                if ("".equals(inputField.getText())) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập mã nhân viên cầm tìm !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setKTKLEmployeeID(ctktklbus.getChiTietKTKL(), input);
            }
        }
    }
    
    private void KTKLDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KTKLDeleteBtnActionPerformed
        // TODO add your handling code here:
        int row = dataTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bảng KTKL cần xóa !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không ?");

            if (confirm == JOptionPane.YES_OPTION) {
                String KTKLCode = String.valueOf(dataTable.getValueAt(row, 0));
                String employeeCode = String.valueOf(dataTable.getValueAt(row, 1));
                ctktkldto.setMaKTKL(KTKLCode);
                ctktkldto.setMaNV(employeeCode);
                ctktklbus.deleteChiTietKTKL(ctktkldto);
                defaultTableModel.setRowCount(0);
                setCTKTKL(ctktklbus.getChiTietKTKL());
            }
        }
    }//GEN-LAST:event_KTKLDeleteBtnActionPerformed

    private void KTKLAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KTKLAddBtnActionPerformed
        // TODO add your handling code here:
//        if ("".equals(KTKLIDField.getText()) || "".equals(KTKLMoneyField.getText()) || "".equals(KTKLtxtArea.getText())) {
//            JOptionPane.showMessageDialog(this, "Không được bỏ trống dữ liệu nhập vào !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        if(KTKLIDCBB.getSelectedItem() == null || employeeCBB.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống dữ liệu nhập vào !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            ctktkldto.setMaKTKL(KTKLIDCBB.getSelectedItem().toString());
            ctktkldto.setMaNV(employeeCBB.getSelectedItem().toString());

            ctktklbus.addChiTietKTKL(ctktkldto);
            JOptionPane.showMessageDialog(this, "Thêm khen thưởng kỷ luật thành công !!!");
            defaultTableModel.setRowCount(0);
            setCTKTKL(ctktklbus.getChiTietKTKL());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_KTKLAddBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        setCTKTKL(ctktklbus.getChiTietKTKL());
    }//GEN-LAST:event_refreshBtnActionPerformed
    
    public void getAllCBB(){
        //get mã KTKL
        KhenThuongKyLuatBUS ktklbus = new KhenThuongKyLuatBUS();
        ArrayList<KhenThuongKyLuatDTO> arrKTKL = ktklbus.getKhenThuongKyLuat();
        getKTKLData(arrKTKL);
        
        //get mã nhân viên
        NhanVienBUS nvbus = new NhanVienBUS();
        ArrayList<NhanVienDTO> arrNV = nvbus.getNhanVien();
        getEmployeeData(arrNV);
    }
    
    public void getKTKLData(ArrayList<KhenThuongKyLuatDTO> CBBItems){
        KTKLIDCBB.removeAllItems();
        for (KhenThuongKyLuatDTO CBBItem : CBBItems) {
            KTKLIDCBB.addItem(CBBItem.getMaKTKL());
        }
    }
    
    public void getEmployeeData(ArrayList<NhanVienDTO> CBBItems){
        employeeCBB.removeAllItems();
        for (NhanVienDTO CBBItem : CBBItems) {
            employeeCBB.addItem(CBBItem.getMaNV());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KTKLAddBtn;
    private javax.swing.JButton KTKLDeleteBtn;
    private javax.swing.JComboBox<String> KTKLIDCBB;
    private javax.swing.JTable dataTable;
    private javax.swing.JComboBox<String> employeeCBB;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> selectCBB;
    private javax.swing.JLabel studyIDLabel;
    private javax.swing.JLabel studyNameLabel;
    // End of variables declaration//GEN-END:variables
}
