public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setCodigo(1);
        produto1.setDescricao("Martelo");
        produto1.setPreco(10.0);

        Produto produto2 = new Produto();
        produto2.setCodigo(2);
        produto2.setDescricao("Serrote");
        produto2.setPreco(50.0);

        //Entrada de 15 martelos e saída de 5;
        produto1.darEntradaNoEstoque(15);
        produto1.darSaidaDoEstoque(5);
        produto1.imprimir();

        //Entrada de 20 serrotes
        produto2.darEntradaNoEstoque(20);
        produto2.imprimir();
    }
//Definir dois Produtos, entrada e saída
    //no primeiro. Entrada no segundo e mostrar todos os dados dos dois produtos
}