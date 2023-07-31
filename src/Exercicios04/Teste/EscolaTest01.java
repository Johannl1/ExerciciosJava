package Exercicios04.Teste;

import Exercicios04.domain.Escola01;
import Exercicios04.domain.Professor01;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor01 professor01 = new Professor01("Adolfo");
        Professor01 professor02 = new Professor01("Ferdinando");
        Professor01[] professores = {professor01, professor02};


        Escola01 escola = new Escola01("Josefildo aldo", professores);

        escola.imprime();





    }
}
