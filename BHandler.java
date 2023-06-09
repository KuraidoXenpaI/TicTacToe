import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonFunction implements ActionListener {

    private JButton b;
    private JButton[][] bs;
    private boolean winner = false;

    public ButtonFunction(JButton b, JButton[][] bs) {
        this.b = b;
        this.bs = bs;
    }

    public void check() {
        String[][] plays = new String[3][3];

        plays[0][0] = bs[0][0].getText();
        plays[0][1] = bs[0][1].getText();
        plays[0][2] = bs[0][2].getText();

        plays[1][0] = bs[1][0].getText();
        plays[1][1] = bs[1][1].getText();
        plays[1][2] = bs[1][2].getText();

        plays[2][0] = bs[2][0].getText();
        plays[2][1] = bs[2][1].getText();
        plays[2][2] = bs[2][2].getText();

        // Checks if X wins
        // Checks for rows for X
        if (plays[0][0].equals("X") && plays[0][1].equals("X") && plays[0][2].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        } else if (plays[1][0].equals("X") && plays[1][1].equals("X") && plays[1][2].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        } else if (plays[2][0].equals("X") && plays[2][1].equals("X") && plays[2][2].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        }
        
        // Checks for Columns for X
        if (plays[0][0].equals("X") && plays[1][0].equals("X") && plays[2][0].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        } else if (plays[0][1].equals("X") && plays[1][1].equals("X") && plays[2][1].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        } else if (plays[0][2].equals("X") && plays[1][2].equals("X") && plays[2][2].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        } 
        
        // Checks for Diagonals for X
        if (plays[0][0].equals("X") && plays[1][1].equals("X") && plays[2][2].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        } else if (plays[0][2].equals("X") && plays[1][1].equals("X") && plays[2][0].equals("X")) {
            JOptionPane.showMessageDialog(null, "X Wins");
            this.winner = true;
        }
        
        // Checks if O Wins

        // Checks for rows for O
        if (plays[0][0].equals("O") && plays[0][1].equals("O") && plays[0][2].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        } else if (plays[1][0].equals("O") && plays[1][1].equals("O") && plays[1][2].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        } else if (plays[2][0].equals("O") && plays[2][1].equals("O") && plays[2][2].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        }
        
        // Checks for Columns for O
        if (plays[0][0].equals("O") && plays[1][0].equals("O") && plays[2][0].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        } else if (plays[0][1].equals("O") && plays[1][1].equals("O") && plays[2][1].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        } else if (plays[0][2].equals("O") && plays[1][2].equals("O") && plays[2][2].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        } 
        
        // Checks for Diagonals for O
        if (plays[0][0].equals("O") && plays[1][1].equals("O") && plays[2][2].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        } else if (plays[0][2].equals("O") && plays[1][1].equals("O") && plays[2][0].equals("O")) {
            JOptionPane.showMessageDialog(null, "O Wins");
            this.winner = true;
        }

        if (this.winner) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    this.bs[x][y].setText("");
                    this.bs[x][y].setEnabled(true);
                    MainFrame.turn = 0;
                }
            }
        }

        boolean allButtonsArePressed = true;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (plays[x][y].equals("")){
                    allButtonsArePressed = false;
                }
            }
        }

        if (allButtonsArePressed && !this.winner) {
            JOptionPane.showMessageDialog(null, "Draw");
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    bs[x][y].setText("");
                    bs[x][y].setEnabled(true);
                    
                }
            }
        }

        this.winner = false;

    }

    public void actionPerformed(ActionEvent e) {
         switch (MainFrame.turn) {
             case 0:
                this.b.setText("X");
                this.b.setEnabled(false);
                MainFrame.turn = 1;
                check();
                break;

             case 1:
                this.b.setText("O");
                this.b.setEnabled(false);
                MainFrame.turn = 0;
                check();
                break;
         }
    }

}