package Exercicios04.domain;

public class Calculadora {
    //variavel v
        private int tabuada;

    public Calculadora(int tabuada) {
        this.tabuada = tabuada;
    }

    public void imprime() {
        for (int i = 0; i < 11; i++) {
            System.out.println(this.tabuada + " x " + i + " Igual a " + this.tabuada * i);

        }
    }

    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora(5);
        calculadora1.imprime();
    }

}


