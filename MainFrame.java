import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame {

    private JButton[][] bs;

    private JButton b1, b2, b3,
                    b4, b5, b6,
                    b7, b8, b9;

    private Container c;

    public static int turn = 0;

    public MainFrame() {

        c = getContentPane();
        c.setLayout(new GridLayout(3, 3));

        // First Row
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();

        // Second Row
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();

        // Third Row
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();

        bs = new JButton[3][3];

        // First Row in Array
        bs[0][0] = b1;
        bs[0][1] = b2;
        bs[0][2] = b3;

        // Second Row in Array
        bs[1][0] = b4;
        bs[1][1] = b5;
        bs[1][2] = b6;

        // Thir Row in Array
        bs[2][0] = b7;
        bs[2][1] = b8;
        bs[2][2] = b9;

        b1.addActionListener(new ButtonFunction(b1, bs));
        b2.addActionListener(new ButtonFunction(b2, bs));
        b3.addActionListener(new ButtonFunction(b3, bs));

        b4.addActionListener(new ButtonFunction(b4, bs));
        b5.addActionListener(new ButtonFunction(b5, bs));
        b6.addActionListener(new ButtonFunction(b6, bs));

        b7.addActionListener(new ButtonFunction(b7, bs));
        b8.addActionListener(new ButtonFunction(b8, bs));
        b9.addActionListener(new ButtonFunction(b9, bs));

        // Add first row buttons
        c.add(b1);
        c.add(b2);
        c.add(b3);

        // Add second row buttons
        c.add(b4);
        c.add(b5);
        c.add(b6);

        // Add third row buttons
        c.add(b7);
        c.add(b8);
        c.add(b9);

        setSize(600, 600);
        setTitle("TicTacToe");
        setLocation(150, 300);
        setVisible(true);
        setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
    }
}

