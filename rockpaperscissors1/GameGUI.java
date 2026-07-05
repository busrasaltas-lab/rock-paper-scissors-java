
package rockpaperscissors1;
import javax.swing.JOptionPane;
public class GameGUI extends javax.swing.JFrame {
   int userScore = 0;
   int computerScore = 0;
   int currentRound=0;
   java.util.Random random = new java.util.Random();
   
   private int getComputerChoice(int userChoice) {
    String level = cmbDifficulty.getSelectedItem().toString();

      switch(level) {
        case "Easy":
            return random.nextInt(3);  

        case "Medium":
            return (int)(Math.abs(Math.sin(System.currentTimeMillis())) * 3);

        case "Hard":
            return (userChoice + 1) % 3; 
    }
     return 0;
}
  private void playGame(int userChoice) {
      
      int totalRounds = Integer.parseInt(cmbRounds.getSelectedItem().toString());
    
      int computerChoice = getComputerChoice(userChoice);
      String[] choices = {"Rock", "Paper", "Scissors"};

    lblComputerChoice.setText("Computer Choice: " + choices[computerChoice]);

    if(userChoice == computerChoice){
        lblResult.setText("Result: Draw");
    }
    else if((userChoice==0 && computerChoice==2) ||
            (userChoice==1 && computerChoice==0) ||
            (userChoice==2 && computerChoice==1)){
        lblResult.setText("Result: You Win!");
        userScore++;
    }
    else {
        lblResult.setText("Result: Computer Wins!");
        computerScore++;
    }
    lblScore.setText("Score: You " + userScore + " - " + computerScore + " Computer");
    
    currentRound++;
     if(currentRound >= totalRounds){
     JOptionPane.showMessageDialog(this, "Game over! Final score: You " + userScore + " - " + computerScore + " Computer");
     
    currentRound = 0;
    userScore = 0;
    computerScore = 0;
   }
}
     public GameGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbDifficulty = new javax.swing.JComboBox<>();
        btnPaper = new javax.swing.JButton();
        btnScissors = new javax.swing.JButton();
        lblComputerChoice = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        cmbRounds = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnRock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbDifficulty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbDifficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Difficulty:", "Easy", "Medium", "Hard " }));
        cmbDifficulty.setOpaque(true);

        btnPaper.setBackground(java.awt.Color.lightGray);
        btnPaper.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPaper.setText("Paper");
        btnPaper.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPaper.setPreferredSize(new java.awt.Dimension(100, 40));
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });

        btnScissors.setBackground(java.awt.Color.lightGray);
        btnScissors.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnScissors.setText("Scissors");
        btnScissors.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnScissors.setPreferredSize(new java.awt.Dimension(100, 40));
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });

        lblComputerChoice.setBackground(new java.awt.Color(255, 204, 204));
        lblComputerChoice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblComputerChoice.setText("Computer Choice:");
        lblComputerChoice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblComputerChoice.setOpaque(true);

        lblResult.setBackground(new java.awt.Color(255, 204, 204));
        lblResult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResult.setText("Result:");
        lblResult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblResult.setOpaque(true);

        lblScore.setBackground(new java.awt.Color(255, 204, 204));
        lblScore.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblScore.setText("Score:");
        lblScore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblScore.setOpaque(true);

        cmbRounds.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbRounds.setForeground(new java.awt.Color(51, 51, 51));
        cmbRounds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select numbers of round:", "1", "2", "3", "4", "5" }));
        cmbRounds.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("Rock Paper Scissors Game");

        btnRock.setBackground(java.awt.Color.lightGray);
        btnRock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRock.setText("Rock");
        btnRock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRock.setOpaque(true);
        btnRock.setPreferredSize(new java.awt.Dimension(100, 40));
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbRounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnPaper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnScissors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblComputerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPaper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnScissors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComputerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        playGame(1);
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        playGame(2);
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        playGame(0);
    }//GEN-LAST:event_btnRockActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JComboBox<String> cmbDifficulty;
    private javax.swing.JComboBox<String> cmbRounds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblComputerChoice;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
