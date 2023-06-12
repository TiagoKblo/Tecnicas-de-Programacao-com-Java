public class Produto {
    //atributos
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    //modificadores de acesso
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //métodos que atendem os requisitos
    public void darEntradaNoEstoque(int quantidade){
        this.quantidade += quantidade;
    }
    public void darSaidaDoEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public void imprimir(){
        System.out.println();
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}