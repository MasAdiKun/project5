/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;
import core.CircleO;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author masad
 */
public class Circle extends javax.swing.JFrame {
    private DefaultTableModel model;
    
    CircleO cr= new CircleO();
    /**
     * Creates new form Circle
     */
    public Circle() {
        initComponents();
        jPanel2.setVisible(false);
        this.initTable();
        l_dim.setText(cr.figures());
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
        l_dim = new javax.swing.JLabel();
        btn_perimeter = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        l_formula = new javax.swing.JLabel();
        btn_area = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        l_circle1 = new javax.swing.JLabel();
        l_result = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_histo = new javax.swing.JTable();
        l_results = new javax.swing.JLabel();
        tf_num = new javax.swing.JTextField();
        btn_result = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        l_dim.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        l_dim.setForeground(new java.awt.Color(255, 255, 255));
        l_dim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_dim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_perimeter.setBackground(new java.awt.Color(0, 51, 51));
        btn_perimeter.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_perimeter.setForeground(new java.awt.Color(255, 255, 255));
        btn_perimeter.setText("Perimeter");
        btn_perimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perimeterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Circle");

        l_formula.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        l_formula.setForeground(new java.awt.Color(255, 255, 255));
        l_formula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_formula.setText("The Formula for :");

        btn_area.setBackground(new java.awt.Color(0, 51, 51));
        btn_area.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btn_area.setForeground(new java.awt.Color(255, 255, 255));
        btn_area.setText("Area");
        btn_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_areaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 70, 70));
        jPanel2.setMaximumSize(new java.awt.Dimension(680, 135));

        l_circle1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        l_circle1.setForeground(new java.awt.Color(255, 255, 255));
        l_circle1.setText("Radius");

        l_result.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        l_result.setForeground(new java.awt.Color(255, 255, 255));

        tb_histo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        tb_histo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "History"
            }
        ));
        tb_histo.setGridColor(new java.awt.Color(0, 0, 0));
        tb_histo.setMinimumSize(new java.awt.Dimension(30, 200));
        tb_histo.setShowHorizontalLines(true);
        tb_histo.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tb_histo);

        l_results.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        l_results.setForeground(new java.awt.Color(255, 255, 255));
        l_results.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tf_num.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btn_result.setText("Count");
        btn_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resultActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_circle1)
                                    .addComponent(l_result, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addComponent(l_results, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(tf_num, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 140, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(btn_result)
                .addGap(18, 18, 18)
                .addComponent(btn_clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_circle1)
                    .addComponent(tf_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_result, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(l_results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_result)
                    .addComponent(btn_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        btn_back.setBackground(new java.awt.Color(0, 60, 60));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btn_area)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_perimeter)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(l_formula, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(l_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_dim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_formula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_area)
                    .addComponent(btn_perimeter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void initTable() {
        // Initialize Table
        model = new DefaultTableModel();
        tb_histo.setModel(model);
        // Menambahkan kolom awal pada bagian atas
        model.addColumn("Result");
    }
    private void cleanText(){
        tf_num.setText(" ");
        l_results.setText(" ");
    }
    public void cleanTable()
	{
		int row = model.getRowCount();
		for(int a=0;a<row;a++)
		{
			model.removeRow(0);
		}
	}
    public void store() {
        String s= l_results.getText();
        String result = String.valueOf(s);
        Object[] obj = new Object[]{
            result            
        };
        this.model.addRow(obj);
    }
    private void setArea(){
        double a = 0;
        a =Double.parseDouble(tf_num.getText());
        this.cr.setArea(a);
        l_results.setText(String.valueOf(this.cr.getArea()));
    }
    private void setPerimeter(){
        double a = 0;
        a =Double.parseDouble(tf_num.getText());
        this.cr.setPerimeter(a);
        l_results.setText(String.valueOf(this.cr.getPerimeter()));
    }
    private void back(){
        PlaneMain bck = new PlaneMain();
        bck.setLocationRelativeTo(null);
        bck.setVisible(true);
        this.dispose();
    }
    private void btn_perimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perimeterActionPerformed
        // TODO add your handling code here:
        l_formula.setText(cr.FormulaPerimeter());
        jPanel2.setVisible(true);
        l_result.setText("Perimeter");
        cleanText();
        cleanTable();
    }//GEN-LAST:event_btn_perimeterActionPerformed

    private void btn_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_areaActionPerformed
        // TODO add your handling code here:
        l_formula.setText(cr.FormulaArea());
        jPanel2.setVisible(true);
        l_result.setText("Area");
        cleanText();
        cleanTable();
    }//GEN-LAST:event_btn_areaActionPerformed

    private void btn_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resultActionPerformed
        // TODO add your handling code here:
        if(btn_area.isSelected()){
            setArea();
            store();

        }else {
            setPerimeter();
            store();
        }
    }//GEN-LAST:event_btn_resultActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        cleanText();
        cleanTable();

    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btn_backActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Circle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_area;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JRadioButton btn_perimeter;
    private javax.swing.JButton btn_result;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_circle1;
    private javax.swing.JLabel l_dim;
    private javax.swing.JLabel l_formula;
    private javax.swing.JLabel l_result;
    private javax.swing.JLabel l_results;
    private javax.swing.JTable tb_histo;
    private javax.swing.JTextField tf_num;
    // End of variables declaration//GEN-END:variables
}
