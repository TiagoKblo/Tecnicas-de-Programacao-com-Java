package org.example.models;

import org.example.exceptions.ProdutoNaoEncontradoException;

import java.util.ArrayList;

public class Loja {
    ArrayList<Produto> catalogo = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto) {
        catalogo.add(produto);
    }

    public void removerProduto(Produto produto) {
        catalogo.remove(produto);
    }

    public Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) return produto;
        }
        return null;
    }

    public void exibirProduto(int codigo) {
        var produto = buscarProdutoPorCodigo(codigo);
        System.out.println(produto);
    }

    public boolean processarCompra(Carrinho carrinho) {
        for (Produto produto : carrinho.getProdutoList()) {
            var produtoCatalogo = buscarProdutoPorCodigo(produto.getCodigo());
            if (produtoCatalogo == null) {
                new ProdutoNaoEncontradoException().printStackTrace();
                return false;
            }
            if (produtoCatalogo.getQuantidade() <= produto.getQuantidade()) {
                System.out.println("Não há estoque suficiente para o produto " + produto.getNome());
                return false;
            }
            produtoCatalogo.setQuantidade(produtoCatalogo.getQuantidade() - produto.getQuantidade());
        }

        return true;
    }

    public void exibirCatalogo() {
        for (Produto produto : catalogo) {
            System.out.println(produto);
            System.out.println("=".repeat(50));
        }
    }
}
