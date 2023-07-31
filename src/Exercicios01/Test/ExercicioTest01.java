package Exercicios01.Test;

import Exercicios01.domain.ExerciciosIFeIFElse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExercicioTest01 {
    @Test
    void DevValidarPessoaMaiorIdade() {
        ExerciciosIFeIFElse exerc = new ExerciciosIFeIFElse("Fernando", 18);
        String resultado = exerc.imprime();
        Assertions.assertEquals("Fernando e maior de idade", resultado);
    }

    @Test
    void DevValidarPessoaMenorIdade() {
        ExerciciosIFeIFElse exerc1 = new ExerciciosIFeIFElse("Fernando", 17);
        String resultado2 = exerc1.imprime();
        Assertions.assertEquals("Fernando e menor de idade", resultado2);
    }
}
