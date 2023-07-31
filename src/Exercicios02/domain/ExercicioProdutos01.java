package Exercicios02.domain;

import Exercicios01.domain.ExerciciosIFeIFElse;

public class ExercicioProdutos01 {
    private String nome;
    private double preco;
    private int quantidade;

    public ExercicioProdutos01(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotal() {
        if (this.quantidade > 0) {
            return this.quantidade * this.preco;
        }else return 0;
    }

    public double desconto(){
        if(this.quantidade <= 10){return valorTotal();
        }else if(this.quantidade >= 11 && this.quantidade <= 20){return valorTotal()*0.1;
        }else if(this.quantidade > 20 && this.quantidade < 50){return valorTotal()*0.2;
        }else{return valorTotal()*0.25;}
    }
    public double valorTotalDesconto() {
        if (valorTotal() > 0) {
            return valorTotal() - desconto();
        } else {return 0;}


    }


        public void imprime () {
            System.out.println("---------------");
            System.out.println("Produto Comprado: " + this.nome);
            System.out.println("Preco do produto: " + this.preco);
            System.out.println("Quantidade de produto: " + this.quantidade);
            System.out.println("Valor desconto: " + desconto());
            System.out.println("Valor total pago: " + valorTotalDesconto());

        }
    }

