package Battleship;

import java.util.ArrayList;
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
        List<ShipPart> partList = new ArrayList<ShipPart>();
        for (int i = 0; i < parts.length; i++) {
           partList.add(parts[i]);
        }

        return partList;
    }
}
