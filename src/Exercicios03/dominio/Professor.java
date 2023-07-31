package Exercicios03.dominio;

public class Professor extends Pessoa{
    private String materia;
    private double salario;


    public Professor(String nome, String cpf, String tipoSanguinio, String materia, double salario){
       super(nome, cpf,tipoSanguinio);
       this.materia = materia;
       this.salario = salario;

    }



    public String getMateria() {
        return materia;
    }

    public Double getSalario() {
        return salario;
    }

}
