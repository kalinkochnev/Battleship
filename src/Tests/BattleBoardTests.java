package Tests;

import Battleship.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BattleBoardTests {
    BattleBoard board = BattleBoard.blankBoard();

    @AfterEach
    void resetBoard() {
        board = BattleBoard.blankBoard();
    }

    @Test
    void testInBounds() {
        Space space = new Space(0, 0);
        assertTrue(board.inBounds(space));

        space = new Space(9, 9);
        assertTrue(board.inBounds(space));

        space = new Space(9, 0);
        assertTrue(board.inBounds(space));

        space = new Space(0, 9);
        assertTrue(board.inBounds(space));

        space = new Space(0, 4);
        assertTrue(board.inBounds(space));

        space = new Space(9, 4);
        assertTrue(board.inBounds(space));

        space = new Space(9, 4);
        assertTrue(board.inBounds(space));

        space = new Space(4, 0);
        assertTrue(board.inBounds(space));

        space = new Space(4, 9);
        assertTrue(board.inBounds(space));
    }

    @Test
    void testOutOfBounds() {
        Space space = new Space(-1, 0);
        assertFalse(board.inBounds(space));

        space = new Space(0, -1);
        assertFalse(board.inBounds(space));

        space = new Space(10, 0);
        assertFalse(board.inBounds(space));

        space = new Space(0, 10);
        assertFalse(board.inBounds(space));

        space = new Space(10, 0);
        assertFalse(board.inBounds(space));

        space = new Space(-1, -1);
        assertFalse(board.inBounds(space));

        space = new Space(10, 10);
        assertFalse(board.inBounds(space));
    }


}
