package org.infnet.tp2teste;

import org.infnet.tp2teste.models.Jogador;
import org.infnet.tp2teste.models.Tecnico;
import org.infnet.tp2teste.models.Time;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.infnet.tp2teste.repository.Repository.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {
    
      
    @BeforeEach @Test
    public void criarTimes(){
        Time cruzeiro = new Time();
        times.put("cruzeiro" , cruzeiro);

        Time palmeiras = new Time();
        times.put("palmeiras" , palmeiras);

        Time atletico = new Time();
        times.put("atletico" , atletico);

        Time flamengo = new Time();
        times.put("flamengo" , flamengo);
        
        // verificar se existem 4 times no db
        assertEquals(4, times.size());
    }

    
    @Test
    public void criarTecnicos() {
        Tecnico nicolasLarcamon = new Tecnico();
        tecnicos.put("nicolas", nicolasLarcamon);
        
        Tecnico abelFerreira = new Tecnico();
        tecnicos.put("abel", abelFerreira);
        
        Tecnico felipao = new Tecnico();
        tecnicos.put("felipao", felipao);
        
        Tecnico tite = new Tecnico();
        tecnicos.put("tite", tite);

        // verificar se existem 4 tecnicos no db
        assertEquals(4, tecnicos.size());
    }

    @Test
    public void tecnicosInserirDados() {
        Tecnico nicolas = tecnicos.get("nicolas");
        nicolas.setNome("Nicolás Larcamón");
        nicolas.setTime(times.get("cruzeiro"));

        Tecnico abel = tecnicos.get("abel");
        abel.setNome("Abel Ferreira");
        abel.setTime(times.get("palmeiras"));
        
        Tecnico felipao = tecnicos.get("felipao");
        felipao.setNome("Felipão");
        felipao.setTime(times.get("atletico"));

        Tecnico tite = tecnicos.get("tite");
        tite.setNome("Tite");
        tite.setTime(times.get("flamengo"));

        // Verificar se os dados foram inseridos corretamente
        assertEquals("Nicolás Larcamón", tecnicos.get("nicolas").getNome());
        assertEquals(times.get("cruzeiro"), tecnicos.get("nicolas").getTime());

        assertEquals("Abel Ferreira", tecnicos.get("abel").getNome());
        assertEquals(times.get("palmeiras"), tecnicos.get("abel").getTime());

        assertEquals("Felipão", tecnicos.get("felipao").getNome());
        assertEquals(times.get("atletico"), tecnicos.get("felipao").getTime());

        assertEquals("Tite", tecnicos.get("tite").getNome());
        assertEquals(times.get("flamengo"), tecnicos.get("tite").getTime());
    }

    @Test
    public void timesInserirDados() {
        Time cruzeiro = times.get("cruzeiro");
        cruzeiro.setNome("Cruzeiro");
        cruzeiro.setTecnico(tecnicos.get("nicolas"));
        
        Time palmeiras = times.get("palmeiras");
        palmeiras.setNome("Palmeiras");
        palmeiras.setTecnico(tecnicos.get("abel"));
        
        Time atletico = times.get("atletico");
        atletico.setNome("Atletico MG");
        atletico.setTecnico(tecnicos.get("felipao"));
        
        Time flamengo = times.get("flamengo");
        flamengo.setNome("Flamengo");
        flamengo.setTecnico(tecnicos.get("tite"));

        // Verificar se os dados foram inseridos corretamente
        assertEquals("Cruzeiro", times.get("cruzeiro").getNome());
        assertEquals(tecnicos.get("nicolas"), times.get("cruzeiro").getTecnico());

        assertEquals("Palmeiras", times.get("palmeiras").getNome());
        assertEquals(tecnicos.get("abel"), times.get("palmeiras").getTecnico());

        assertEquals("Atletico MG", times.get("atletico").getNome());
        assertEquals(tecnicos.get("felipao"), times.get("atletico").getTecnico());

        assertEquals("Flamengo", times.get("flamengo").getNome());
        assertEquals(tecnicos.get("tite"), times.get("flamengo").getTecnico());
    }

    @Test
    public void criarJogadores() {
        // cruzeiro
        Jogador matheus = new Jogador();
        jogadores.put("matheus", matheus);
        Jogador romero = new Jogador();
        jogadores.put("romero", romero);

        // palmeiras
        Jogador dudu = new Jogador();
        jogadores.put("dudu", dudu);
        Jogador rony = new Jogador();
        jogadores.put("rony", rony);

        // atletico
        Jogador hulk = new Jogador();
        jogadores.put("hulk", hulk);
        Jogador paulinho = new Jogador();
        jogadores.put("paulinho", paulinho);

        // flamengo
        Jogador arrascaeta = new Jogador();
        jogadores.put("arrascaeta", arrascaeta);
        Jogador fabricio = new Jogador();
        jogadores.put("fabricio", fabricio);

        // verificar se foram criados oito jogadores
        assertEquals(8, jogadores.size());
    }

    @Test
    public void preencherJogadores() {
        jogadores.get("matheus").setNome("Matheus");
        jogadores.get("matheus").setCamisa(10);
        jogadores.get("matheus").setPosicao("Meia");
        jogadores.get("matheus").setTime(times.get("cruzeiro"));

        jogadores.get("romero").setNome("Romero");
        jogadores.get("romero").setCamisa(5);
        jogadores.get("romero").setPosicao("Volante");
        jogadores.get("romero").setTime(times.get("cruzeiro"));

        jogadores.get("dudu").setNome("Dudu");
        jogadores.get("dudu").setCamisa(7);
        jogadores.get("dudu").setPosicao("Atacante");
        jogadores.get("dudu").setTime(times.get("palmeiras"));

        jogadores.get("rony").setNome("Rony");
        jogadores.get("rony").setCamisa(10);
        jogadores.get("rony").setPosicao("Atacante");
        jogadores.get("rony").setTime(times.get("palmeiras"));

        jogadores.get("hulk").setNome("Hulk");
        jogadores.get("hulk").setCamisa(10);
        jogadores.get("hulk").setPosicao("Atacante");
        jogadores.get("hulk").setTime(times.get("atletico"));

        jogadores.get("paulinho").setNome("Paulinho");
        jogadores.get("paulinho").setCamisa(9);
        jogadores.get("paulinho").setPosicao("Atacante");
        jogadores.get("paulinho").setTime(times.get("atletico"));

        jogadores.get("arrascaeta").setNome("Arrascaeta");
        jogadores.get("arrascaeta").setCamisa(14);
        jogadores.get("arrascaeta").setPosicao("Meia");
        jogadores.get("arrascaeta").setTime(times.get("flamengo"));

        jogadores.get("fabricio").setNome("Fabricio");
        jogadores.get("fabricio").setCamisa(3);
        jogadores.get("fabricio").setPosicao("Zagueiro");
        jogadores.get("fabricio").setTime(times.get("flamengo"));

        assertEquals(8, jogadores.size());
    }
    
    @Test
    public void addJogadores() {
        // times
        Time cruzeiro = times.get("cruzeiro");
        Time palmeiras = times.get("palmeiras");
        Time atletico = times.get("atletico");
        Time flamengo = times.get("flamengo");
        
        // cruzeiro
        cruzeiro.addJogador(jogadores.get("matheus"));
        cruzeiro.addJogador(jogadores.get("romero"));
        
        // palmeiras
        palmeiras.addJogador(jogadores.get("dudu"));
        palmeiras.addJogador(jogadores.get("rony"));
        
        // atletico
        atletico.addJogador(jogadores.get("hulk"));
        atletico.addJogador(jogadores.get("paulinho"));
        
        // flamengo
        flamengo.addJogador(jogadores.get("arrascaeta"));
        flamengo.addJogador(jogadores.get("paulinho"));
    
        // verificar se foi add dois jogadores em cada time
        assertEquals(2, cruzeiro.elenco().size());
        assertEquals(2, palmeiras.elenco().size());
        assertEquals(2, atletico.elenco().size());
        assertEquals(2, flamengo.elenco().size());


    }
    
    @Test
    public void verificarNomesDosJogadoresTimes() {
        assertEquals("Matheus" ,jogadores.get("matheus").getNome());
        assertEquals("Romero",jogadores.get("romero").getNome());
        assertEquals("Dudu", jogadores.get("dudu").getNome());
        assertEquals("Rony", jogadores.get("rony").getNome());
        assertEquals("Hulk", jogadores.get("hulk").getNome());
        assertEquals("Paulinho", jogadores.get("paulinho").getNome());
        assertEquals("Arrascaeta",jogadores.get("arrascaeta").getNome());
        assertEquals("Fabricio", jogadores.get("fabricio").getNome());
        
    }
    
    @Test
    public void verificarPosicoesDosJogadoresTimes() {
        // verificar se as posicoes batem
        assertEquals("Meia", jogadores.get("matheus").getPosicao());
        assertEquals("Volante", jogadores.get("romero").getPosicao());
        assertEquals("Atacante", jogadores.get("dudu").getPosicao());
        assertEquals("Atacante",jogadores.get("rony").getPosicao());
        assertEquals("Atacante", jogadores.get("hulk").getPosicao());
        assertEquals("Atacante",jogadores.get("paulinho").getPosicao());
        assertEquals("Meia",jogadores.get("arrascaeta").getPosicao());
        assertEquals("Zagueiro",jogadores.get("fabricio").getPosicao());
    }
    
    @Test
    public void verificarNumeroCamisa() {
        // verificar se as camisas batem
        assertEquals(10, jogadores.get("matheus").getCamisa());
        assertEquals(5, jogadores.get("romero").getCamisa());
        assertEquals(7, jogadores.get("dudu").getCamisa());
        assertEquals(10,jogadores.get("rony").getCamisa());
        assertEquals(10, jogadores.get("hulk").getCamisa());
        assertEquals(9,jogadores.get("paulinho").getCamisa());
        assertEquals(14,jogadores.get("arrascaeta").getCamisa());
        assertEquals(3,jogadores.get("fabricio").getCamisa());
    }
    
}
