package org.example.models;

public class ProdutoDigital extends Produto {

    private String formato;
    private int tamImagem;

    public ProdutoDigital(int codigo, String nome, String descricao, double preco, int quantidade) {
        super(codigo, nome, descricao, preco, quantidade);
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamImagem() {
        return tamImagem;
    }

    public void setTamImagem(int tamImagem) {
        this.tamImagem = tamImagem;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Formato" + this.getFormato() + "\n" +
                "Tamanho " + this.getTamImagem() + "\n";
    }
}
