package com.company;

public class Engine {

    Board board;

    public Engine(Board board) {
        this.board = board;
    }

    public void play() {
        while (true) {
            board.n.move(board.btns);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
