/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CodeComplexityCalculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Cstructure extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public Cstructure() {
        initComponents();
    }

    public int ifStatement(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 2, array, 0);
        if ((array[0] == 'i') && (array[1] == 'f')) {
            Nc = 1;

        }
        return Nc;
    }
    
    /*public int ifStatementwithop(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 2, array, 0);
        if ((array[0] == 'i') && (array[1] == 'f') && (array[2] == '&') && (array[3] == '&'))  {
            Nc = 2;

        }
        return Nc;
    }*/

    public int elseifStatement(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 6, array, 0);
        if ((array[0] == 'e') && (array[1] == 'l') && (array[2] == 's') && (array[3] == 'e') && (array[4] == 'i') && (array[5] == 'f')) {

            Nc = 2;

        }
        return Nc;
    }
    
    public int forStatement(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 3, array, 0);
        if ((array[0] == 'f') && (array[1] == '0') && (array[2] == 'r')) {

            Nc = 1;

        }
        return Nc;
    }
    
    public int whileStatement(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 5, array, 0);
        if ((array[0] == 'w') && (array[1] == 'h') && (array[2] == 'i') && (array[3] == 'l') && (array[4] == 'e')) {

            Nc = 1;

        }
        return Nc;
    }
    
    public int doStatement(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 2, array, 0);
        if ((array[0] == 'd') && (array[1] == '0')) {

            Nc = 1;

        }
        return Nc;
    }

    public int endIfStatement(String a) {

        int Ccspps = 0;
        char array[] = new char[16];
        a.getChars(0, 4, array, 0);
        if ((array[0] == 'e') && (array[1] == 'l') && (array[2] == 's') && (array[3] == 'e')) {

            Ccspps = 0;

        }
        return Ccspps;
    }

    public int switchStatement(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 6, array, 0);
        if ((array[0] == 's') && (array[1] == 'w') && (array[2] == 'i') && (array[3] == 't') && (array[4] == 'c') && (array[5] == 'h')) {

            Nc = 1;

        }
        return Nc;
    }

    public int caseStatement(String a) {

        int Nc = 0;
        char array[] = new char[16];
        a.getChars(0, 4, array, 0);
        if ((array[0] == 'c') && (array[1] == 'a') && (array[2] == 's') && (array[3] == 'e')) {

            Nc = 1;

        }
        return Nc;
    }

    /* public int nomall(String a) {
        int wtcs = 0;
        char array[] = new char[16];
        a.getChars(0, 2, array, 0);
        if ((array[0] == 'a') || (array[0] == 'b') || (array[0] == 'c') || (array[0] == 'd') || (array[0] == 'e') || (array[0] == 'f') || (array[0] == 'g') || (array[0] == 'h') || (array[0] == 'i') || (array[0] == 'j') || (array[0] == 'k') || (array[0] == 'l') || (array[0] == 'm') || (array[0] == 'n') || (array[0] == 'o') || (array[0] == 'p') || (array[0] == 'q') || (array[0] == 'r') || (array[0] == 's') || (array[0] == 't') || (array[0] == 'u') || (array[0] == 'v') || (array[0] == 'w') || (array[0] == 'x') || (array[0] == 'y') || (array[0] == 'z')) {

            wtcs = 0;

        }
        return wtcs;
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fileName1 = new javax.swing.JTextField();
        l1 = new java.awt.TextArea();
        jButton3 = new javax.swing.JButton();
        count1 = new javax.swing.JTextField();
        check3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CCC-Code Complexity Calculator");
        setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jButton3.setText("Process");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        count1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count1ActionPerformed(evt);
            }
        });

        check3.setBackground(new java.awt.Color(0, 153, 255));
        check3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        check3.setText("Calculate");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Complexity of a Program Statement due to Control Structures");

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Number Of Lines");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Choose a .java or .cpp file");

        jButton1.setText("Import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Change Weights");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("if & else-if");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("for, while, do-while");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("switch");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("case");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(136, 136, 136))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fileName1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(56, 56, 56)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fileName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName1.getText()));
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                //  String[] newString = line.split("\\s+");
                //    for(String read: newString){

                count++;
                l1.append(line + "\n");

                //  }
            }
            count1.setText(Integer.toString(count));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {

                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void count1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_count1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_count1ActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
        
         String fullCode = l1.getText();
         
        if (fullCode.isEmpty()) {

            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "You should import a Text File for the text area !");
        } 
        else {
            //String codeFirst1 = l1.replaceAll("\".*\"", ""); //remove double quotes from the code
            //l1.setText(fullCode.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "")); //remove all single and multiple comments
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName1.getText()));
            String line;
            Scanner x;
            int NCcspps = 0;
            int fCcspps = 0;
            int linesCal = Integer.parseInt(count1.getText());
            int i = 1;
            new Table().setVisible(true);
            while (i <= linesCal) {
                line = br.readLine();
                x = new Scanner(line);
                // while(x.hasNext()){

                String a = x.next();
                int no = 0;
                int wtcs = 0;
                int Ccs = 0;
                int Ccspps = 0;
                char array[] = new char[16];
                a.getChars(0, 1, array, 0);

                if ((array[0] == 'i') || (array[0] == 's') || (array[0] == 'c') || (array[0] == 'e') || (array[0] == 'f') || (array[0] == 'w') || (array[0] == 'd')) {

                    if ((array[0] == 'i') || (array[0] == 'e')) {
                        no = ifStatement(a);
                        if (no > 0) {
                           String w = jTextField2.getText();
                            wtcs = Integer.parseInt(w);
                            Ccs = (wtcs * no) + fCcspps;
                        }
                            fCcspps = Ccs;
                            if ((array[0] == 'e')) {
                                fCcspps = endIfStatement(a);
                            }
                        
                    }
                     
                    char arrayx[] = new char[16];
                    a.getChars(0, 2, arrayx, 0);
                    if ((arrayx[0] == 'c') && (arrayx[1] == 'a')) {
                        no = caseStatement(a);
                        if (no > 0) {
                            String w = jTextField4.getText();
                            wtcs = Integer.parseInt(w);
                            //wtcs = 1;
                            Ccspps = NCcspps;
                            Ccs = (wtcs * no) + Ccspps;
                        }
                    }
                    if ((arrayx[0] == 's') && (arrayx[1] == 'w')) {
                        no = switchStatement(a);
                        if (no > 0) {
                            String w = jTextField3.getText();
                            wtcs = Integer.parseInt(w);
                            //wtcs = 2;
                            Ccspps = 0;
                            Ccs = (wtcs * no) + Ccspps;
                            NCcspps = Ccs;
                        }
                    }
                    /*char arrayy[] = new char[16];
                    a.getChars(0, 3, arrayy, 0);
                     if ((arrayy[0] == 'f') && (arrayy[1] == '0') && (arrayy[2] == 'r')) {
                        no = forStatement(a);
                        if (no > 0) {
                           String w = jTextField1.getText();
                            wtcs = Integer.parseInt(w);
                            Ccspps = 0;
                            Ccs = (wtcs * no) + Ccspps;
                            NCcspps = Ccs;
                        }
                          
                        
                    }*/
                    
                } else {
                    wtcs = 0;
                    no = 0;
                    Ccs = (wtcs * no) + Ccspps;
                }

                Table.Obj1(new Object[]{line, wtcs, no, Ccspps, Ccs});

                i++;
                
            }

            //  }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {

                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }//GEN-LAST:event_check3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// Import a file
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        fileName1.setText(filename);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//clear
        fileName1.setText("");
        l1.setText("");  
        count1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Cstructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cstructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cstructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cstructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cstructure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check3;
    private javax.swing.JTextField count1;
    private javax.swing.JTextField fileName1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private java.awt.TextArea l1;
    // End of variables declaration//GEN-END:variables
}
