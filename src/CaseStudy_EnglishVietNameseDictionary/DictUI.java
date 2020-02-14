package CaseStudy_EnglishVietNameseDictionary;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


class DictUI extends javax.swing.JFrame {
    DicManage dicManage = new DicManage();
    Map<String,MyWord> wordList = dicManage.putMapFromFile();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit1;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btFormFile;
    private javax.swing.JButton btRefrest;
    private javax.swing.JButton btWriteFile;
    private javax.swing.JLabel dateTime;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel status;
    private javax.swing.JTextField tfWord;
    private javax.swing.JTextPane tpRead;
    // End of variables declaration//GEN-END:variables

    private DefaultListModel listModel;
    private final boolean busy = false, select = true;
    DialogAdd dlAdd = new DialogAdd();
    DialogEdit dlEdit = new DialogEdit();

    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy zzz");

    public DictUI() {
        setTitle("English-Vietnamese Dictionary");
        initComponents();
        status.setText("Ready");
        this.Init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();

        tfWord = new javax.swing.JTextField();

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        btFind = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btWriteFile = new javax.swing.JButton();
        btFormFile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpRead = new javax.swing.JTextPane();
        btExit1 = new javax.swing.JButton();
        btRefrest = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        dateTime = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);

        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5000, Short.MAX_VALUE)
        );

        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
                jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
                jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btWriteFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btFormFile, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE) // Chieu rong button
                                                        .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(btRefrest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(30, 30, 30) // khoang cach button va panel chieu ngang
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE) // Thiet lap chieu trong cho o hien thi nghia
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btFind, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) // Do cao o tim kiem
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)

                                .addComponent(btRefrest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)

                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)

                                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)

                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)

                                .addComponent(btFormFile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)

                                .addComponent(btWriteFile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)

                                .addComponent(btExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                        .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(tfWord, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)) // chieu rong o tim kiem
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        dateTime.setText("date");

        status.setText("Ready");

        jLabel1.setText("Status :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateTime)
                                        .addComponent(status)
                                        .addComponent(jLabel1))
                                .addContainerGap())
        );
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
// Set mau text trong textField Search Word
        tfWord.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        //tfWord.setForeground(new java.awt.Color(0, 0, 0));
        tfWord.setText("Search Word");
        tfWord.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWordMouseClicked(evt);
            }
        });

        tfWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfWordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfWordKeyReleased(evt);
            }
        });
// Khối su kien Selection Listener khi click chuột vào từ bất kì trong danh sách
        jList1.setForeground(new java.awt.Color(0, 0,0 )); // Set màu text trong WordList
        jList1.setModel(listModel = new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        btFind.setText("Search");
        btFind.setBackground(Color.white);
        btFind.setAlignmentY(0.8F);
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });


        btAdd.setText("Add new word");
        btAdd.setBackground(Color.white);
        btAdd.setSize(500,50);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setText("Edit");
        btEdit.setBackground(Color.white);
        btAdd.setSize(500,50);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.setBackground(Color.white);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });


        btWriteFile.setText("Export to file");
        btWriteFile.setBackground(Color.white);
        btWriteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWriteFileActionPerformed(evt);
            }
        });


        btFormFile.setText("Open file");
        btFormFile.setBackground(Color.white);
        btFormFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFormFileActionPerformed(evt);
            }
        });

        tpRead.setEditable(false);
        tpRead.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tpRead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpReadMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tpRead);

        btExit1.setText("Exit");
        btExit1.setBackground(Color.white);
        btExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExit1ActionPerformed(evt);
            }
        });


        btRefrest.setText("Update");
        btRefrest.setBackground(Color.white);
        btRefrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefrestActionPerformed(evt);
            }
        });
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWordKeyPressed
        String a = tfWord.getText();

        if (evt.getKeyCode() == 10) {
            tpRead.setText(getFind(a));
        }

    }//GEN-LAST:event_tfWordKeyPressed

    private void tfWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWordKeyReleased
        if (tfWord.getText().compareTo("") != 0) {
            if (evt.getKeyCode() != 8) {
                for (int i = 0; i < listModel.size(); i++) {
                    String str = listModel.getElementAt(i).toString();
                    str = str.toLowerCase();
                    String word = tfWord.getText();
                    word = word.toLowerCase();
                    if (str.indexOf(word) == 0) {
                        jList1.setSelectedIndex(i);
                        jList1.ensureIndexIsVisible(i);
                        tfWord.setText(listModel.getElementAt(i).toString());
                        int s = word.length();
                        int e = str.length();
                        tfWord.select(s, e);
                        tpRead.setText(getFind(jList1.getSelectedValue().toString()));
                        break;
                    }
                }
            } else {

                for (int i = 0; i < listModel.size(); i++) {
                    String str = listModel.getElementAt(i).toString();
                    String word = tfWord.getText();
                    if (str.indexOf(word) == 0) {
                        jList1.setSelectedIndex(i);
                        jList1.ensureIndexIsVisible(i);
                        tpRead.setText(getFind(jList1.getSelectedValue().toString()));
                        break;
                    }
                }

            }
        }

    }//GEN-LAST:event_tfWordKeyReleased
