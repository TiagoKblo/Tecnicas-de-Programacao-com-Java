package models;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);
        // Pré-cadastro de produtos físicos
        ProdutoFisico produtoFisico1 = new ProdutoFisico(1, "Camiseta", "Camiseta de algodão", 29.90, 10, 0.2, "G");
        ProdutoFisico produtoFisico2 = new ProdutoFisico(2, "Calça Jeans", "Calça jeans slim", 99.90, 5, 0.5, "M");
        ProdutoFisico produtoFisico3 = new ProdutoFisico(3, "Tênis", "Tênis para corrida", 199.90, 8, 0.3, "40");
        ProdutoFisico produtoFisico4 = new ProdutoFisico(4, "Jaqueta", "Jaqueta de couro sintético", 149.90, 3, 0.8, "P");
        ProdutoFisico produtoFisico5 = new ProdutoFisico(5, "Saia", "Saia midi plissada", 79.90, 6, 0.4, "G");

        loja.adicionarProduto(produtoFisico1);
        loja.adicionarProduto(produtoFisico2);
        loja.adicionarProduto(produtoFisico3);
        loja.adicionarProduto(produtoFisico4);
        loja.adicionarProduto(produtoFisico5);

        // Pré-cadastro de produtos digitais
        ProdutoDigital produtoDigital1 = new ProdutoDigital(6, "Ebook", "Livro digital em formato PDF", 19.90, 100, "PDF", 10.0);
        ProdutoDigital produtoDigital2 = new ProdutoDigital(7, "Música", "Álbum de música em formato MP3", 9.90, 50, "MP3", 5.0);
        ProdutoDigital produtoDigital3 = new ProdutoDigital(8, "Filme", "Filme em formato digital HD", 29.90, 200, "HD", 1.2);
        ProdutoDigital produtoDigital4 = new ProdutoDigital(9, "Software", "Software de edição de imagens", 149.90, 20, "EXE", 0.5);
        ProdutoDigital produtoDigital5 = new ProdutoDigital(10, "Curso Online", "Curso online em vídeoaulas", 99.90, 80, "MP4", 2.0);

        loja.adicionarProduto(produtoDigital1);
        loja.adicionarProduto(produtoDigital2);
        loja.adicionarProduto(produtoDigital3);
        loja.adicionarProduto(produtoDigital4);
        loja.adicionarProduto(produtoDigital5);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Gerenciamento de Produtos");
            System.out.println("2. Funcionalidades para Consumidor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuGerenciamentoProdutos(loja, scanner);
                    break;
                case 2:
                    menuFuncionalidadesConsumidor(loja, carrinho, scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void menuGerenciamentoProdutos(Loja loja, Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n===== MENU - Gerenciamento de Produtos =====");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Exibir Informações de um Produto");
            System.out.println("3. Gerar Relatório de Produtos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto(loja, scanner);
                    break;
                case 2:
                    exibirInformacoesProduto(loja, scanner);
                    break;
                case 3:
                    gerarRelatorioProdutos(loja);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void menuFuncionalidadesConsumidor(Loja loja, Carrinho carrinho, Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n===== MENU - Funcionalidades para Consumidor =====");
            System.out.println("1. Adicionar Produto ao Carrinho");
            System.out.println("2. Remover Produto do Carrinho");
            System.out.println("3. Calcular Valor Total da Compra");
            System.out.println("4. Exibir Produtos Disponíveis");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProdutoCarrinho(loja, carrinho, scanner);
                    break;
                case 2:
                    removerProdutoCarrinho(carrinho, scanner);
                    break;
                case 3:
                    calcularValorTotal(carrinho);
                    break;
                case 4:
                    exibirProdutosDisponiveis(loja);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirProdutosDisponiveis(Loja loja) {
        System.out.println("\n===== Produtos Disponíveis =====");
        loja.exibirProdutos();
    }


    public static void cadastrarProduto(Loja loja, Scanner scanner) {
        System.out.print("\nCódigo do Produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Nome do Produto: ");
        String nome = scanner.next();

        System.out.print("Descrição do Produto: ");
        String descricao = scanner.next();

        double preco;
        while (true) {
            System.out.print("Preço do Produto: ");
            if (scanner.hasNextDouble()) {
                preco = scanner.nextDouble();
                break;
            } else {
                System.out.println("Valor inválido. Insira um número válido para o preço.");
                scanner.next(); // Descarta o valor inválido do scanner
            }
        }

        System.out.print("Quantidade em Estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(codigo, nome, descricao, preco, quantidade);
        loja.adicionarProduto(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }


    private static void exibirInformacoesProduto(Loja loja, Scanner scanner) {
        System.out.print("\nCódigo do Produto: ");
        int codigo = scanner.nextInt();

        try {
            loja.exibirInformacoesProduto(codigo);
        } catch (ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void adicionarProdutoCarrinho(Loja loja, Carrinho carrinho, Scanner scanner) {
        System.out.print("\nCódigo do Produto: ");
        int codigo = scanner.nextInt();

        try {
            loja.exibirInformacoesProduto(codigo);

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            Produto produto = loja.getProdutoByCodigo(codigo);
            carrinho.adicionarProduto(produto, quantidade);
        } catch (ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removerProdutoCarrinho(Carrinho carrinho, Scanner scanner) {
        System.out.print("\nCódigo do Produto: ");
        int codigo = scanner.nextInt();

        Produto produto = carrinho.getProdutoByCodigo(codigo);
        if (produto != null) {
            carrinho.removerProduto(produto);
            System.out.println("Produto removido do carrinho.");
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }


    private static void calcularValorTotal(Carrinho carrinho) {
        double valorTotal = carrinho.calcularValorTotal();
        System.out.println("\nValor total da compra: R$" + valorTotal);
    }

    private static void gerarRelatorioProdutos(Loja loja) {
        loja.gerarRelatorioProdutos();
    }
}
