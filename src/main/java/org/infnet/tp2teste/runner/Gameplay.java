package org.infnet.tp2teste.runner;

import org.infnet.tp2teste.models.Jogador;
import org.infnet.tp2teste.models.Tecnico;
import org.infnet.tp2teste.models.Time;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

import static org.infnet.tp2teste.repository.Repository.times;

@Component
public class Gameplay implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Time palmeiras = new Time();
        palmeiras.setNome("Palmeiras");
        palmeiras.setTecnico(new Tecnico("Abel Ferreira", palmeiras));
        palmeiras.addJogador(new Jogador("Rony", "Atacante", 9, palmeiras));
        palmeiras.addJogador(new Jogador("Dudu", "Atacante", 10, palmeiras));
        times.put("palmeiras", palmeiras);
        System.out.println(palmeiras.gerarPauta());

        Time cruzeiro = new Time();
        cruzeiro.setNome("Vasco");
        cruzeiro.setTecnico(new Tecnico("Nicolás Larcamón", cruzeiro));
        cruzeiro.addJogador(new Jogador("Matheus Pereira", "Meia", 10, cruzeiro));
        cruzeiro.addJogador(new Jogador("Dineno", "Atacante", 9, cruzeiro));
        times.put("cruzeiro", cruzeiro);
        System.out.println(cruzeiro.gerarPauta());
    }
    
}
