package org.infnet.tp2teste.repository;

import org.infnet.tp2teste.models.Jogador;
import org.infnet.tp2teste.models.Tecnico;
import org.infnet.tp2teste.models.Time;
import java.util.HashMap;
import java.util.Map;

public class Repository {
    public static Map<String, Time> times = new HashMap<String, Time>();
    public static Map<String, Tecnico> tecnicos = new HashMap<String, Tecnico>();
    public static Map<String, Jogador> jogadores = new HashMap<String, Jogador>();


}
