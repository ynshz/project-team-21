package cs361.battleships.models;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class GameTest {
    @Test
    public void testRowRange() {
        Game game = new Game();
        int testRow = game.randRow();
        assertTrue(testRow >= 1 && testRow <= 10);
    }

    @Test
    public void testColumnRange() {
        Game game = new Game();
        char testCol = game.randCol();
        assertTrue(testCol >= 'A' && testCol<='J');
    }

    @Test
    public void testBooleanValue() {
        Game game = new Game();
        boolean isVertical = game.randVertical();
        assertTrue(isVertical || !isVertical);
    }

}
