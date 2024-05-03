import java.util.*;
import players.Players;
import board.Board;
import triples.Triples;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's start the game");

        Players p = new Players();
        p.set_player_details("ipshita", 0, "ipshita@gmail.com");
        System.out.println(p.get_player_name());

        Board b = new Board(9);

        List<Triples> triples = new ArrayList<>();
        triples.add(new Triples(0, 0, 5));
        triples.add(new Triples(0, 1, 3));
        triples.add(new Triples(0, 2, 8));
        triples.add(new Triples(0, 3, 1));
        triples.add(new Triples(0, 4, 2));
        triples.add(new Triples(0, 5, 7));
        triples.add(new Triples(0, 6, 4));
        triples.add(new Triples(0, 7, 6));
        triples.add(new Triples(0, 8, 9));

        triples.add(new Triples(1, 0, 1));
        triples.add(new Triples(1, 1, 2));
        triples.add(new Triples(1, 2, 7));
        triples.add(new Triples(1, 3, 3));
        triples.add(new Triples(1, 4, 0));
        triples.add(new Triples(1, 5, 9));
        triples.add(new Triples(1, 6, 5));
        triples.add(new Triples(1, 7, 8));
        triples.add(new Triples(1, 8, 6));

        triples.add(new Triples(2, 0, 0));
        triples.add(new Triples(2, 1, 6));
        triples.add(new Triples(2, 2, 4));
        triples.add(new Triples(2, 3, 8));
        triples.add(new Triples(2, 4, 5));
        triples.add(new Triples(2, 5, 6));
        triples.add(new Triples(2, 6, 1));
        triples.add(new Triples(2, 7, 3));
        triples.add(new Triples(2, 8, 2));

        triples.add(new Triples(3, 0, 3));
        triples.add(new Triples(3, 1, 4));
        triples.add(new Triples(3, 2, 6));
        triples.add(new Triples(3, 3, 0));
        triples.add(new Triples(3, 4, 7));
        triples.add(new Triples(3, 5, 2));
        triples.add(new Triples(3, 6, 8));
        triples.add(new Triples(3, 7, 1));
        triples.add(new Triples(3, 8, 5));

        triples.add(new Triples(4, 0, 8));
        triples.add(new Triples(4, 1, 7));
        triples.add(new Triples(4, 2, 9));
        triples.add(new Triples(4, 3, 5));
        triples.add(new Triples(4, 4, 6));
        triples.add(new Triples(4, 5, 1));
        triples.add(new Triples(4, 6, 0));
        triples.add(new Triples(4, 7, 2));
        triples.add(new Triples(4, 8, 4));

        triples.add(new Triples(5, 0, 2));
        triples.add(new Triples(5, 1, 5));
        triples.add(new Triples(5, 2, 1));
        triples.add(new Triples(5, 3, 4));
        triples.add(new Triples(5, 4, 3));
        triples.add(new Triples(5, 5, 8));
        triples.add(new Triples(5, 6, 6));
        triples.add(new Triples(5, 7, 9));
        triples.add(new Triples(5, 8, 7));

        triples.add(new Triples(6, 0, 6));
        triples.add(new Triples(6, 1, 8));
        triples.add(new Triples(6, 2, 5));
        triples.add(new Triples(6, 3, 7));
        triples.add(new Triples(6, 4, 9));
        triples.add(new Triples(6, 5, 4));
        triples.add(new Triples(6, 6, 2));
        triples.add(new Triples(6, 7, 5));
        triples.add(new Triples(6, 8, 3));

        triples.add(new Triples(7, 0, 7));
        triples.add(new Triples(7, 1, 9));
        triples.add(new Triples(7, 2, 0));
        triples.add(new Triples(7, 3, 2));
        triples.add(new Triples(7, 4, 1));
        triples.add(new Triples(7, 5, 5));
        triples.add(new Triples(7, 6, 4));
        triples.add(new Triples(7, 7, 6));
        triples.add(new Triples(7, 8, 8));

        triples.add(new Triples(8, 0, 4));
        triples.add(new Triples(8, 1, 1));
        triples.add(new Triples(8, 2, 2));
        triples.add(new Triples(8, 3, 6));
        triples.add(new Triples(8, 4, 8));
        triples.add(new Triples(8, 5, 3));
        triples.add(new Triples(8, 6, 9));
        triples.add(new Triples(8, 7, 7));
        triples.add(new Triples(8, 8, 1));

        b.set_board_config_implicitly(triples);
        b.print_board_configuration();

        Game game = new Game(b,p);
        game.play();
        
    }
}
