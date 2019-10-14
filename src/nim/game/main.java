/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim.game;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random; 
import javax.swing.SwingUtilities;

public class main extends javax.swing.JFrame {

    private JLabel[][] labels = new JLabel[4][7];
    private int[] a = new int[5];
    private int currentRow,tempRowSum,focusedRow;
    
    public main() {
        initComponents();
        ImageIcon img = new ImageIcon(getClass().getResource("/icons/mummy.png"));
        setIconImage(img.getImage());
        initialifocusedRoweLabels();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setIcons();
        new_game();
        getRootPane().setDefaultButton(btn_comp_move);
        JOptionPane.showMessageDialog(null, "You can start firstly the computer by pressing \"Computer move\"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_comp_move = new javax.swing.JButton();
        lbl_info = new javax.swing.JLabel();
        btn_newGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NIM Game by Ali Huseynov");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("1");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 60, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("1");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel3.setRequestFocusEnabled(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 60, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("1");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 60, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("1");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel5.setRequestFocusEnabled(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 60, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("1");
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel6.setRequestFocusEnabled(false);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 60, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("1");
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel7.setRequestFocusEnabled(false);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 60, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("1");
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel4.setRequestFocusEnabled(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 60, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("1");
        jLabel8.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel8.setRequestFocusEnabled(false);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 60, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setText("1");
        jLabel11.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel11.setRequestFocusEnabled(false);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 60, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("1");
        jLabel12.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel12.setRequestFocusEnabled(false);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 60, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("1");
        jLabel13.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel13.setRequestFocusEnabled(false);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 60, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("1");
        jLabel14.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel14.setRequestFocusEnabled(false);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 60, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("1");
        jLabel9.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel9.setRequestFocusEnabled(false);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 60, 60));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("1");
        jLabel16.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel16.setRequestFocusEnabled(false);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 60, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("1");
        jLabel10.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel10.setMinimumSize(new java.awt.Dimension(60, 60));
        jLabel10.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel10.setRequestFocusEnabled(false);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 60, 60));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setText("1");
        jLabel15.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabel15.setRequestFocusEnabled(false);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 60, 60));

        btn_comp_move.setBackground(new java.awt.Color(102, 153, 255));
        btn_comp_move.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_comp_move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ai.png"))); // NOI18N
        btn_comp_move.setText("<html>Computer<br>&nbsp&nbsp Move</html>");
        btn_comp_move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comp_moveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_comp_move, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, 63));

        lbl_info.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_info.setText("Game Started");

        btn_newGame.setText("New Game");
        btn_newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_newGame)
                        .addGap(343, 343, 343))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_newGame)))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_comp_moveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comp_moveActionPerformed
        comp_move();
    }//GEN-LAST:event_btn_comp_moveActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        human_move(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        human_move(2);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        human_move(2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        human_move(2);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        human_move(3);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         human_move(3);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         human_move(3);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         human_move(3);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         human_move(3);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
         human_move(4);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        human_move(4);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        human_move(4);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        human_move(4);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        human_move(4);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        human_move(4);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        human_move(4);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btn_newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newGameActionPerformed
        main mn = new main();
        mn.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_newGameActionPerformed

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
       
    }//GEN-LAST:event_jLabel1FocusGained

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

    }//GEN-LAST:event_jLabel1MouseEntered

    protected void initialifocusedRoweLabels(){
        labels[0][0] = jLabel1;
        labels[1][0] = jLabel2;
        labels[1][1] = jLabel3;
        labels[1][2] = jLabel4;
        labels[2][0] = jLabel5;
        labels[2][1] = jLabel6;
        labels[2][2] = jLabel7;
        labels[2][3] = jLabel8;
        labels[2][4] = jLabel9;
        labels[3][0] = jLabel10;
        labels[3][1] = jLabel11;
        labels[3][2] = jLabel12;
        labels[3][3] = jLabel13;
        labels[3][4] = jLabel14;
        labels[3][5] = jLabel15;
        labels[3][6] = jLabel16;   
    }
    
     public void new_game() {
        a[1]=1;a[2]=3;a[3]=5;a[4]=7;
        currentRow=6;
      }
    
    protected void setIcons(){
        int x=1;
    for(int i=0;i<4;i++){
        for(int j=0;j<x;j++){
        labels[i][j].setText("");
        labels[i][j].setIcon(new ImageIcon(getClass().getResource("/icons/mummy.png")));
        }
        x+=2;
        }
    }
    
      public void human_move(int row) {
        if (a[1]+a[2]+a[3]+a[4]!=0) {
          if ((currentRow==5 || currentRow==6) && a[row]!=0) currentRow=row;
          if (currentRow==row && a[row]!=0) one_way(row,"Human");
          if (a[1]+a[2]+a[3]+a[4]==0){
              JOptionPane.showMessageDialog(null, "Ha Ha! I won as Always :)");
           lbl_info.setText("Game Over");   
          }
        }
      }
      
     public void one_way(int row,String player){
        a[row]--;
        labels[row-1][a[row]].setVisible(false);
        printInfo(row,a[row]+1,player);
     }
     
     public boolean isBalanced() {
        boolean q,r,s;
        q=(a[1] ^ a[2] ^ a[3] ^ a[4])==0;
        r=(a[1] | a[2] | a[3] | a[4])==1;
        s=q ^ r;
        return s;
      }
     
     public void m_way(int row) {
        while (a[row]<tempRowSum) {
          tempRowSum--;
          labels[row-1][tempRowSum].setVisible(false);
          printInfo(row,tempRowSum+1,"Computer");
        }
      }

     
     public void comp_move(){
          if (a[1]+a[2]+a[3]+a[4]!=0) {
          if (currentRow!=5) {
            currentRow=5;
            Random rand = new Random();
            focusedRow=rand.nextInt(4)+1;
            if (isBalanced()) {
              while (a[focusedRow]==0) focusedRow=(focusedRow % 4)+1;
              one_way(focusedRow,"Computer");
            }
            else {
              while (!isBalanced()) {
                focusedRow=(focusedRow % 4)+1;// if isn't balanced, it'll change row
                while (a[focusedRow]==0) focusedRow=(focusedRow % 4)+1;
                tempRowSum=a[focusedRow];
                while (!isBalanced() && a[focusedRow]!=0) a[focusedRow]--;
                if (!isBalanced()) a[focusedRow]=tempRowSum;
              }
              m_way(focusedRow);
            }
          }
          if (a[1]+a[2]+a[3]+a[4]==0){
              JOptionPane.showMessageDialog(null, "You Won :(");
              lbl_info.setText("Game Over");
          }
        }
     }
     
     public void printInfo(int row,int col,String player){
         String message = "<html>"+player + " has taken <br>";
         if(col==1)
             message+="1st element in "+row+" row";
         else if(col==2)
             message+="2nd element in "+row+" row";
         else if(col==3)
             message+="3rd element in "+row+" row";
         else
             message+=col+"th element in "+row+" row";
         
     lbl_info.setText(message+"</html>");
     }
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and ditempRowSumlay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comp_move;
    private javax.swing.JButton btn_newGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lbl_info;
    // End of variables declaration//GEN-END:variables
}
