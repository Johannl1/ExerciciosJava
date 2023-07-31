package Exercicios03.Test;

import Exercicios03.dominio.*;



public class EscolaTest01 {
    public static void main(String[] args) {
        Endereco enderecoProfessor = new Endereco();
        enderecoProfessor.setBairro("Sao caetano");
        enderecoProfessor.setCep("2754812890");
        enderecoProfessor.setNumero(12);
        enderecoProfessor.setRua("Rua das laranjeiras");

        Endereco enderecoAluno = new Endereco();
        enderecoAluno.setBairro("aqui perto");
        enderecoAluno.setRua("Na pqp");
        enderecoAluno.setCep("2904718925");
        enderecoAluno.setNumero(200);

        Endereco enderecoEscola = new Endereco();
        enderecoEscola.setBairro("logo ali");
        enderecoEscola.setCep("471274");
        enderecoEscola.setRua("aqui");
        enderecoEscola.setNumero(455);

        Professor professor = new Professor("Joao", "5786189578901","O-", "Matematica", 2000);
        professor.setEndereco(enderecoProfessor);


        Professor[] professores = {professor};

        Aluno aluno = new Aluno("Fernando","9210418902", "ab-", "578912389051", "20");
        aluno.setEndereco(enderecoAluno);
        Aluno[] alunos = {aluno};


        Escola escola = new Escola("Sao Caetano",enderecoEscola, professores, alunos);


        escola.imprime();




    }
}
