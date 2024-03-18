package org.infnet.tp2teste.models;

public class Jogador {
    private String nome;
    private String posicao;
    private int camisa;
    private Time time;

    public Jogador() {
    }

    public Jogador(String nome, String posicao, int camisa, Time time) {
        this.nome = nome;
        this.posicao = posicao;
        this.camisa = camisa;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "Jogador\n\n" +
                "Nome: " + this.nome + '\n' +
                "Posicao: " + this.posicao + '\n' +
                "Camisa: " + this.camisa + '\n' +
                "Time atual: " + this.time;
    }
    
}
