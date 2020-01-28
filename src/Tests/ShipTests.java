package Tests;

import Battleship.BattleBoard;
import Battleship.Ship;
import Battleship.ShipPart;
import Battleship.Team;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTests {
    @Test
    void testShipPartCreation() {
        ShipPart part1 = new ShipPart();
        ShipPart part2 = new ShipPart();
        ShipPart[] parts = new ShipPart[] {part1, part2};

        Team team_a = new Team("A");
        Ship big_ship = new Ship(team_a, Ship.direction.HORIZONTAL, parts);

        //assertEquals(big_ship.getParts(), parts);
    }
}