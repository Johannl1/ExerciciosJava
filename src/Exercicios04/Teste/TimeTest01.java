package Exercicios04.Teste;

import Exercicios04.domain.Jogador;
import Exercicios04.domain.Time;

public class TimeTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador[] jogadores = {jogador};
        Time time = new Time("Selecao Brasileira");


        jogador.setTime( time);
        time.setJogadores(jogadores);

        time.imprime();





    }


}
