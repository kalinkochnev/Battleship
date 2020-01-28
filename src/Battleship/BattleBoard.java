package Battleship;


import java.util.ArrayList;

public class BattleBoard {
    Space[][] board;

    BattleBoard(Space[][] board) {
        this.board = board;
    }

    public static BattleBoard blankBoard() {
        Space[][] board = new Space[8][8];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = new Space(row, col);
            }
        }


        Team red = new Team("A");
        Team black = new Team("B");

        // Initalizes the piece variables in the checkerboard class
        /*red.initTeam(0, 12);
        black.initTeam(12, 24);*/

        //Sets the first and last the rows to generated ones
        return new BattleBoard(board);
    }

    boolean inBounds(Ship ship) {
        boolean firstInBounds = this.inBounds(ship.getFirst().getSpace());
        boolean secondInBounds = this.inBounds(ship.getLast().getSpace());
        return firstInBounds && secondInBounds;
    }

    boolean inBounds(Space space) {
        if (space.column >= 0 && space.column <= board.length - 1) {
            if (space.row >= 0 && space.row <= board.length - 1) {
                return true;
            }
        }
        return false;
    }

    ArrayList<Space> getRowSpaces(int rowNum, int start, int end) {
        if (!this.inBounds(new Space(rowNum, start)) || !this.inBounds(new Space(rowNum, end))) {
            return new ArrayList<Space>();
        }

        Space[] row = board[rowNum];
        ArrayList<Space> spaces = new ArrayList<>();

        for (int space = start; space < end; space++) {
            spaces.add(row[space]);
        }

        return spaces;
    }

    ArrayList<Space> getRow(int rowNum) {
        return getRowSpaces(rowNum, 0, board.length);
    }

    ArrayList<Space> getColumnSpaces(int colNum, int start, int end) {
        ArrayList<Space> spaces = new ArrayList<>();

        for (int row = start; row < end; row++) {
            spaces.add(board[row][colNum]);
        }

        return spaces;
    }

    ArrayList<Space> getColumn(int colNum) {
        return getColumnSpaces(colNum, 0, board.length);
    }

    // Test that the spaces are the same length as the ship
    void setSpaces(Space start, Ship ship) {
        ArrayList<Space> spaces = new ArrayList<>();

        switch (ship.getDir()) {
            case VERTICAL:
                spaces = this.getRowSpaces(start.row, start.column, start.column + ship.length());
            case HORIZONTAL:
                spaces = this.getRowSpaces(start.row, start.column, start.column + ship.length());
        }

        if (this.inBounds(ship) && spaces.size() != 0) {
            for (int space = 0; space < spaces.size(); space++) {
                ShipPart part = ship.getShipPart(space);
                Space shipPartSpace = spaces.get(space);
                shipPartSpace.setShipPart(part);
                part.setSpace(shipPartSpace);
            }
        }
    }
}
