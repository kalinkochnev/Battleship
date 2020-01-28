package Tests;

import Battleship.BattleBoard;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    BattleBoard board;

    @AfterEach
    void resetBoard() {
        board = BattleBoard.blankBoard();
    }
}