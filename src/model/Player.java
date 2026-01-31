package model;

public class Player {
    private String nome;
    private int skill;// 0 a 100

    public Player(String nome, int skill) {
        this.nome = nome;
        this.skill = skill;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
    @Override
    public String toString() {
        return nome + " (skill: " + skill + ")";
    }
}
