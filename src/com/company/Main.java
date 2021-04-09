package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Langton's Ant");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Board board = new Board();
        window.getContentPane().add(board);

        Engine en = new Engine(board);

        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        en.play();
    }
}
