public class Apolice {

    private String nomeAssegurado;
    private int idade;
    private float valorPremio;

    public String getNomeAssegurado() {
        return nomeAssegurado;
    }

    public void setNomeAssegurado(String nomeAssegurado) {
        this.nomeAssegurado = nomeAssegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir() {
        System.out.println("Nome do Assegurado: " + nomeAssegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do Prêmio: " + valorPremio);
    }

}