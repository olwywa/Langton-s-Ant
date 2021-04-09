package com.company;

import javax.swing.*;
import java.awt.*;

public class Ant {

    private int x, y;
    private MOVE ant_state = MOVE.LEFT;
    private ImageIcon icon;

    private enum MOVE {
        UP, RIGHT, DOWN, LEFT;
    }

    public Ant(Board board, int size) {

        board.size = size;

        x = size / 2;
        y = size / 2;
        board.btns[x][y].setBackground(Color.white);

        icon = createImageIcon("ant.png", "Ant");
        Image image = icon.getImage(); // transform it
        Image newimg = image.getScaledInstance(40, 30, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        icon = new ImageIcon(newimg);  // transform it back
        board.btns[x][y].setIcon(icon);
        board.btns[x][y].setDisabledIcon(icon);
    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected ImageIcon createImageIcon(String path,
                                        String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public void move(JButton[][] btns) {

        if (btns[x][y].getBackground() == (Color.white)) {
            btns[x][y].setBackground(Color.black);
            btns[x][y].setIcon(null);
            goleft(btns);
        } else if (btns[x][y].getBackground() == (Color.black)) {
            btns[x][y].setBackground(Color.white);
            btns[x][y].setIcon(null);
            goright(btns);
        }
    }

    private void goleft(JButton[][] btns) {
        if (ant_state.equals(MOVE.UP)) {
            btns[x][y - 1].setIcon(icon);
            btns[x][y - 1].setDisabledIcon(icon);
            y -= 1;
            ant_state = MOVE.LEFT;
        } else if (ant_state.equals(MOVE.RIGHT)) {
            btns[x - 1][y].setIcon(icon);
            btns[x - 1][y].setDisabledIcon(icon);
            x -= 1;
            ant_state = MOVE.UP;
        } else if (ant_state.equals(MOVE.DOWN)) {
            btns[x][y + 1].setIcon(icon);
            btns[x][y + 1].setDisabledIcon(icon);
            y += 1;
            ant_state = MOVE.RIGHT;
        } else if (ant_state.equals(MOVE.LEFT)) {
            btns[x + 1][y].setIcon(icon);
            btns[x + 1][y].setDisabledIcon(icon);
            x += 1;
            ant_state = MOVE.DOWN;
        }
    }

    private void goright(JButton[][] btns) {
        if (ant_state.equals(MOVE.UP)) {
            btns[x][y + 1].setIcon(icon);
            btns[x][y + 1].setDisabledIcon(icon);
            y += 1;
            ant_state = MOVE.RIGHT;
        } else if (ant_state.equals(MOVE.RIGHT)) {
            btns[x + 1][y].setIcon(icon);
            btns[x + 1][y].setDisabledIcon(icon);
            x += 1;
            ant_state = MOVE.DOWN;
        } else if (ant_state.equals(MOVE.DOWN)) {
            btns[x][y - 1].setIcon(icon);
            btns[x][y - 1].setDisabledIcon(icon);
            y -= 1;
            ant_state = MOVE.LEFT;
        } else if (ant_state.equals(MOVE.LEFT)) {
            btns[x - 1][y].setIcon(icon);
            btns[x - 1][y].setDisabledIcon(icon);
            x -= 1;
            ant_state = MOVE.UP;
        }
    }
}