package org.infnet.tp2teste.models;

import static org.infnet.tp2teste.repository.Repository.tecnicos;

public class Tecnico {
    private final int codigo;
    private String nome;
    private Time time;

    public Tecnico() {
        this.codigo = tecnicos.size() + 1;
    }

    public Tecnico(String nome, Time time) {
        this.codigo = tecnicos.size() + 1;
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    

    @Override
    public String toString() {
        return "Tecnico\n\n" +
                "Nome: " + nome + '\n' +
                "Time: " + time;
    }
}
