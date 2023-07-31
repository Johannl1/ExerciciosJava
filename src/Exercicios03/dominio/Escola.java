package Exercicios03.dominio;

public class Escola {
    private String nome;
    private Endereco endereco;
    private Professor[] professores;
    private Aluno[] alunos;

    public Escola(String nome, Endereco endereco, Professor[] professores, Aluno[] alunos) {
        this.nome = nome;
        this.endereco = endereco;
        this.professores = professores;
        this.alunos = alunos;
    }
    public void imprimeProfessor() {
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("CPF: " + professor.getCpf());
            System.out.println("Bairro: " + professor.getEndereco().getBairro());
            System.out.println("CEP: " + professor.getEndereco().getCep());
            System.out.println("Rua: " + professor.getEndereco().getRua());
            System.out.println("Numero: " + professor.getEndereco().getNumero());
            System.out.println("Tipo sanguineo: " + professor.getTipoSanguinio());
            System.out.println("Materia: " + professor.getMateria());
            System.out.println("salario: " + professor.getSalario());
        }
    }
        public void imprimeAluno(){
            for (Aluno aluno: alunos){
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Bairro: " + aluno.endereco.getBairro());
                System.out.println("CEP: " + aluno.getEndereco().getCep());
                System.out.println("Rua: " + aluno.getEndereco().getRua());
                System.out.println("Numero: " + aluno.getEndereco().getNumero());
                System.out.println("Tipo sanguineo: " + aluno.getTipoSanguinio());
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Turma: " + aluno.getTurma());
            }


        }

    public void imprime() {

        System.out.println("--Escola---");
        System.out.println(this.nome);
        System.out.println(this.endereco.getBairro() + " " + this.endereco.getCep() + " " + this.endereco.getRua() + " " + this.endereco.getNumero());
        System.out.println("---Professor---");
        imprimeProfessor();
        System.out.println("---Aluno---");
        imprimeAluno();

        }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
