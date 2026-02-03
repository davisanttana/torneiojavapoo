package app;

import model.Match;
import model.Player;
import model.Team;

public class Main {
    public static void main(String[] args) {
        Team time1 = new Team("Barcelona");
        time1.adicionarJogador(new Player("Neymar",97));
        time1.adicionarJogador(new Player("Messi",99));


        Team time2 = new Team("Milan");
        time1.adicionarJogador(new Player("Ibra",96));
        time1.adicionarJogador(new Player("CR7",98));

        Match partida= new Match(time1, time2);
        System.out.println("Antes do jogo:");
        partida.getResultado().ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Partida ainda não jogada")
        );

        partida.simular();

        System.out.println("\nDepois do jogo:");
        partida.getResultado().ifPresent(System.out::println);
    }
}