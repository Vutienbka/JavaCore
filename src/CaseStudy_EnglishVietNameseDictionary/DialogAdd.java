package CaseStudy_EnglishVietNameseDictionary;

import javax.swing.JOptionPane;

public class DialogAdd extends javax.swing.JFrame {
    DicManage dicManage = new DicManage();
    MyWord myWord;
    FileIO fileIO;
    DictGui dictGui;
    /**
     * Creates new form DialogAdd
     */
    public DialogAdd() {
        initComponents();
        setTitle("Input");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNewWord = new javax.swing.JLabel();
        lbNewPhonetic = new javax.swing.JLabel();
        lbNewMeaning = new javax.swing.JLabel();

        tfNewWord = new javax.swing.JTextField();
        tfNewPhonetic = new javax.swing.JTextField();
        tfNewMeaning = new javax.swing.JTextField();

        btAdd = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNewWord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNewWord.setForeground(new java.awt.Color(51, 102, 255));
        lbNewWord.setText("New Word");

        lbNewPhonetic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNewPhonetic.setForeground(new java.awt.Color(51, 102, 255));
        lbNewPhonetic.setText("Phonetic");

        lbNewMeaning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNewMeaning.setForeground(new java.awt.Color(51, 102, 255));
        lbNewMeaning.setText("Meaning");

        tfNewWord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNewWord.setForeground(new java.awt.Color(153, 0, 153));

        tfNewPhonetic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNewPhonetic.setForeground(new java.awt.Color(153, 0, 153));

        tfNewMeaning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNewMeaning.setForeground(new java.awt.Color(153, 0, 153));

        btAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btAdd.setForeground(new java.awt.Color(102, 102, 255));
        btAdd.setText("Add");

        btAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddMouseClicked(evt);
            }
        });

        btCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCancel.setForeground(new java.awt.Color(255, 51, 51));
        btCancel.setText("Cancel");

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
                                        .addComponent(lbNewPhonetic, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                        .addComponent(lbNewMeaning, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfNewWord)
                                        .addComponent(tfNewPhonetic)
                                        .addComponent(tfNewMeaning))
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
                                        .addComponent(lbNewPhonetic)
                                        .addComponent(tfNewPhonetic, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNewMeaning)
                                        .addComponent(tfNewMeaning, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddMouseClicked(java.awt.event.MouseEvent evt)  {//GEN-FIRST:event_btAddMouseClicked
        // TODO add your handling code here:
        myWord = new MyWord();
        fileIO = new FileIO();
        this.setVisible(false);
        int check;
        String word = tfNewWord.getText(); // Lay text trong textField
        String phonetic = tfNewPhonetic.getText();
        String meaning = tfNewMeaning.getText();
        check = dicManage.addNewWord(word, phonetic,meaning);
        if(check==dicManage.EXIST)
            JOptionPane.showMessageDialog(null, "The word existed");
        else if(check == dicManage.NULL)
            JOptionPane.showMessageDialog(null, "text Field still empty");
        else
        {
            JOptionPane.showMessageDialog(null, "Add successful");
        }

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

    private javax.swing.JLabel lbNewWord;
    private javax.swing.JLabel lbNewPhonetic;
    private javax.swing.JLabel lbNewMeaning;

    public javax.swing.JTextField tfNewWord;
    public javax.swing.JTextField tfNewPhonetic;
    public javax.swing.JTextField tfNewMeaning;
    // End of variables declaration//GEN-END:variables
}