package models;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> catalogo;

    public Loja() {
        catalogo = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        catalogo.add(produto);
        System.out.println("Produto adicionado ao cat�logo.");
    }

    public Produto getProdutoByCodigo(int codigo) throws ProdutoNaoEncontradoException {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto n�o encontrado na loja.");
    }

    public void exibirInformacoesProduto(int codigo) throws ProdutoNaoEncontradoException {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) {
                produto.exibirInformacoes();
                return;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto n�o encontrado na loja.");
    }

    public void exibirProdutos() {
        System.out.println("Produtos dispon�veis na loja:");
        for (Produto produto : catalogo) {
            System.out.println(produto.getNome());
        }
    }

    public void processarPedido(int codigo, int quantidade) throws ProdutoNaoEncontradoException {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) {
                int estoqueAtual = produto.getQuantidadeEmEstoque();
                if (estoqueAtual >= quantidade) {
                    produto.setQuantidadeEmEstoque(estoqueAtual - quantidade);
                    System.out.println("Pedido processado com sucesso.");
                } else {
                    System.out.println("N�o h� estoque suficiente para atender ao pedido.");
                }
                return;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto n�o encontrado na loja.");
    }

    public void gerarRelatorioProdutos() {
        System.out.println("Relat�rio de Produtos:");
        for (Produto produto : catalogo) {
            produto.exibirInformacoes();
            System.out.println("------------------------------");
        }
    }
}