// Khi clich vao word trong WordList se set no hien tren TextField
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        //
        Object obj = evt.getSource();

        if (obj.equals(jList1) && !busy && select) {

            if (jList1.isSelectionEmpty()) {
                tfWord.setText("");
                tpRead.setText("");

            } else {
                String s;
                // Lay tu duoc chon trong WordList
                s = jList1.getSelectedValue().toString();
                // Hien thi tu da chon tren textField
                tfWord.setText(s);
                //Boi toan bo text duoc chon
                tfWord.selectAll();
                //Chuyen tu tim thay sang chu thuong
                tpRead.setText(getFind(s));

            }
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        //
        status.setText("Tìm Kiếm");
        tpRead.setText(getFind(tfWord.getText()));
    }//GEN-LAST:event_btFindActionPerformed

    private void tfWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWordMouseClicked
        //
        tfWord.selectAll();
        tfWord.setForeground(new java.awt.Color(50, 100, 0));
    }//GEN-LAST:event_tfWordMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        //
        dlAdd.setVisible(true);// Hien thi dialog de them tu
        dlAdd.setLocation(300, 200); // Set vi tri dialog tren man hinh
        dlAdd.tfNewWord.setText(""); // Xet cac truong la trong khi chua nhap du lieu
        dlAdd.tfNewPhonetic.setText("");
        dlAdd.tfNewMeaning.setText("");

    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        //
        if (!jList1.isSelectionEmpty()) {
            dlEdit.setVisible(true);
            dlEdit.jLabel1.setText("Bạn đang sửa từ: ");
            dlEdit.jLabel4.setText(jList1.getSelectedValue().toString());
            dlEdit.jTextField1.setText(jList1.getSelectedValue().toString());
            dlEdit.jTextField2.setText("");

        } else {
            dlEdit.setVisible(false);
            JOptionPane.showMessageDialog(null, "Không có từ được chọn");
        }


    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        //
        status.setText("Xóa Từ");


    }//GEN-LAST:event_btDeleteActionPerformed

    private void btWriteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWriteFileActionPerformed


    }//GEN-LAST:event_btWriteFileActionPerformed

    private void btFormFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFormFileActionPerformed
        //
        status.setText("Tìm File");

        JFileChooser fileChoose = new JFileChooser();
        fileChoose.setMultiSelectionEnabled(false);
        int action = fileChoose.showOpenDialog(this);


    }//GEN-LAST:event_btFormFileActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        //
        status.setText("Ready");
        jList1.clearSelection();

    }//GEN-LAST:event_jPanel2MouseClicked

    private void tpReadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpReadMouseClicked
        //
        status.setText("Ready");
        jList1.clearSelection();
    }//GEN-LAST:event_tpReadMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //
        status.setText("Ready");
        jList1.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void btExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExit1ActionPerformed
        //
        System.exit(0);
    }//GEN-LAST:event_btExit1ActionPerformed

    private void btRefrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefrestActionPerformed
        //
        listModel.clear();
        Init();
    }//GEN-LAST:event_btRefrestActionPerformed

    private String getFind(String word) {
        word = word.toLowerCase();
        if (wordList.containsKey(word)) {
            MyWord myWord = wordList.get(word);
            return  myWord.getMeaning();
        } else if (word.compareTo("") == 0) {
            tpRead.setText("");
            JOptionPane.showMessageDialog(null, "You still input word");
            return "";
        } else {
            return "Word not found";
        }
    }

    private void Init() {
        Collection<MyWord> col2 = wordList.values();
        col2.stream().forEach((myWord) -> {
            listModel.addElement(myWord.getEnglishWord());
        });
    }

}