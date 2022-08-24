import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class GameTest {
    ArrayList<Player> expected = new ArrayList<>();
    ArrayList<Player> actual = new ArrayList<>();

    Game game = new Game(actual);

    Player player1 = new Player(1, 100, "John");
    Player player2 = new Player(2, 9, "Alex");
    Player player3 = new Player(3, 100, "Sam");

    @Test
    public void shouldRegister() {
        expected.add(player1);
        game.register(player1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExCuzFirstPlayerAintReg() {
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(player1.name, player2.name);
        });
    }

    @Test
    public void shouldThrowExCuzSecondPlayerAintReg() {
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(player1.name, player2.name);
        });
    }

    @Test
    public void shouldfirstWin() {
        game.register(player2);
        game.register(player1);

        int expected = 1;
        int actual = game.round(player1.name, player2.name);
    }

    @Test
    public void shouldSecondWin() {
        game.register(player2);
        game.register(player3);

        int expected = 2;
        int actual = game.round(player2.name, player3.name);
    }

    @Test
    public void shouldBeDraw() {
        game.register(player1);
        game.register(player3);

        int expected = 0;
        int actual = game.round(player1.name, player3.name);
    }
}
