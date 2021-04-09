package com.company;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    int size = 100;
    JButton[][] btns = new JButton[size][size];
    Ant n;

    public Board() {
        setLayout(new GridLayout(size, size));
        initializeButtons();
        n = new Ant(this, size);
    }

    private JButton[][] initializeButtons() {  //set the buttons with onclick action

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                btns[i][j] = new JButton();
                btns[i][j].setText(" ");
                btns[i][j].setBounds(50, 50, 50, 50);
                btns[i][j].setBackground(Color.white);
                btns[i][j].setEnabled(false);
                btns[i][j].setHorizontalTextPosition(SwingConstants.CENTER);
                add(btns[i][j]);
            }
        }
        return btns;
    }
}