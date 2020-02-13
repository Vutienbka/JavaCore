package CaseStudy_EnglishVietNameseDictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author YukiNoHana
 */

public class DialogAdd extends javax.swing.JFrame {

    /**
     * Creates new form DialogAdd
     */
    public DialogAdd() {
        initComponents();
        setTitle("Thêm Từ");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        tfNewWord.setText("");
        tfNewRead.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNewWord = new javax.swing.JLabel();
        lbNewRead = new javax.swing.JLabel();
        tfNewWord = new javax.swing.JTextField();
        tfNewRead = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNewWord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNewWord.setForeground(new java.awt.Color(51, 102, 255));
        lbNewWord.setText("Từ Mới");

        lbNewRead.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNewRead.setForeground(new java.awt.Color(51, 102, 255));
        lbNewRead.setText("Cách đọc");

        tfNewWord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNewWord.setForeground(new java.awt.Color(153, 0, 153));

        tfNewRead.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNewRead.setForeground(new java.awt.Color(153, 0, 153));

        btAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btAdd.setForeground(new java.awt.Color(102, 102, 255));
        btAdd.setText("Thêm Từ");
        btAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddMouseClicked(evt);
            }
        });

        btCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCancel.setForeground(new java.awt.Color(255, 51, 51));
        btCancel.setText("Hủy");
        btCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbNewWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbNewRead, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfNewWord)
                                        .addComponent(tfNewRead))
                                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfNewWord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbNewWord))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNewRead)
                                        .addComponent(tfNewRead, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        int check;
        String word = tfNewWord.getText();
        String read = tfNewRead.getText();

    }//GEN-LAST:event_btAddMouseClicked

    private void btCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btCancelMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JLabel lbNewRead;
    private javax.swing.JLabel lbNewWord;
    public javax.swing.JTextField tfNewRead;
    public javax.swing.JTextField tfNewWord;
    // End of variables declaration//GEN-END:variables
}