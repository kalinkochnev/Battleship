package Battleship;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private Team team;
    private ArrayList<ShipPart> shipParts;
    private direction dir;

    public Ship(Team team, direction dir, ShipPart[] parts) {
        this.team = team;
        this.dir = dir;
        this.shipParts = (ArrayList<ShipPart>) ShipPart.toArray(parts);
    }

    public enum direction {
        VERTICAL, HORIZONTAL
    }

    public direction getDir() {
        return this.dir;
    }

    public List<ShipPart> getParts() {
        return shipParts;
    }

    public ShipPart getFirst() {
        return shipParts.get(0);
    }

    public ShipPart getLast() {
        return shipParts.get(shipParts.size());
    }

    public int length() {
        return shipParts.size();
    }

    public ShipPart getEnd() {
        return shipParts.get(shipParts.size()-1);
    }

    public ShipPart getShipPart(int index) {
        return this.shipParts.get(index);
    }

    public void placeShip() {

    }
}
