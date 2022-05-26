/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.BangLuongBUS;
import BUS.ChucVuBUS;
import BUS.NhanVienBUS;
import BUS.PhongBanBUS;
import BUS.TrinhDoHocVanBUS;
import DAO.PhongBanDAO;
import DTO.ChucVuDTO;
import DTO.NhanVienDTO;
import DTO.PhongBanDTO;
import DTO.TrinhDoHocVanDTO;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chicu
 */
public class FrmThongKe extends javax.swing.JPanel {

    public NhanVienBUS nvbus;
    public NhanVienDTO nvdto;
    public BangLuongBUS blbus;
    public ArrayList<NhanVienDTO> arrNVDTO;
    public DefaultTableModel defaultTableModel;
    public DefaultTableModel defaultTableModel1;
    public DefaultTableModel defaultTableModel2;
    public JComboBox optionCBB = new JComboBox();
    public JComboBox monthCBB = new JComboBox();
    public JLabel thongtinlb = new JLabel("Chọn thông tin:");
    public JButton showSalaryBtn = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/show.png")));

    private void addthangnam() {
        monthCBB.removeAllItems();
        for (int i = 1; i <= 12; i++) {
            monthCBB.addItem(i);
        }
    }

    public void setDemensionOptionCBB() {
        danhMucCBB.setVisible(false);
        jLabel3.setVisible(false);
        showBtn.setVisible(false);
        infoField.setVisible(false);
        optionCBB.setVisible(true);
        optionCBB.setSize(141, 28);
        optionCBB.setLocation(danhMucCBB.getX(), danhMucCBB.getY());
        AddOptionItem();
        jPanel2.add(optionCBB);
        thongtinlb.setSize(141, 28);
        thongtinlb.setLocation(optionCBB.getX(), optionCBB.getY() + 40);
        jPanel2.add(thongtinlb);
        addthangnam();
        monthCBB.setVisible(true);
        monthCBB.setSize(141, 28);
        monthCBB.setLocation(thongtinlb.getX(), thongtinlb.getY() + 40);
        jPanel2.add(monthCBB);
        showSalaryBtn.setVisible(true);
        showSalaryBtn.setText("Xem danh sách");
        showSalaryBtn.setSize(145, 38);
        showSalaryBtn.setLocation(monthCBB.getX() + 30, monthCBB.getY() + 50);
        jPanel2.add(showSalaryBtn);
    }

    public void AddOptionItem() {
        optionCBB.removeAllItems();
        optionCBB.addItem("Chọn tháng");
        optionCBB.addItem("Xem tất cả tháng");
    }

    public FrmThongKe frmThongKe;

