package Exercicios04.domain;

public class Escola01 {
    private String nome;
    private Professor01[] professores;

    public Escola01(String nome) {
        this.nome = nome;
    }

    public Escola01(String nome, Professor01[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (this.professores == null) return;
        for (Professor01 professor : professores) {
            System.out.println(professor.getNome());
        }
    }









    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor01[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor01[] professores) {
        this.professores = professores;
    }
}
