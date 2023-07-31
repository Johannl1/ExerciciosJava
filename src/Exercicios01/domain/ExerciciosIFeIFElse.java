package Exercicios01.domain;

public class ExerciciosIFeIFElse {
    private String nome;
    private int idade;

    public ExerciciosIFeIFElse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String imprime() {
        System.out.println("Idade: " + this.idade);
        if (this.idade >= 18) {
            System.out.println("Fernando e maior de idade");
            return this.nome + " e maior de idade";
        } else {
            System.out.println("Fernando e menor de idade");
            return this.nome + " e menor de idade";
        }
    }
}









