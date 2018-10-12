package cs361.battleships.models;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
public class ResultTest {
    @Test
    public void testSetAndGetResult() {
        Result result = new Result();
        result.setResult(AtackStatus.MISS);
        assertEquals(AtackStatus.MISS, result.getResult());
    }

    @Test
    public void testSetAndGetShip() {
        Result result = new Result();
        Ship BattleShip = new Ship("BATTLESHIP");
        result.setShip(BattleShip);

        assertEquals(BattleShip, result.getShip());
    }

    @Test
    public void testSetAndGetLocation() {
        Result result = new Result();
        Square location = new Square(3, 'A');
        result.setLocation(location);
        assertEquals(location, result.getLocation());
    }
}