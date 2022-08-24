import java.util.ArrayList;


public class Game {
    ArrayList<Player> players = new ArrayList<>();

    public Game(ArrayList<Player> players) {
        this.players = players;
    }

    public void register(Player player) {
        players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = null;
        Player player2 = null;

        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
        }
        if (player1 == null) {
            throw new NotRegisteredException("Игрок должен быть зарегистрирован");
        }
        if (player2 == null) {
            throw new NotRegisteredException("Игрок должен быть зарегистрирован");
        }
        if (player1.getStrenght() > player2.getStrenght()) {
            return 1;
        } else if (player1.getStrenght() < player2.getStrenght()) {
            return 2;
        }
        return 0;
    }
}
