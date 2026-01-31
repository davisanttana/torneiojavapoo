package app;

import model.Player;
import model.Team;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Neymar",97);
        Player p2 = new Player("Messi",99);

        Team time = new Team("Barcelona");
        time.adicionarJogador(p1);
        time.adicionarJogador(p2);
        System.out.println(time);
        for (Player p: time.getJogadores()) {
            System.out.println(p);
        }
    }
}