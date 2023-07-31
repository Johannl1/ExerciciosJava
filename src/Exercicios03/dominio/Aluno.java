package Exercicios03.dominio;

public class Aluno extends Pessoa{
    private String matricula;
    private String turma;

   public Aluno(String nome, String cpf, String tipoSanguinio, String matricula, String turma){
       super(nome, cpf, tipoSanguinio);
       this.matricula = matricula;
       this.turma = turma;
   }





    public void imprime(){
        super.imprime();
        System.out.println(this.matricula);
        System.out.println(this.turma);

    }



    public String getMatricula() {
        return matricula;
    }

    public String getTurma() {
        return turma;
    }

}
