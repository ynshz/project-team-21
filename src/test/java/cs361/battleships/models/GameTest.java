package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class GameTest {

    @Test
    public void testRandomNumbers() {
        Game game1 = new Game();
        assertFalse(game1.placeShip(new Ship("MINESWEEPER"), 11, 'C', true));
    }
}
