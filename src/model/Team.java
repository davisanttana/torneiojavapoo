package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String nome;
    private List<Player> jogadores;

    public Team(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogador(Player jogador) {
        jogadores.add(jogador);
    }
    public List<Player> getJogadores() {
        return jogadores;
    }

    @Override
    public String toString() {
        return "Time: " + nome + " | Jogadores: " + jogadores.size();
    }
}
