package GUI;

import java.util.Calendar;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class FrmCalendar extends javax.swing.JPanel {

    private JTextField txt;
    private JDialog dialog;

    private void addthangnam() {
        for (int i = 1; i <= 12; i++) {
            cbbthang.addItem(i);
        }
        Calendar calendar = Calendar.getInstance();
        for (int i = 1950; i <= calendar.get(Calendar.YEAR); i++) {
            cbbnam.addItem(i);
        }
    }

    private void addngay() {
        cbbngay.removeAllItems();
        for (int i = 1; i <= maxngay(); i++) {
            cbbngay.addItem(i);
        }
    }

    private int maxngay() {
        int thang = Integer.parseInt(String.valueOf(cbbthang.getSelectedItem()));
        int nam = Integer.parseInt(String.valueOf(cbbthang.getSelectedItem()));
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (nam % 4 == 0) {
                    return 29;
                }
                return 28;
        }
        return 0;
    }

    private void layngaythangnam(String ngaysinh) {
        try {
            String[] arrstr = ngaysinh.split("/");
            cbbthang.setSelectedIndex(Integer.parseInt(arrstr[1].trim()) - 1);
            cbbnam.setSelectedIndex(Integer.parseInt(arrstr[2].trim()) - 1950);
            addngay();
            cbbngay.setSelectedIndex(Integer.parseInt(arrstr[0].trim()) - 1);
        } catch (Exception ex) {

        }
    }

    public FrmCalendar() {
        initComponents();
    }

    public FrmCalendar(JTextField txt, JDialog dialog) {
        initComponents();
        this.txt = txt;
        addthangnam();
        layngaythangnam(txt.getText().trim());
        this.dialog = dialog;
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
        jButton1 = new javax.swing.JButton();
        cbbnam = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbbthang = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbbngay = new javax.swing.JComboBox();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbbnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbnamActionPerformed(evt);
            }
        });

        jLabel3.setText("Năm");

        cbbthang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbthangActionPerformed(evt);
            }
        });

        jLabel2.setText("Tháng");

        jLabel1.setText("Ngày");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(cbbngay, 0, 84, Short.MAX_VALUE)
                    .addComponent(cbbthang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbnam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbthang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str = String.valueOf(cbbngay.getSelectedItem()) + "/" + String.valueOf(cbbthang.getSelectedItem()) + "/" + String.valueOf(cbbnam.getSelectedItem());
        txt.setText(str);
        dialog.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbbnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbnamActionPerformed
        addngay();
    }//GEN-LAST:event_cbbnamActionPerformed

    private void cbbthangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbthangActionPerformed
        addngay();
    }//GEN-LAST:event_cbbthangActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbbnam;
    private javax.swing.JComboBox cbbngay;
    private javax.swing.JComboBox cbbthang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}