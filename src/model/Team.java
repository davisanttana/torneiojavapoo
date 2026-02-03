package model;

import java.util.ArrayList;
import java.util.Collections;
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
        if (jogador == null) {
            throw new IllegalArgumentException("Jogador não pode ser nulo");
        }
        jogadores.add(jogador);
    }

    public List<Player> getJogadores() {
        return Collections.unmodifiableList(jogadores);
    }

    public int calcularForca() {
        if (jogadores.isEmpty()) {
            return 0;
        }
        int soma = 0;
        for (Player p : jogadores) {
            soma += p.getSkill();
        }
        return soma / jogadores.size();
    }

    @Override
    public String toString() {
        return "Time: " + nome + " | Jogadores: " + jogadores.size() + " | Força: " + calcularForca();
    }
}
