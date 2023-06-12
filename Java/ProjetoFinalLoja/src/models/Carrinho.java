package models;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao carrinho.");
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            produtos.add(produto);
        }
        System.out.println(quantidade + " unidades do produto adicionadas ao carrinho.");
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido do carrinho.");
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

    public Produto getProdutoByCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
}
