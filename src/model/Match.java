package model;

import java.util.Optional;
import java.util.Random;

public class Match {
    private Team home;
    private Team away;
    private Integer golsCasa;
    private Integer golsFora;

    public Match(Team home, Team away) {
        if (home == null || away == null) {
            throw new IllegalArgumentException("Times não podem ser nulos");
        }if (home == away) {
            throw new IllegalArgumentException("Um time não pode jogar contra ele mesmo");
        }
        this.home = home;
        this.away = away;
        this.golsCasa = null;
        this.golsFora = null;
    }
    public Optional<String> getResultado() {
        if (golsCasa == null || golsFora == null) {
            return Optional.empty();
        }
        return Optional.of(
                home.getNome() + " " + golsCasa + " x " + golsFora + " " + away.getNome()
        );
    }
    public void simular() {
        if (golsCasa != null) {
            throw new IllegalStateException("Essa partida já foi jogada");
        }

        Random random = new Random();

        int forcaCasa = home.calcularForca();
        int forcaFora = away.calcularForca();

        golsCasa = random.nextInt(3) + forcaCasa / 30;
        golsFora = random.nextInt(3) + forcaFora / 30;
    }


}
