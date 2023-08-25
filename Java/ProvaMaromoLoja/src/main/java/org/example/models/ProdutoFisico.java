package org.example.models;

public class ProdutoFisico extends Produto {
    private String peso;
    private String dimensoes;

    public ProdutoFisico(int codigo, String nome, String descricao, double preco, int quantidade, String peso, String dimensoes) {
        super(codigo, nome, descricao, preco, quantidade);
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Peso: " + this.getPeso() + "\n" +
                "Dimensões: " + this.getDimensoes() + "\n";
    }
}


