package Battleship;

public class Space {
    public int column;
    public int row;
    public ShipPart part;

    public Space(int row, int column, ShipPart part) {
        this.column = column;
        this.row = row;
        this.part = part;
    }

    public Space(int column, int row) {
        this.column = column;
        this.row = row;
        this.part = null;
    }

    public void setShipPart(ShipPart part) {
        this.part = part;
    }

    public boolean equals(Space other) {
        return this.column == other.column && this.row == other.row;
    }

    public String toString() {
        return "R" + (this.row + 1) + " C" + (this.column + 1);
    }
}
