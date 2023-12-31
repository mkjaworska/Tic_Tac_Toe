import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel button_panel = new JPanel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    TicTacToe() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tic Tac Toe");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255, 229, 236));
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(255, 229, 236));
        button_panel.setVisible(true);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Serif", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        frame.add(button_panel);

        firstTurn();


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i = 0; i < buttons.length; i++) {

            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(111, 160, 251));
                        buttons[i].setText("X");
                        player1_turn = false;
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(248, 63, 106));
                        buttons[i].setText("O");
                        player1_turn = true;
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {
        if(random.nextInt(2) == 0) {
            player1_turn = true;
        } else {
            player1_turn = false;
        }
    }
    public void check() {
        //check X win conditions
        if (
                (buttons[0].getText() == "X") &&
                (buttons[1].getText() == "X") &&
                        (buttons[2].getText() == "X")) {
            xWins(0,1,2);
        }
        if (
                (buttons[3].getText() == "X") &&
                        (buttons[4].getText() == "X") &&
                        (buttons[5].getText() == "X")) {
            xWins(3,4,5);
        }
        if (
                (buttons[6].getText() == "X") &&
                        (buttons[7].getText() == "X") &&
                        (buttons[8].getText() == "X")) {
            xWins(6,7,8);
        }
        if ( 
                (buttons[0].getText() == "X") &&
                        (buttons[3].getText() == "X") &&
                        (buttons[6].getText() == "X")) {
            xWins(0,3,6);
        }
        if (
                (buttons[1].getText() == "X") &&
                        (buttons[4].getText() == "X") &&
                        (buttons[7].getText() == "X")) {
            xWins(1,4,7);
        }
        if (
                (buttons[2].getText() == "X") &&
                        (buttons[5].getText() == "X") &&
                        (buttons[8].getText() == "X")) {
            xWins(2,5,8);
        }
        if (
                (buttons[0].getText() == "X") &&
                        (buttons[4].getText() == "X") &&
                        (buttons[8].getText() == "X")) {
            xWins(0,4,8);
        }
        if (
                (buttons[2].getText() == "X") &&
                        (buttons[4].getText() == "X") &&
                        (buttons[6].getText() == "X")) {
            xWins(2,4,6);
        }

        if (
                (buttons[0].getText() == "O") &&
                        (buttons[1].getText() == "O") &&
                        (buttons[2].getText() == "O")) {
            oWins(0,1,2);
        }
        if (
                (buttons[3].getText() == "O") &&
                        (buttons[4].getText() == "O") &&
                        (buttons[5].getText() == "O")) {
            oWins(3,4,5);
        }
        if (
                (buttons[6].getText() == "O") &&
                        (buttons[7].getText() == "O") &&
                        (buttons[8].getText() == "O")) {
            oWins(6,7,8);
        }
        if (
                (buttons[0].getText() == "O") &&
                        (buttons[3].getText() == "O") &&
                        (buttons[6].getText() == "O")) {
            oWins(0,3,6);
        }
        if (
                (buttons[1].getText() == "O") &&
                        (buttons[4].getText() == "O") &&
                        (buttons[7].getText() == "O")) {
            oWins(1,4,7);
        }
        if (
                (buttons[2].getText() == "O") &&
                        (buttons[5].getText() == "O") &&
                        (buttons[8].getText() == "O")) {
            oWins(2,5,8);
        }
        if (
                (buttons[0].getText() == "O") &&
                        (buttons[4].getText() == "O") &&
                        (buttons[8].getText() == "O")) {
            oWins(0,4,8);
        }
        if (
                (buttons[2].getText() == "O") &&
                        (buttons[4].getText() == "O") &&
                        (buttons[6].getText() == "O")) {
            oWins(2,4,6);
        }
    }
    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(new Color(123, 246, 114));
        buttons[b].setBackground(new Color(123, 246, 114));
        buttons[c].setBackground(new Color(123, 246, 114));

        buttons[a].setOpaque(true);
        buttons[b].setOpaque(true);
        buttons[c].setOpaque(true);


        for(int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
    }
    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(new Color(123, 246, 114));
        buttons[b].setBackground(new Color(123, 246, 114));
        buttons[c].setBackground(new Color(123, 246, 114));

        buttons[a].setOpaque(true);
        buttons[b].setOpaque(true);
        buttons[c].setOpaque(true);

        for(int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
    }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        //button_panel.setVisible(false);
}

