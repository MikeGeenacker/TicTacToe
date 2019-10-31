import com.mike.oop.Board;
import com.mike.oop.Game;
import com.mike.oop.Human;
import com.mike.oop.Player;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void werktBordVol() {
        Player p1 = new Human("Mike", Player.Piece.XPIECE);
        Player p2 = new Human("Mike", Player.Piece.OPIECE);
        Player[] list = {p1, p2};
        Game g = null;
        try {
            g = new Game(list);
        } catch(Exception ex) {
            // do nothing
        }

        Board b = new Board(3);
        b.clear();
        boolean result = g.bordVol(b);

        Assert.assertFalse(result);
    }

    @Test
    void changeSpelerwerkt(){
        Player p1 = new Human("Mike", Player.Piece.XPIECE);
        Player p2 = new Human("Mike", Player.Piece.OPIECE);
        Player[] list = {p1, p2};
        Game g = null;
        try {
            g = new Game(list);
        } catch(Exception ex) {
            // do nothing
        }
        Player before = g.getCurrentPlayer();
        g.swapPlayers();
        Player after = g.getCurrentPlayer();
        Assert.assertNotEquals(before, after);

    }
}
