package Exercicios03.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String tipoSanguinio;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf,String tipoSanguinio){
        this.nome = nome;
        this.cpf = cpf;
        this.tipoSanguinio = tipoSanguinio;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.tipoSanguinio);
        System.out.println(this.endereco.getBairro() + " " + this.endereco.getCep() + " " + this.endereco.getRua() + " " + this.endereco.getNumero());

    }






    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipoSanguinio() {
        return tipoSanguinio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
