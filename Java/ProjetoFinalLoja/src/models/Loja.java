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
        System.out.println("Produto adicionado ao catálogo.");
    }

    public Produto getProdutoByCodigo(int codigo) throws ProdutoNaoEncontradoException {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado na loja.");
    }

    public void exibirInformacoesProduto(int codigo) throws ProdutoNaoEncontradoException {
        for (Produto produto : catalogo) {
            if (produto.getCodigo() == codigo) {
                produto.exibirInformacoes();
                return;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado na loja.");
    }

    public void exibirProdutos() {
        System.out.println("Produtos disponíveis na loja:");
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
                    System.out.println("Não há estoque suficiente para atender ao pedido.");
                }
                return;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto não encontrado na loja.");
    }

    public void gerarRelatorioProdutos() {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : catalogo) {
            produto.exibirInformacoes();
            System.out.println("------------------------------");
        }
    }
}

