package models;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String nome, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
