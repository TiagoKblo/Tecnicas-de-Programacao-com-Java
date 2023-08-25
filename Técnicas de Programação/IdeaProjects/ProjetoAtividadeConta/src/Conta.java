public class Conta {
    private  int idConta;
    private String nomeCliente;
    private String nomeBanco;
    private String nomeAgencia;

    private double saldo;



    public Conta(int idConta, String nomeCliente, String nomeBanco, String nomeAgencia){
        this.idConta = idConta;
        this.nomeCliente = nomeCliente;
        this.nomeBanco = nomeBanco;
        this.nomeAgencia = nomeAgencia;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", nomeBanco='" + nomeBanco + '\'' +
                ", nomeAgencia='" + nomeAgencia + '\'' +
                '}' + '\n';
    }
}
