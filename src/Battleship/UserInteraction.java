package Battleship;

public class UserInteraction {
    public Team[] setShips() {
        Team[] teams = new Team[]{new Team("A"), new Team("B")};

        for (Team team : teams) {
            Ship carrier = new Ship(team, Ship.direction.NONE, ShipPart.generateParts(5, false));
            Ship cruiser = new Ship(team, Ship.direction.NONE, ShipPart.generateParts(4, false));
            Ship sub = new Ship(team, Ship.direction.NONE, ShipPart.generateParts(3, false));
            Ship destroyer = new Ship(team, Ship.direction.NONE, ShipPart.generateParts(2, false));

            Ship[] ships = new Ship[] {carrier, cruiser, sub, destroyer};
            team.addShips(ships);
        }

        return teams;
    }

    public static Space parseSpace(String piece_str) {
        int r_index = piece_str.indexOf("R");
        int c_index = piece_str.indexOf("C");

        int space_col;
        int space_row;

        String first = "";
        if (c_index < r_index) {
            space_row = Integer.parseInt(piece_str.substring(r_index + 1)) - 1;
            space_col = Integer.parseInt(piece_str.substring(c_index + 1, r_index)) - 1;
        } else {
            space_row = Integer.parseInt(piece_str.substring(r_index + 1, c_index)) - 1;
            space_col = Integer.parseInt(piece_str.substring(c_index + 1)) - 1;
        }

        return new Space(space_col, space_row);
    }


}
