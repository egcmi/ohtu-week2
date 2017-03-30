package main.java.nhl.test;
import java.util.ArrayList;
import java.util.List;
import main.java.nhl.*;
import org.junit.Before;

public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before 
    public  void  setUp () {
         // create Staatistics entity that uses "a stub" 
        stats =  new  Statistics (readerStub);
    }  
}