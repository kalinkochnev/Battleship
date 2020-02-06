package Battleship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShipPart {
    private Space space;

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public static List<ShipPart> toArray(ShipPart[] parts) {
        return Arrays.asList(parts);
    }
}
