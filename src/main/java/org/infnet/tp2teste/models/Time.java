package org.infnet.tp2teste.models;

import java.util.HashMap;
import java.util.Map;

import static org.infnet.tp2teste.repository.Repository.times;

public class Time {
    private final int codigo;
    private String nome;
    private final Map<String, Jogador> jogadores = new HashMap<String, Jogador>();
    private Tecnico tecnico;
    
    public Time(){
        this.codigo = times.size() + 1;
    }

    public Time(String nome, Tecnico tecnico){
        this.codigo = times.size() + 1;
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public Time(String nome) {
        this.nome = nome;
        this.codigo = times.size() + 1;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogadores() {
        StringBuilder nomes = new StringBuilder();
        for (Jogador jogador : jogadores.values()) {
            nomes.append("Nome: ").append(jogador.getNome()).append(" - Posicao: ").append(jogador.getPosicao()).append(" - Camisa: ").append(jogador.getCamisa()).append("\n");
        }
        return nomes.toString();
    }

    public void addJogador(Jogador jogador) {
        jogadores.put(jogador.getNome().toLowerCase(), jogador);
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    public Map<String, Jogador> elenco() {
        return jogadores;
    }

    @Override
    public String toString() {
        return "\nTime\n\n" +
                "Código: " + codigo + '\n' +
                "Nome: " + nome + '\n' +
                "Técnico: " + tecnico.getNome();
    }
    

    public String gerarPauta(){
        
        return "Time\n\n" +
                "Código: " + codigo + '\n' +
                "Nome: " + nome + '\n' +
                "Técnico: " + tecnico.getNome() + '\n' +
                "Jogadores:\n" + getJogadores();
    }
}