    public void showCBB() {
        optionCBB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (optionCBB.getSelectedIndex()) {
                    case 0:
                        thongtinlb.setVisible(true);
                        monthCBB.setVisible(true);
                        break;
                    case 1:
                        thongtinlb.setVisible(false);
                        monthCBB.setVisible(false);
                        break;
                }
            }

        });

    }

    public void SetDataMonthSalary() {
        showSalaryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (optionCBB.getSelectedIndex()) {
                    case 0: {
                        try {
                            String month = monthCBB.getSelectedItem().toString();
                            int monthValue = Integer.parseInt(month);
                            defaultTableModel1.setRowCount(0);
                            Hashtable data = blbus.getThongKeThang(monthValue);

                            Object[] key = data.keySet().toArray();

                            for (int i = 0; i < key.length; i++) {
                                defaultTableModel1.addRow(new Object[]{
                                    key[i], data.get(key[i])
                                });
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(frmThongKe, "Lương bạn vừa nhập không phải là số, vui lòng nhập đúng !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                    }
                    case 1: {
                        defaultTableModel1.setRowCount(0);
                        Hashtable data = blbus.getThongKeNam();

                        Object[] key = data.keySet().toArray();
                        double TongTien = 0;
                        for (int i = 0; i < key.length; i++) {
                            TongTien += Double.parseDouble(data.get(key[i]).toString());
                            defaultTableModel1.addRow(new Object[]{
                                key[i], data.get(key[i])
                            });
                        }
                        defaultTableModel1.addRow(new Object[]{
                            "Tổng tiền", TongTien
                        });
                        break;
                    }
                }

            }
        });
    }

    /**
     * Creates new form FrmThongKe
     */
    public FrmThongKe() {
        initComponents();
        nvbus = new NhanVienBUS();
        nvdto = new NhanVienDTO();
        blbus = new BangLuongBUS();
        arrNVDTO = new ArrayList<>();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };
        dataTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã nhân viên");
        defaultTableModel.addColumn("Tên nhân viên");

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
        jLabel2 = new javax.swing.JLabel();
        danhMucCBB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        showBtn = new javax.swing.JButton();
        infoField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel1.getWidth(), jPanel1.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel3.getWidth(), jPanel3.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        employeeLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 600));

        jLabel2.setText("Chọn danh mục:");

        danhMucCBB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã phòng ban", "Mã chức vụ", "Mã trình độ học vấn" }));

        jLabel3.setText("Nhập thông tin:");

        showBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/show.png"))); // NOI18N
        showBtn.setText("Xem danh sách");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(danhMucCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(infoField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(showBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(danhMucCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(showBtn)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(207, 24));

        jLabel1.setText("Thống kê nhân viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        employeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/icons8-user-group-skin-type-7-20.png"))); // NOI18N
        employeeLabel.setText("Nhân viên");
        employeeLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 204)));
        employeeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeLabelMouseClicked(evt);
            }
        });

        salaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/icons8-coins-20.png"))); // NOI18N
        salaryLabel.setText("<html>Lương<br> tháng</html>");
        salaryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salaryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaryLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(employeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setEmployeeDataByMaPB(ArrayList<NhanVienDTO> employees, String MaPB) {
        for (NhanVienDTO employee : employees) {
            try {
                MaPB = MaPB.toLowerCase();
                if (employee.getMaPB().toLowerCase().equals(MaPB)) {
                    defaultTableModel.addRow(new Object[]{
                        employee.getMaNV(),
                        employee.getTenNV(),});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void setEmployeeDataByMaCV(ArrayList<NhanVienDTO> employees, String MaCV) {
        for (NhanVienDTO employee : employees) {
            try {
                MaCV = MaCV.toLowerCase();
                if (employee.getMaCV().toLowerCase().equals(MaCV)) {
                    defaultTableModel.addRow(new Object[]{
                        employee.getMaNV(),
                        employee.getTenNV(),});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void setEmployeeDataByMaTDHV(ArrayList<NhanVienDTO> employees, String MaTDHV) {
        for (NhanVienDTO employee : employees) {
            try {
                MaTDHV = MaTDHV.toLowerCase();
                if (employee.getMaTDHV().toLowerCase().equals(MaTDHV)) {
                    defaultTableModel.addRow(new Object[]{
                        employee.getMaNV(),
                        employee.getTenNV(),});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:

        switch (danhMucCBB.getSelectedIndex()) {
            case 0: {
                String MaPB = infoField.getText().trim();
                if ("".equals(MaPB)) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setEmployeeDataByMaPB(nvbus.getNhanVien(), MaPB);
                break;
            }
            case 1: {
                String MaCV = infoField.getText().trim();
                if ("".equals(MaCV)) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setEmployeeDataByMaCV(nvbus.getNhanVien(), MaCV);
                break;

            }
            case 2:
                String MaTDHV = infoField.getText().trim();
                if ("".equals(MaTDHV)) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setEmployeeDataByMaTDHV(nvbus.getNhanVien(), MaTDHV);
                break;

        }
    }//GEN-LAST:event_showBtnActionPerformed

    private void salaryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryLabelMouseClicked
        // TODO add your handling code here:
        jLabel1.setText("Thống kê lương tháng");

        defaultTableModel1 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        dataTable.setModel(defaultTableModel1);
        defaultTableModel1.addColumn("Tháng");
        defaultTableModel1.addColumn("Số tiền đã chi");
        setDemensionOptionCBB();

        SetDataMonthSalary();
        showCBB();
    }//GEN-LAST:event_salaryLabelMouseClicked

    private void employeeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeLabelMouseClicked
        // TODO add your handling code here:
        jLabel1.setText("Thống kê nhân viên");
        dataTable.setModel(defaultTableModel);
        optionCBB.setVisible(false);
        monthCBB.setVisible(false);
        showSalaryBtn.setVisible(false);
        danhMucCBB.setVisible(true);
        infoField.setVisible(true);
        jLabel3.setVisible(true);
        thongtinlb.setVisible(false);
        infoField.setLocation(jLabel3.getX(), jLabel3.getY() + 30);
        showBtn.setVisible(true);
    }//GEN-LAST:event_employeeLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox danhMucCBB;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JTextField infoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables
}
