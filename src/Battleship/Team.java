package Battleship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
    private String teamName;
    private List<Ship> ships;

    public Team(String name) {
        this.teamName = name;
    }

    public void addShip(Ship ship) {
        this.ships.add(ship);
    }

    public void addShips(Ship[] ships) {
        this.ships.addAll(Arrays.asList(ships));
    }

    public Ship getShip(int index) {
        return ships.get(index);
    }
}
