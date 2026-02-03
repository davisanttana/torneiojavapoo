package app;

import model.Player;
import model.Team;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Neymar",97);
        Player p2 = new Player("Messi",99);
        Player p3 = new Player("Suarez",96);

        Team time = new Team("Barcelona");
        time.adicionarJogador(p1);
        time.adicionarJogador(p2);
        time.adicionarJogador(p3);
        System.out.println(time);
        System.out.println("Força do time: " + time.calcularForca());
        System.out.println("Jogadores:");
        time.getJogadores().forEach(System.out::println);
    }
}